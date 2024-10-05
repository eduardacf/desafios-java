## Importações

```plaintext
import java.util.ArrayList;
import java.util.List;
```

*   `import java.util.ArrayList;`: Importa a classe ArrayList da biblioteca Java. ArrayList é uma lista que pode crescer e diminuir de tamanho dinamicamente.
*   `import java.util.List;`: Importa a interface List da biblioteca Java. List é uma coleção ordenada que permite elementos duplicados.

## Declaração da Classe

```java
public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
```

*   `public class Biblioteca`: Declaração da classe Biblioteca. A classe é pública, o que significa que pode ser acessada de outras classes.
*   `private List<Livro> livros = new ArrayList<>();`: Declara uma lista privada de objetos Livro chamada `livros` e a inicializa como um ArrayList. Esta lista armazenará os livros da biblioteca.

## Construtor

```java
    public Biblioteca() {
        // Adicionando livros existentes
        livros.add(new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", 10, 49.99));
        livros.add(new Livro(2, "1984", "George Orwell", 8, 39.99));
        livros.add(new Livro(3, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 15, 29.99));
        livros.add(new Livro(4, "Dom Quixote", "Miguel de Cervantes", 5, 59.99));
        livros.add(new Livro(5, "Moby Dick", "Herman Melville", 7, 44.99));
    }
```

*   `public Biblioteca()`: Declara o construtor da classe Biblioteca. O construtor é chamado quando um objeto da classe Biblioteca é criado.
*   `livros.add(new Livro(...))`: Adiciona livros existentes à lista `livros` usando o método `add` do ArrayList. Cada livro é criado como um novo objeto da classe Livro com os atributos fornecidos (ID, título, autor, quantidade, preço).

## Método adicionarLivro

```java
    public String adicionarLivro(int id, String titulo, String autor, int quantidade, double preco) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).id == id) {
                return "{\"erro\": \"Livro com este ID já existe.\"}";
            }
        }
        livros.add(new Livro(id, titulo, autor, quantidade, preco));
        return "{\"mensagem\": \"Livro adicionado com sucesso. Quantidade atual: " + quantidade + "\"}";
    }
```

*   `public String adicionarLivro(int id, String titulo, String autor, int quantidade, double preco)`: Declara um método público que adiciona um novo livro à biblioteca. O método recebe os parâmetros `id`, `titulo`, `autor`, `quantidade` e `preco`.
*   `for (int i = 0; i < livros.size(); i++)`: Itera sobre a lista de livros.
*   `if (livros.get(i).id == id)`: Verifica se já existe um livro com o mesmo ID. Se existir, retorna uma mensagem de erro.
*   `livros.add(new Livro(id, titulo, autor, quantidade, preco))`: Adiciona o novo livro à lista `livros`.
*   `return "{\"mensagem\": \"Livro adicionado com sucesso. Quantidade atual: " + quantidade + "\"}"`: Retorna uma mensagem de sucesso com a quantidade atual do livro adicionado.

## Método emprestarLivro

```java
    public String emprestarLivro(int id, int quantidade) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.id == id) {
                if (livro.quantidade < quantidade) {
                    return "{\"erro\": \"Quantidade insuficiente no acervo.\"}";
                }
                livro.quantidade = livro.quantidade - quantidade;
                return "{\"mensagem\": \"Empréstimo realizado com sucesso. Quantidade atual: " + livro.quantidade + "\"}";
            }
        }
        return "{\"erro\": \"Livro não encontrado.\"}";
    }
```

*   `public String emprestarLivro(int id, int quantidade)`: Declara um método público que realiza o empréstimo de um livro. O método recebe os parâmetros `id` e `quantidade`.
*   `for (int i = 0; i < livros.size(); i++)`: Itera sobre a lista de livros.
*   `Livro livro = livros.get(i)`: Obtém o livro atual da lista.
*   `if (livro.id == id)`: Verifica se o ID do livro corresponde ao ID fornecido.
*   `if (livro.quantidade < quantidade)`: Verifica se a quantidade disponível é suficiente para o empréstimo. Se não for, retorna uma mensagem de erro.
*   `livro.quantidade = livro.quantidade - quantidade`: Atualiza a quantidade do livro após o empréstimo.
*   `return "{\"mensagem\": \"Empréstimo realizado com sucesso. Quantidade atual: " + livro.quantidade + "\"}"`: Retorna uma mensagem de sucesso com a quantidade atual do livro emprestado.
*   `return "{\"erro\": \"Livro não encontrado.\"}"`: Retorna uma mensagem de erro se o livro não for encontrado.

## Método devolverLivro

```java
    public String devolverLivro(int id, int quantidade) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.id == id) {
                livro.quantidade = livro.quantidade + quantidade;
                return "{\"mensagem\": \"Devolução realizada com sucesso. Quantidade atual: " + livro.quantidade + "\"}";
            }
        }
        return "{\"erro\": \"Livro não encontrado.\"}";
    }
```

*   `public String devolverLivro(int id, int quantidade)`: Declara um método público que realiza a devolução de um livro. O método recebe os parâmetros `id` e `quantidade`.
*   `for (int i = 0; i < livros.size(); i++)`: Itera sobre a lista de livros.
*   `Livro livro = livros.get(i)`: Obtém o livro atual da lista.
*   `if (livro.id == id)`: Verifica se o ID do livro corresponde ao ID fornecido.
*   `livro.quantidade = livro.quantidade + quantidade`: Atualiza a quantidade do livro após a devolução.
*   `return "{\"mensagem\": \"Devolução realizada com sucesso. Quantidade atual: " + livro.quantidade + "\"}"`: Retorna uma mensagem de sucesso com a quantidade atual do livro devolvido.
*   `return "{\"erro\": \"Livro não encontrado.\"}"`: Retorna uma mensagem de erro se o livro não for encontrado.

## Método calcularValorTotalAcervo

```java
    public String calcularValorTotalAcervo() {
        double valorTotal = 0;
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            valorTotal = valorTotal + (livro.quantidade * livro.preco);
        }
        return "{\"valorTotal\": " + valorTotal + "}";
    }
```

*   `public String calcularValorTotalAcervo()`: Declara um método público que calcula o valor total dos livros no acervo.
*   `double valorTotal = 0`: Inicializa a variável `valorTotal` com zero.
*   `for (int i = 0; i < livros.size(); i++)`: Itera sobre a lista de livros.
*   `Livro livro = livros.get(i)`: Obtém o livro atual da lista.
*   `valorTotal = valorTotal + (livro.quantidade * livro.preco)`: Calcula o valor total do acervo somando o valor de cada livro (quantidade \* preço).
*   `return "{\"valorTotal\": " + valorTotal + "}"`: Retorna o valor total do acervo em formato JSON.

## Conclusão

A classe `Biblioteca` gerencia uma coleção de livros, permitindo adicionar novos livros, emprestar livros, devolver livros e calcular o valor total do acervo. A classe utiliza uma lista (`ArrayList`) para armazenar os livros e métodos para realizar as operações necessárias, retornando mensagens de sucesso ou erro conforme apropriado.