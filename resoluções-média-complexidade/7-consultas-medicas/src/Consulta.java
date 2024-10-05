public class Consulta {
    private String id;
    private Medico medico;
    private Paciente paciente;
    private String dataHora;
    private String status;

    public Consulta(String id, Medico medico, Paciente paciente, String dataHora, String status) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.status = status;
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

