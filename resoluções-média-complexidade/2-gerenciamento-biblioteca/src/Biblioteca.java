import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros;
    List<Membro> membros;
    List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        membros = new ArrayList<>();
        emprestimos = new ArrayList<>();

        livros.add(new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", true));
        livros.add(new Livro(2, "1984", "George Orwell", "Distopia", false));
        livros.add(new Livro(3, "Dom Quixote", "Miguel de Cervantes", "Clássico", true));
        livros.add(new Livro(4, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Infantil", true));
        livros.add(new Livro(5, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia", false));

        membros.add(new Membro(1, "Alice", 1));
        membros.add(new Membro(2, "Bob", 0));
        membros.add(new Membro(3, "Carol", 2));
        membros.add(new Membro(4, "Dave", 0));
        membros.add(new Membro(5, "Eve", 1));
    }

    public String emprestarLivro(int idMembro, int idLivro) {
        Membro membro = encontrarMembroPorId(idMembro);
        Livro livro = encontrarLivroPorId(idLivro);

        if (membro == null) {
            return "Membro não encontrado";
        }

        if (livro == null) {
            return "Livro não encontrado";
        }

        if (!livro.disponivel) {
            return "Livro não disponível";
        }

        if (membro.livrosEmprestados >= 2) {
            return "Membro já possui 2 livros emprestados";
        }

        livro.disponivel = false;
        membro.livrosEmprestados++;
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(14);
        emprestimos.add(new Emprestimo(idMembro, idLivro, dataEmprestimo, dataDevolucao));

        return "Empréstimo realizado com sucesso. Data de devolução: " + dataDevolucao;
    }

    public String devolverLivro(int idMembro, int idLivro) {
        Membro membro = encontrarMembroPorId(idMembro);
        Livro livro = encontrarLivroPorId(idLivro);

        if (membro == null) {
            return "Membro não encontrado";
        }

        if (livro == null) {
            return "Livro não encontrado";
        }

        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo emprestimo = emprestimos.get(i);
            if (emprestimo.idMembro == idMembro && emprestimo.idLivro == idLivro) {
                emprestimos.remove(i);
                livro.disponivel = true;
                membro.livrosEmprestados--;
                return "Devolução realizada com sucesso. Livro disponível para empréstimo.";
            }
        }

        return "Livro não foi emprestado por este membro";
    }

    public List<Livro> consultarLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.disponivel) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public List<Membro> consultarMembros() {
        return membros;
    }

    private Membro encontrarMembroPorId(int id) {
        for (int i = 0; i < membros.size(); i++) {
            Membro membro = membros.get(i);
            if (membro.id == id) {
                return membro;
            }
        }
        return null;
    }

    private Livro encontrarLivroPorId(int id) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.id == id) {
                return livro;
            }
        }
        return null;
    }
}

