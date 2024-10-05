public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        System.out.println(estoque.entradaEstoque(1,
                                                  10));
        // Entrada de estoque realizada com sucesso. Quantidade atual: 60

        System.out.println(estoque.saidaEstoque(3,
                                                25));
        // Quantidade insuficiente em estoque

        System.out.println(estoque.entradaEstoque(2,
                                                  15));
        // Entrada de estoque realizada com sucesso. Quantidade atual: 45

        System.out.println(estoque.entradaEstoque(4,
                                                  5));
        // Entrada de estoque realizada com sucesso. Quantidade atual: 20

        System.out.println(estoque.saidaEstoque(1,
                                                10));
        // Saída de estoque realizada com sucesso. Quantidade atual: 50

        System.out.println(estoque.saidaEstoque(4,
                                                25));
        // Quantidade insuficiente em estoque

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());
        // Valor total do estoque: 4999.50

        for (int i = 0; i < estoque.consultarProdutos().size(); i++) {
            Produto produto = estoque.consultarProdutos().get(i);
            System.out.println("ID: " + produto.id + ", Nome: " + produto.nome + ", Quantidade: " + produto.quantidade + ", Preço: " + produto.preco);
        }
        // Lista de produtos com suas quantidades e preços
    }
}
