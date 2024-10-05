
public class Produto implements Vendavel {
    private String nome;
    private double preco;
    private String categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double calcularDesconto() {
        return preco * 0.95;
    }

    @Override
    public String getCodigoDeBarras() {
        return "123456789";
    }
}
