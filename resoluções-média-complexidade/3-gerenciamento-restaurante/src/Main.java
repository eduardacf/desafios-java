import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        System.out.println(restaurante.realizarPedido(1, 3));
        // Pedido realizado com sucesso. Data de entrega: 17/09/2024 10:42

        System.out.println(restaurante.realizarPedido(2, 2));
        // Mesa ocupada

        System.out.println("Mesas disponíveis:");
        List<Mesa> mesasDisponiveis = restaurante.consultarMesasDisponiveis();
        for (int i = 0; i < mesasDisponiveis.size(); i++) {
            System.out.println(mesasDisponiveis.get(i));
        }
        // Lista de mesas disponíveis

        System.out.println(restaurante.realizarPedido(3, 1));
        // Pedido realizado com sucesso. Data de entrega: 17/09/2024 10:42

        System.out.println(restaurante.realizarPedido(4, 3));
        // Cliente já possui 3 pedidos realizados

        System.out.println(restaurante.realizarPedido(1, 4));
        // Mesa ocupada

        System.out.println(restaurante.finalizarPedido(1, 1));
        // Pedido finalizado com sucesso. Mesa disponível para novos pedidos.

        System.out.println(restaurante.finalizarPedido(2, 1));
        // Pedido não foi realizado por este cliente

        System.out.println("Mesas disponíveis:");
        mesasDisponiveis = restaurante.consultarMesasDisponiveis();
        for (int i = 0; i < mesasDisponiveis.size(); i++) {
            System.out.println(mesasDisponiveis.get(i));
        }
        // Lista de mesas disponíveis

        System.out.println("Clientes cadastrados:");
        List<Cliente> clientes = restaurante.consultarClientes();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
        // Lista de clientes cadastrados
    }
}
