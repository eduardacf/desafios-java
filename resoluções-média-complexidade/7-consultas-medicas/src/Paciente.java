import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private List<Consulta> consultasAgendadas;

    public Paciente(String id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.consultasAgendadas = new ArrayList<>();
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
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

