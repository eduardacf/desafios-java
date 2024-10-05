import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    // Método para adicionar um novo livro
    public String adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
        return "Livro adicionado com sucesso: " + titulo;
    }

    // Método para remover um livro pelo título
    public String removerLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                return "Livro removido com sucesso: " + titulo;
            }
        }
        return "Livro não encontrado: " + titulo;
    }

    // Método para buscar um livro pelo título
    public String buscarLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return livros.get(i).toString();
            }
        }
        return "Livro não encontrado: " + titulo;
    }

    // Método para listar todos os livros
    public String listarTodosLivros() {
        if (livros.isEmpty()) {
            return "Nenhum livro encontrado.";
        }
        String[] resultado = new String[livros.size()];
        for (int i = 0; i < livros.size(); i++) {
            resultado[i] = livros.get(i).toString();
        }
        return String.join("\n", resultado);
    }
}
