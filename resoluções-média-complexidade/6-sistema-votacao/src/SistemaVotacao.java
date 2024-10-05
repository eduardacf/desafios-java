import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaVotacao {
    private Map<String, Eleitor> eleitores;
    private List<Candidato> candidatos;
    private int tentativasLogin;

    public SistemaVotacao() {
        this.eleitores = new HashMap<>();
        this.candidatos = new ArrayList<>();
        this.tentativasLogin = 0;
    }

    // Método para adicionar eleitores
    public void adicionarEleitor(Eleitor eleitor) {
        eleitores.put(eleitor.getId(), eleitor);
    }

    // Método para adicionar candidatos
    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    // Método de login
    public String login(String idEleitor) {
        if (tentativasLogin >= 3) {
            return "Usuário bloqueado após três tentativas de login falhas.";
        }

        Eleitor eleitor = eleitores.get(idEleitor);
        if (eleitor != null) {
            tentativasLogin = 0;
            return "Login bem-sucedido.";
        } else {
            tentativasLogin++;
            return "ID inválido. Tentativa " + tentativasLogin + " de 3.";
        }
    }

    // Método de votação
    public String votar(String idEleitor, String nomeCandidato) {
        Eleitor eleitor = eleitores.get(idEleitor);
        if (eleitor == null) {
            return "Eleitor não encontrado.";
        }

        if (eleitor.hasVoted()) {
            return "Você já votou. Não é possível votar novamente.";
        }

        Candidato candidato = null;
        for (int i = 0; i < candidatos.size(); i++) {
            if (candidatos.get(i).getNome().equals(nomeCandidato)) {
                candidato = candidatos.get(i);
                break;
            }
        }

        if (candidato == null) {
            return "Candidato não encontrado.";
        }

        eleitor.setHasVoted(true);
        candidato.adicionarVoto();
        return "Você selecionou o " + nomeCandidato + ".";
    }

    // Método de confirmação de voto
    public String confirmarVoto(boolean confirmacao) {
        if (confirmacao) {
            return "Seu voto foi registrado com sucesso.";
        } else {
            return "Erro ao registrar o voto. Tente novamente.";
        }
    }

    // Método para contar votos
    public String contarVotos() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < candidatos.size(); i++) {
            Candidato candidato = candidatos.get(i);
            resultado.append(candidato.getNome()).append(": ").append(candidato.getVotos()).append(" votos\n");
        }
        return resultado.toString();
    }
}
