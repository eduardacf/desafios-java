public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println(biblioteca.emprestarLivro(1, 3));
        // Empréstimo realizado com sucesso. Data de devolução: 01/10/2024

        System.out.println(biblioteca.emprestarLivro(2, 2));
        // Livro não disponível

        System.out.println(biblioteca.emprestarLivro(3, 4));
        // Membro já possui 2 livros emprestados

        System.out.println(biblioteca.devolverLivro(1, 1));
        // Devolução realizada com sucesso. Livro disponível para empréstimo.

        System.out.println(biblioteca.devolverLivro(2, 1));
        // Livro não foi emprestado por este membro

        System.out.println("Livros disponíveis:");
        for (int i = 0; i < biblioteca.consultarLivrosDisponiveis().size(); i++) {
            Livro livro = biblioteca.consultarLivrosDisponiveis().get(i);
            System.out.println("ID: " + livro.id + ", Título: " + livro.titulo + ", Autor: " + livro.autor + ", Gênero: " + livro.genero);
        }

        System.out.println("Membros cadastrados:");
        for (int i = 0; i < biblioteca.consultarMembros().size(); i++) {
            Membro membro = biblioteca.consultarMembros().get(i);
            System.out.println("ID: " + membro.id + ", Nome: " + membro.nome + ", Livros Emprestados: " + membro.livrosEmprestados);
        }
    }
}
