import java.util.Date;

public class Matricula {
    private String id;
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;

    public Matricula(String id, Aluno aluno, Curso curso, Date dataMatricula) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

    // Getters e Setters
    public String getId() { return id; }
    public Aluno getAluno() { return aluno; }
    public Curso getCurso() { return curso; }
    public Date getDataMatricula() { return dataMatricula; }
}
