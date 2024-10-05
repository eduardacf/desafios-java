public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar novos livros
        System.out.println(biblioteca.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        System.out.println(biblioteca.adicionarLivro("Harry Potter", "J.K. Rowling", 1997));
        System.out.println(biblioteca.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937));

        // Listar todos os livros
        System.out.println("Lista de todos os livros:");
        System.out.println(biblioteca.listarTodosLivros());

        // Buscar um livro pelo título
        System.out.println("Buscar livro 'Harry Potter':");
        System.out.println(biblioteca.buscarLivro("Harry Potter"));

        // Remover um livro pelo título
        System.out.println("Remover livro 'O Hobbit':");
        System.out.println(biblioteca.removerLivro("O Hobbit"));

        // Listar todos os livros após remoção
        System.out.println("Lista de todos os livros após remoção:");
        System.out.println(biblioteca.listarTodosLivros());
    }
}
