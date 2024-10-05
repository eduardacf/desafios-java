public class Main {
    public static void main(String[] args) {
        // Criação da instância do cinema
        Cinema cinema = new Cinema();

        // Teste de reserva de ingressos válida
        String resultadoReservaValida = cinema.reservarIngressos(1, 3, 4);
        System.out.println("Resultado da reserva válida: " + resultadoReservaValida);

        // Teste de reserva de ingressos inválida (excede o limite permitido)
        String resultadoReservaInvalida = cinema.reservarIngressos(2, 2, 6);
        System.out.println("Resultado da reserva inválida: " + resultadoReservaInvalida);

        // Consulta de salas disponíveis
        String salasDisponiveis = cinema.consultarSalasDisponiveis();
        System.out.println("Salas disponíveis: " + salasDisponiveis);

        // Teste de cancelamento de reserva válida
        String resultadoCancelamentoValido = cinema.cancelarReserva(1, 3);
        System.out.println("Resultado do cancelamento válido: " + resultadoCancelamentoValido);

        // Teste de cancelamento de reserva inválida (menos de 1 hora para o filme)
        String resultadoCancelamentoInvalido = cinema.cancelarReserva(2, 2);
        System.out.println("Resultado do cancelamento inválido: " + resultadoCancelamentoInvalido);

        // Teste de transferência de ingressos válida
        String resultadoTransferenciaValida = cinema.transferirIngressos(1, 2, 3, 2);
        System.out.println("Resultado da transferência válida: " + resultadoTransferenciaValida);

        // Teste de transferência de ingressos inválida (excede o limite permitido)
        String resultadoTransferenciaInvalida = cinema.transferirIngressos(1, 2, 3, 6);
        System.out.println("Resultado da transferência inválida: " + resultadoTransferenciaInvalida);

        // Cálculo do valor total da reserva
        String valorTotalReserva = cinema.calcularValorReserva(1, 3, 4);
        System.out.println("Valor total da reserva: " + valorTotalReserva);
    }
}
