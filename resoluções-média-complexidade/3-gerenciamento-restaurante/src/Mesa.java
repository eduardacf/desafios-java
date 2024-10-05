public class Mesa {
    int id;
    int capacidade;
    boolean ocupada;

    public Mesa(int id, int capacidade, boolean ocupada) {
        this.id = id;
        this.capacidade = capacidade;
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + id +
                ", capacidade=" + capacidade +
                ", ocupada=" + ocupada +
                '}';
    }
}
