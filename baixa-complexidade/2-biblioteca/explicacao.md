### Classe Livro

A classe Livro representa os livros da biblioteca. Ela possui três atributos: **titulo**, **autor** e **anoPublicacao**. Além disso, a classe possui métodos getters e setters para acessar e modificar esses atributos, e um método toString para representar o livro como uma string.

```plaintext
public class Livro {
private String titulo;
private String autor;
private int anoPublicacao;

public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
}

// Getters e Setters
public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public int getAnoPublicacao() {
    return anoPublicacao;
}

public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
}

@Override
public String toString() {
    return "Livro{" +
            "titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", anoPublicacao=" + anoPublicacao +
            '}';
}
```

}

**Detalhamento:**

*   **Atributos:**
    *   titulo: O título do livro.
    *   autor: O autor do livro.
    *   anoPublicacao: O ano de publicação do livro.
*   **Construtor:**
    *   O construtor inicializa os atributos titulo, autor e anoPublicacao com os valores fornecidos.
*   **Getters e Setters:**
    *   Métodos para acessar (get) e modificar (set) os atributos do livro.
*   **Método toString:**
    *   Retorna uma representação em string do livro, incluindo o título, autor e ano de publicação.

### Classe Biblioteca

A classe Biblioteca gerencia a lista de livros e implementa as operações de adicionar, remover, buscar e listar livros.

```plaintext
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
private List livros = new ArrayList<>();

// Método para adicionar um novo livro
public String adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livros.add(new Livro(titulo, autor, anoPublicacao));
    return "Livro adicionado com sucesso: " + titulo;
}

// Método para remover um livro pelo título
public String removerLivro(String titulo) {
    for (int i = 0; i < livros.size(); i++) {
        if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
            livros.remove(i);
            return "Livro removido com sucesso: " + titulo;
        }
    }
    return "Livro não encontrado: " + titulo;
}

// Método para buscar um livro pelo título
public String buscarLivro(String titulo) {
    for (int i = 0; i < livros.size(); i++) {
        if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
            return livros.get(i).toString();
        }
    }
    return "Livro não encontrado: " + titulo;
}

// Método para listar todos os livros
public String listarTodosLivros() {
    if (livros.isEmpty()) {
        return "Nenhum livro encontrado.";
    }
    String[] resultado = new String[livros.size()];
    for (int i = 0; i < livros.size(); i++) {
        resultado[i] = livros.get(i).toString();
    }
    return String.join("\n", resultado);
}
}
```

**Detalhamento:**

*   **Atributo:**
    *   livros: Uma lista de objetos Livro que representa os livros disponíveis na biblioteca.
*   **Método adicionarLivro:**
    *   Adiciona um novo livro à lista de livros.
    *   Parâmetros: titulo, autor, anoPublicacao.
    *   Cria um novo objeto Livro com os parâmetros fornecidos e o adiciona à lista livros.
    *   Retorna uma mensagem de sucesso.
*   **Método removerLivro:**
    *   Remove um livro da lista pelo título.
    *   Parâmetro: titulo.
    *   Itera sobre a lista de livros para encontrar um livro com o título fornecido.
    *   Se encontrar, remove o livro da lista e retorna uma mensagem de sucesso.
    *   Se não encontrar, retorna uma mensagem de erro.
*   **Método buscarLivro:**
    *   Busca um livro na lista pelo título.
    *   Parâmetro: titulo.
    *   Itera sobre a lista de livros para encontrar um livro com o título fornecido.
    *   Se encontrar, retorna a representação em string do livro.
    *   Se não encontrar, retorna uma mensagem de erro.
*   **Método listarTodosLivros:**
    *   Lista todos os livros na biblioteca.
    *   Se a lista de livros estiver vazia, retorna uma mensagem indicando que nenhum livro foi encontrado.
    *   Caso contrário, cria um array de strings com a representação em string de cada livro e retorna a junção dessas strings separadas por quebras de linha.

### Classe Main

A classe Main contém o método main, que é o ponto de entrada do programa. Ela demonstra como usar a classe Biblioteca para realizar operações de adicionar, remover, buscar e listar livros.

```plaintext
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
```

}

### Detalhamento:

*   **Instanciação da Classe Biblioteca:**
    *   Cria uma nova instância da classe Biblioteca.
*   **Adicionar Novos Livros:**
    *   Adiciona três novos livros à biblioteca usando o método adicionarLivro.
    *   Imprime a mensagem de sucesso retornada pelo método.
*   **Listar Todos os Livros:**
    *   Chama o método listarTodosLivros para listar todos os livros na biblioteca.
    *   Imprime a lista de livros.
*   **Buscar um Livro pelo Título:**
    *   Chama o método buscarLivro para buscar um livro pelo título "Harry Potter".
    *   Imprime a representação em string do livro encontrado ou a mensagem de erro.
*   **Remover um Livro pelo Título:**
    *   Chama o método removerLivro para remover um livro pelo título "O Hobbit".
    *   Imprime a mensagem de sucesso ou erro retornada pelo método.
*   **Listar Todos os Livros Após Remoção:**
    *   Chama o método listarTodosLivros novamente para listar todos os livros na biblioteca após a remoção.
    *   Imprime a lista de livros.

**Conclusão**

O código fornecido implementa um sistema simples de gerenciamento de biblioteca em Java. Ele permite adicionar novos livros, remover livros pelo título, buscar livros pelo título e listar todos os livros. O sistema lida com casos de erro, como tentar remover ou buscar um livro que não existe, e fornece mensagens apropriadas para cada operação.