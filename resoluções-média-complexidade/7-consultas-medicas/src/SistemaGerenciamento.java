import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamento {
    private List<Medico> medicos;
    private List<Paciente> pacientes;
    private List<Consulta> consultas;

    public SistemaGerenciamento() {
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    // Métodos para gerenciar médicos
    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico adicionado com sucesso.");
    }

    public void removerMedico(Medico medico) {
        medicos.remove(medico);
        System.out.println("Médico removido com sucesso.");
    }

    public void atualizarMedico(Medico medico) {
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getId().equals(medico.getId())) {
                medicos.set(i, medico);
                System.out.println("Médico atualizado com sucesso.");
                return;
            }
        }
    }

    public List<Medico> listarMedicosPorEspecialidade(String especialidade) {
        List<Medico> resultado = new ArrayList<>();
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getEspecialidade().equals(especialidade)) {
                resultado.add(medicos.get(i));
            }
        }
        return resultado;
    }

    public boolean verificarDisponibilidadeMedico(String medicoId, String dataHora) {
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getId().equals(medicoId)) {
                List<Consulta> consultasAgendadas = medicos.get(i).getConsultasAgendadas();
                for (int j = 0; j < consultasAgendadas.size(); j++) {
                    if (consultasAgendadas.get(j).getDataHora().equals(dataHora)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // Métodos para gerenciar pacientes
    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso.");
    }

    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
        System.out.println("Paciente removido com sucesso.");
    }

    public void atualizarPaciente(Paciente paciente) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getId().equals(paciente.getId())) {
                pacientes.set(i, paciente);
                System.out.println("Paciente atualizado com sucesso.");
                return;
            }
        }
    }

    public List<Paciente> listarTodosOsPacientes() {
        return pacientes;
    }

    public List<Consulta> listarConsultasPorPaciente(String pacienteId) {
        List<Consulta> resultado = new ArrayList<>();
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getPaciente().getId().equals(pacienteId)) {
                resultado.add(consultas.get(i));
            }
        }
        return resultado;
    }

    // Métodos para gerenciar consultas
    public void agendarConsulta(String medicoId, String pacienteId, String dataHora) {
        Medico medico = null;
        Paciente paciente = null;
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getId().equals(medicoId)) {
                medico = medicos.get(i);
                break;
            }
        }
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getId().equals(pacienteId)) {
                paciente = pacientes.get(i);
                break;
            }
        }
        if (medico != null && paciente != null && verificarDisponibilidadeMedico(medicoId, dataHora)) {
            Consulta consulta = new Consulta(String.valueOf(consultas.size() + 1), medico, paciente, dataHora, "agendada");
            consultas.add(consulta);
            medico.adicionarConsulta(consulta);
            paciente.adicionarConsulta(consulta);
            System.out.println("Consulta agendada com sucesso.");
        } else {
            System.out.println("Não foi possível agendar a consulta.");
        }
    }

    public void cancelarConsulta(String consultaId) {
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getId().equals(consultaId)) {
                consultas.get(i).setStatus("cancelada");
                System.out.println("Consulta cancelada com sucesso.");
                return;
            }
        }
    }

    public void marcarConsultaComoRealizada(String consultaId) {
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getId().equals(consultaId)) {
                consultas.get(i).setStatus("realizada");
                System.out.println("Consulta marcada como realizada com sucesso.");
                return;
            }
        }
    }

    public List<Consulta> listarConsultasPorMedico(String medicoId) {
        List<Consulta> resultado = new ArrayList<>();
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getMedico().getId().equals(medicoId)) {
                resultado.add(consultas.get(i));
            }
        }
        return resultado;
    }

    public List<Consulta> listarConsultasPorStatus(String status) {
        List<Consulta> resultado = new ArrayList<>();
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getStatus().equals(status)) {
                resultado.add(consultas.get(i));
            }
        }
        return resultado;
    }
}
