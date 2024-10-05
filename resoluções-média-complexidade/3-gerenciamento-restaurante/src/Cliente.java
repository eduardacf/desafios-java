public class Cliente {
    int id;
    String nome;
    int pedidosRealizados;

    public Cliente(int id, String nome, int pedidosRealizados) {
        this.id = id;
        this.nome = nome;
        this.pedidosRealizados = pedidosRealizados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pedidosRealizados=" + pedidosRealizados +
                '}';
    }
}
