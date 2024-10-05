import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaGerenciamento sistema = new SistemaGerenciamento();

        // Adicionar médicos
        Medico medico1 = new Medico("1", "Dr. João Silva", "Cardiologia", "joao.silva@example.com");
        sistema.adicionarMedico(medico1);

        // Adicionar pacientes
        Paciente paciente1 = new Paciente("1", "Maria Oliveira", "maria.oliveira@example.com", "123456789");
        sistema.adicionarPaciente(paciente1);

        // Agendar consulta
        sistema.agendarConsulta("1", "1", "2023-05-01 10:00");

        // Listar consultas de um médico
        List<Consulta> consultasDoMedico = sistema.listarConsultasPorMedico("1");
        for (int i = 0; i < consultasDoMedico.size(); i++) {
            System.out.println(consultasDoMedico.get(i).getDataHora());
        }

        // Marcar consulta como realizada
        sistema.marcarConsultaComoRealizada("1");

        // Cancelar consulta
        sistema.cancelarConsulta("1");
    }
}
