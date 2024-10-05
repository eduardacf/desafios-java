import java.time.LocalDateTime;

public class Pedido {
    int idCliente;
    int idMesa;
    LocalDateTime dataPedido;
    LocalDateTime dataEntrega;

    public Pedido(int idCliente, int idMesa, LocalDateTime dataPedido, LocalDateTime dataEntrega) {
        this.idCliente = idCliente;
        this.idMesa = idMesa;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
    }
}
