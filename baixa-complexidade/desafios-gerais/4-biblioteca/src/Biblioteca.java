import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca() {
        // Adicionando livros existentes
        livros.add(new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", 10, 49.99));
        livros.add(new Livro(2, "1984", "George Orwell", 8, 39.99));
        livros.add(new Livro(3, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 15, 29.99));
        livros.add(new Livro(4, "Dom Quixote", "Miguel de Cervantes", 5, 59.99));
        livros.add(new Livro(5, "Moby Dick", "Herman Melville", 7, 44.99));
    }

    public String adicionarLivro(int id, String titulo, String autor, int quantidade, double preco) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).id == id) {
                return "{\"erro\": \"Livro com este ID já existe.\"}";
            }
        }
        livros.add(new Livro(id, titulo, autor, quantidade, preco));
        return "{\"mensagem\": \"Livro adicionado com sucesso. Quantidade atual: " + quantidade + "\"}";
    }

    public String emprestarLivro(int id, int quantidade) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.id == id) {
                if (livro.quantidade < quantidade) {
                    return "{\"erro\": \"Quantidade insuficiente no acervo.\"}";
                }
                livro.quantidade = livro.quantidade - quantidade;
                return "{\"mensagem\": \"Empréstimo realizado com sucesso. Quantidade atual: " + livro.quantidade + "\"}";
            }
        }
        return "{\"erro\": \"Livro não encontrado.\"}";
    }

    public String devolverLivro(int id, int quantidade) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.id == id) {
                livro.quantidade = livro.quantidade + quantidade;
                return "{\"mensagem\": \"Devolução realizada com sucesso. Quantidade atual: " + livro.quantidade + "\"}";
            }
        }
        return "{\"erro\": \"Livro não encontrado.\"}";
    }

    public String calcularValorTotalAcervo() {
        double valorTotal = 0;
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            valorTotal = valorTotal + (livro.quantidade * livro.preco);
        }
        return "{\"valorTotal\": " + valorTotal + "}";
    }
}