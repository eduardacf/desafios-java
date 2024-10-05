import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Camiseta", 50, 29.99));
        produtos.add(new Produto(2, "Calça Jeans", 30, 79.99));
        produtos.add(new Produto(3, "Tênis", 20, 99.99));
        produtos.add(new Produto(4, "Jaqueta", 15, 149.99));
        produtos.add(new Produto(5, "Boné", 40, 19.99));
    }

    public String entradaEstoque(int id, int quantidade) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.id == id) {
                produto.quantidade += quantidade;
                return "Entrada de estoque realizada com sucesso. Quantidade atual: " + produto.quantidade;
            }
        }
        return "Produto não encontrado";
    }

    public String saidaEstoque(int id, int quantidade) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.id == id) {
                if (produto.quantidade >= quantidade) {
                    produto.quantidade -= quantidade;
                    return "Saída de estoque realizada com sucesso. Quantidade atual: " + produto.quantidade;
                } else {
                    return "Quantidade insuficiente em estoque";
                }
            }
        }
        return "Produto não encontrado";
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            valorTotal += produto.quantidade * produto.preco;
        }
        return valorTotal;
    }

    public List<Produto> consultarProdutos() {
        return produtos;
    }
}
