import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Mesa> mesas;
    List<Cliente> clientes;
    List<Pedido> pedidos;

    public Restaurante() {
        mesas = new ArrayList<>();
        clientes = new ArrayList<>();
        pedidos = new ArrayList<>();

        mesas.add(new Mesa(1, 4, false));
        mesas.add(new Mesa(2, 2, true));
        mesas.add(new Mesa(3, 6, false));
        mesas.add(new Mesa(4, 4, true));
        mesas.add(new Mesa(5, 2, false));

        clientes.add(new Cliente(1, "Ana", 2));
        clientes.add(new Cliente(2, "Bruno", 0));
        clientes.add(new Cliente(3, "Carla", 1));
        clientes.add(new Cliente(4, "Diego", 3));
        clientes.add(new Cliente(5, "Elisa", 1));
    }

    public String realizarPedido(int idCliente, int idMesa) {
        Cliente cliente = encontrarClientePorId(idCliente);
        Mesa mesa = encontrarMesaPorId(idMesa);

        if (cliente == null) {
            return "Cliente não encontrado";
        }

        if (mesa == null) {
            return "Mesa não encontrada";
        }

        if (mesa.ocupada) {
            return "Mesa ocupada";
        }

        if (cliente.pedidosRealizados >= 3) {
            return "Cliente já possui 3 pedidos realizados";
        }

        mesa.ocupada = true;
        cliente.pedidosRealizados++;
        LocalDateTime dataPedido = LocalDateTime.now();
        LocalDateTime dataEntrega = dataPedido.plusMinutes(30);
        pedidos.add(new Pedido(idCliente, idMesa, dataPedido, dataEntrega));

        return "Pedido realizado com sucesso. Data de entrega: " + dataEntrega;
    }

    public String finalizarPedido(int idCliente, int idMesa) {
        Cliente cliente = encontrarClientePorId(idCliente);
        Mesa mesa = encontrarMesaPorId(idMesa);

        if (cliente == null) {
            return "Cliente não encontrado";
        }

        if (mesa == null) {
            return "Mesa não encontrada";
        }

        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            if (pedido.idCliente == idCliente && pedido.idMesa == idMesa) {
                pedidos.remove(i);
                mesa.ocupada = false;
                cliente.pedidosRealizados--;
                return "Pedido finalizado com sucesso. Mesa disponível para novos pedidos.";
            }
        }

        return "Pedido não foi realizado por este cliente";
    }

    public List<Mesa> consultarMesasDisponiveis() {
        List<Mesa> mesasDisponiveis = new ArrayList<>();
        for (int i = 0; i < mesas.size(); i++) {
            Mesa mesa = mesas.get(i);
            if (!mesa.ocupada) {
                mesasDisponiveis.add(mesa);
            }
        }
        return mesasDisponiveis;
    }

    public List<Cliente> consultarClientes() {
        return clientes;
    }

    private Cliente encontrarClientePorId(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.id == id) {
                return cliente;
            }
        }
        return null;
    }

    private Mesa encontrarMesaPorId(int id) {
        for (int i = 0; i < mesas.size(); i++) {
            Mesa mesa = mesas.get(i);
            if (mesa.id == id) {
                return mesa;
            }
        }
        return null;
    }
}
