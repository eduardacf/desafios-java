import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Cinema {
    private List<Sala> salas;
    private List<Filme> filmes;
    private static List<Reserva> reservas;

    public Cinema() {
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
        this.reservas = new ArrayList<>();
        salas.add(new Sala(1, 100, false));
        salas.add(new Sala(2, 50, true));
        salas.add(new Sala(3, 200, false));
        salas.add(new Sala(4, 150, true));
        salas.add(new Sala(5, 75, false));

        filmes.add(new Filme(1, "Vingadores: Ultimato", "Ação", 181));
        filmes.add(new Filme(2, "O Rei Leão", "Animação", 118));
        filmes.add(new Filme(3, "Coringa", "Drama", 122));
        filmes.add(new Filme(4, "Frozen II", "Animação", 103));
        filmes.add(new Filme(5, "Parasita", "Suspense", 132));

    }


    public String reservarIngressos(int clienteId, int filmeId, int numeroIngressos) {
        if (numeroIngressos > 5) {
            return "{\"erro\": \"Número de ingressos excede o limite permitido\"}";
        }

        Sala salaDisponivel = null;
        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);
            if (!sala.isOcupada() && sala.getCapacidade() >= numeroIngressos) {
                salaDisponivel = sala;
                break;
            }
        }

        if (salaDisponivel == null) {
            return "{\"erro\": \"Não há salas disponíveis com capacidade suficiente\"}";
        }

        salaDisponivel.setOcupada(true);
        reservas.add(new Reserva(clienteId, filmeId, numeroIngressos, LocalDateTime.now()));
        return "{\"mensagem\": \"Reserva realizada com sucesso. Data e hora: " + LocalDateTime.now() + "\"}";
    }

    public String consultarSalasDisponiveis() {
        StringJoiner joiner = new StringJoiner(", ", "{\"salas\": [", "]}");
        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);
            if (!sala.isOcupada()) {
                joiner.add("{\"id\": " + sala.getId() +
                                   ", \"capacidade\": " + sala.getCapacidade() +
                                   ", \"ocupada\": " + sala.isOcupada() + "}");
            }
        }
        return joiner.toString();
    }


    public String cancelarReserva(int clienteId, int filmeId) {
        Reserva reservaParaCancelar = null;
        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);
            if (reserva.getClienteId() == clienteId && reserva.getFilmeId() == filmeId) {
                reservaParaCancelar = reserva;
                break;
            }
        }

        if (reservaParaCancelar == null) {
            return "{\"erro\": \"Reserva não encontrada\"}";
        }

        LocalDateTime agora = LocalDateTime.now();
        if (reservaParaCancelar.getDataHora().plusMinutes(60).isBefore(agora)) {
            return "{\"erro\": \"Não é possível cancelar a reserva com menos de 1 hora para o filme\"}";
        }

        reservas.remove(reservaParaCancelar);
        for (int i = 0; i < salas.size(); i++) {
            Sala sala = salas.get(i);
            if (sala.isOcupada()) {
                sala.setOcupada(false);
                break;
            }
        }
        return "{\"mensagem\": \"Reserva cancelada com sucesso.\"}";
    }

    public static String transferirIngressos(int clienteIdOrigem, int clienteIdDestino, int filmeId, int numeroIngressos) {
        if (numeroIngressos > 5) {
            return "{\"erro\": \"Número de ingressos excede o limite permitido\"}";
        }

        Reserva reservaOrigem = null;
        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);
            if (reserva.getClienteId() == clienteIdOrigem && reserva.getFilmeId() == filmeId) {
                reservaOrigem = reserva;
                break;
            }
        }

        if (reservaOrigem == null || reservaOrigem.getQuantidadeIngressos() < numeroIngressos) {
            return "{\"erro\": \"Reserva não encontrada ou número de ingressos insuficiente\"}";
        }

        // Atualiza a quantidade de ingressos na reserva original
        reservaOrigem.setQuantidadeIngressos(reservaOrigem.getQuantidadeIngressos() - numeroIngressos);

        // Adiciona uma nova reserva para o cliente de destino
        reservas.add(new Reserva(clienteIdDestino, filmeId, numeroIngressos, LocalDateTime.now()));
        return "{\"mensagem\": \"Ingressos transferidos com sucesso.\"}";
    }

    public String calcularValorReserva(int clienteId, int filmeId, int numeroIngressos) {
        double precoIngresso = 20.00; // Exemplo de preço fixo
        double valorTotal = precoIngresso * numeroIngressos;
        return "{\"valorTotal\": " + valorTotal + "}";
    }
}
