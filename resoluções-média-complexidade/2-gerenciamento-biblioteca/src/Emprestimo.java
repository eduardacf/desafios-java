import java.time.LocalDate;

public class Emprestimo {
    int idMembro;
    int idLivro;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;

    public Emprestimo(int idMembro, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.idMembro = idMembro;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}
