import java.time.LocalDateTime;

public class Reserva {
    private int clienteId;
    private int filmeId;
    private int quantidadeIngressos;
    private LocalDateTime dataHora;

    public Reserva(int clienteId, int filmeId, int quantidadeIngressos, LocalDateTime dataHora) {
        this.clienteId = clienteId;
        this.filmeId = filmeId;
        this.quantidadeIngressos = quantidadeIngressos;
        this.dataHora = dataHora;
    }

    public int getClienteId() {
        return clienteId;
    }

    public int getFilmeId() {
        return filmeId;
    }

    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public void setFilmeId(int filmeId) {
        this.filmeId = filmeId;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
