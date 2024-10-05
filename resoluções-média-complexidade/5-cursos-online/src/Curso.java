import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String titulo;
    private String descricao;
    private int duracao;
    private List<Aluno> alunosMatriculados;

    public Curso(String id, String titulo, String descricao, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
        this.alunosMatriculados = new ArrayList<>();
    }

    // Getters e Setters
    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public int getDuracao() { return duracao; }
    public List<Aluno> getAlunosMatriculados() { return alunosMatriculados; }

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }
}
