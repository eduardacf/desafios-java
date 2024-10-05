import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String id;
    private String nome;
    private String especialidade;
    private String email;
    private List<Consulta> consultasAgendadas;

    public Medico(String id, String nome, String especialidade, String email) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.email = email;
        this.consultasAgendadas = new ArrayList<>();
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getEmail() {
        return email;
    }

    public List<Consulta> getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultasAgendadas.add(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        consultasAgendadas.remove(consulta);
    }
}
