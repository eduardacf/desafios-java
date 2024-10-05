
public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("Cadeira");
        p.setPreco(150.0);
        p.setCategoria("Móveis");

        Eletronico e = new Eletronico();
        e.setNome("Televisão");
        e.setPreco(2000.0);
        e.setCategoria("Eletrônicos");
        e.setGarantia(24);

        System.out.println(p.getNome()); // "Cadeira"
        System.out.println(p.calcularDesconto()); // 142.5 (assumindo um desconto de 5%)

        System.out.println(e.getNome()); // "Televisão"
        System.out.println(e.calcularDesconto()); // 1800.0 (assumindo um desconto de 10%)
    }
}
