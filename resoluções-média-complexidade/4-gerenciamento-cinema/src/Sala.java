public class Sala {
    private int id;
    private int capacidade;
    private boolean ocupada;

    public Sala(int id, int capacidade, boolean ocupada) {
        this.id = id;
        this.capacidade = capacidade;
        this.ocupada = ocupada;
    }

    public int getId() {
        return id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
