
public class Eletronico extends Produto {
    private int garantia;

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.90;
    }
}
