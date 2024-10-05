import java.util.*;

public class Sistema {
    private List<Curso> cursos;
    private List<Aluno> alunos;
    private List<Matricula> matriculas;

    public Sistema() {
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.matriculas = new ArrayList<>();
    }

    // Adicionar Curso
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso adicionado com sucesso.");
    }

    // Remover Curso
    public void removerCurso(String cursoId) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId().equals(cursoId)) {
                cursos.remove(i);
                System.out.println("Curso removido com sucesso.");
                return;
            }
        }
        System.out.println("Curso não encontrado.");
    }

    // Atualizar Curso
    public void atualizarCurso(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId().equals(curso.getId())) {
                cursos.set(i, curso);
                System.out.println("Curso atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Curso não encontrado.");
    }

    // Adicionar Aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso.");
    }

    // Remover Aluno
    public void removerAluno(String alunoId) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(alunoId)) {
                alunos.remove(i);
                System.out.println("Aluno removido com sucesso.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    // Atualizar Aluno
    public void atualizarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(aluno.getId())) {
                alunos.set(i, aluno);
                System.out.println("Aluno atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    // Registrar Matrícula
    public void registrarMatricula(String alunoId, String cursoId) {
        Aluno aluno = null;
        Curso curso = null;

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(alunoId)) {
                aluno = alunos.get(i);
                break;
            }
        }

        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getId().equals(cursoId)) {
                curso = cursos.get(i);
                break;
            }
        }

        if (aluno == null || curso == null) {
            System.out.println("Aluno ou Curso não encontrado.");
            return;
        }

        List<Curso> cursosMatriculados = aluno.getCursosMatriculados();
        for (int i = 0; i < cursosMatriculados.size(); i++) {
            if (cursosMatriculados.get(i).getId().equals(cursoId)) {
                System.out.println("Aluno já está matriculado neste curso.");
                return;
            }
        }

        Matricula matricula = new Matricula(UUID.randomUUID().toString(), aluno, curso, new Date());
        matriculas.add(matricula);
        aluno.matricularCurso(curso);
        curso.adicionarAluno(aluno);
        System.out.println("Matrícula registrada com sucesso.");
    }

    // Cancelar Matrícula
    public void cancelarMatricula(String matriculaId) {
        for (int i = 0; i < matriculas.size(); i++) {
            if (matriculas.get(i).getId().equals(matriculaId)) {
                Matricula matricula = matriculas.remove(i);
                Aluno aluno = matricula.getAluno();
                Curso curso = matricula.getCurso();
                aluno.cancelarMatricula(curso);
                curso.removerAluno(aluno);
                System.out.println("Matrícula cancelada com sucesso.");
                return;
            }
        }
        System.out.println("Matrícula não encontrada.");
    }

    // Listar Cursos de um Aluno
    public List<Curso> listarCursosPorAluno(String alunoId) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(alunoId)) {
                return alunos.get(i).getCursosMatriculados();
            }
        }
        return Collections.emptyList();
    }

    // Gerar Relatório de Alunos por Curso
    public void gerarRelatorioDeAlunosPorCurso() {
        for (int i = 0; i < cursos.size(); i++) {
            Curso curso = cursos.get(i);
            System.out.println("Curso: " + curso.getTitulo());
            List<Aluno> alunosMatriculados = curso.getAlunosMatriculados();
            for (int j = 0; j < alunosMatriculados.size(); j++) {
                Aluno aluno = alunosMatriculados.get(j);
                System.out.println(" - Aluno: " + aluno.getNome());
            }
        }
    }
}
