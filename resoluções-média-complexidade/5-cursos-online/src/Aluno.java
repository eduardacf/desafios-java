import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String id;
    private String nome;
    private String email;
    private List<Curso> cursosMatriculados;

    public Aluno(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cursosMatriculados = new ArrayList<>();
    }

    // Getters e Setters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public List<Curso> getCursosMatriculados() { return cursosMatriculados; }

    public void matricularCurso(Curso curso) {
        cursosMatriculados.add(curso);
    }

    public void cancelarMatricula(Curso curso) {
        cursosMatriculados.remove(curso);
    }
}
