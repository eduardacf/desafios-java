import java.util.ArrayList;
import java.util.List;

public class GerenciamentoAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    // Método para adicionar um novo aluno
    public String adicionarAluno(String nome, int idade, String matricula) {
        alunos.add(new Aluno(nome, idade, matricula));
        return "Aluno adicionado com sucesso: " + nome;
    }

    // Método para remover um aluno pela matrícula
    public String removerAluno(String matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                alunos.remove(i);
                return "Aluno removido com sucesso: " + matricula;
            }
        }
        return "Aluno não encontrado: " + matricula;
    }

    // Método para buscar um aluno pela matrícula
    public String buscarAluno(String matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                return alunos.get(i).toString();
            }
        }
        return "Aluno não encontrado: " + matricula;
    }

    // Método para listar todos os alunos
    public String listarTodosAlunos() {
        if (alunos.isEmpty()) {
            return "Nenhum aluno encontrado.";
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < alunos.size(); i++) {
            resultado.append(alunos.get(i).toString()).append("\n");
        }
        return resultado.toString();
    }
}

