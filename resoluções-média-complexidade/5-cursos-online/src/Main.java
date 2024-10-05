import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar instância do sistema
        Sistema sistema = new Sistema();

        // Exemplo 1: Adicionar Curso
        Curso curso1 = new Curso("1", "Java Básico", "Curso introdutório de Java", 40);
        sistema.adicionarCurso(curso1);

        // Exemplo 2: Adicionar Aluno
        Aluno aluno1 = new Aluno("1", "João Silva", "joao.silva@example.com");
        sistema.adicionarAluno(aluno1);

        // Exemplo 3: Registrar Matrícula
        sistema.registrarMatricula("1", "1");

        // Exemplo 4: Listar Cursos de um Aluno
        List<Curso> cursosDoAluno = sistema.listarCursosPorAluno("1");
        for (int i = 0; i < cursosDoAluno.size(); i++) {
            System.out.println(cursosDoAluno.get(i).getTitulo());
        }

        // Exemplo 5: Gerar Relatório de Alunos por Curso
        sistema.gerarRelatorioDeAlunosPorCurso();
    }
}
