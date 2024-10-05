public class Livro {
    int id;
    String titulo;
    String autor;
    String genero;
    boolean disponivel;

    public Livro(int id, String titulo, String autor, String genero, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }
}
