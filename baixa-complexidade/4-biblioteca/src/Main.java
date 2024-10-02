public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando um novo livro
        System.out.println(biblioteca.adicionarLivro(6, "Harry Potter", "J.K. Rowling", 12, 39.99));

        // Emprestando livros
        System.out.println(biblioteca.emprestarLivro(1, 2));
        System.out.println(biblioteca.emprestarLivro(4, 6));

        // Devolvendo livros
        System.out.println(biblioteca.devolverLivro(3, 5));

        // Calculando o valor total do acervo
        System.out.println(biblioteca.calcularValorTotalAcervo());
    }
}