### Sistema de Gerenciamento de Biblioteca

### O Desafio

Você foi contratado para desenvolver um sistema simples de gerenciamento de biblioteca que permita adicionar, remover e buscar livros. Sua missão será criar a lógica para gerenciar os livros da biblioteca, permitindo que o usuário:

1. Adicione um novo livro com título, autor e ano de publicação.

2. Remova um livro pelo título.

3. Busque um livro pelo título.

4. Liste todos os livros.

### Livros Existentes

A biblioteca inicialmente não possui livros cadastrados. O usuário poderá adicionar livros conforme necessário.

### Regras para Gerenciamento de Livros

1. O sistema deve permitir adicionar novos livros.

2. O sistema deve permitir remover livros pelo título.

3. O sistema deve permitir buscar livros pelo título.

4. O sistema deve permitir listar todos os livros cadastrados.

### Entradas e Saídas

1. O programa deve receber os dados do livro (título, autor, ano de publicação) para realizar a operação de criação.

2. O programa deve receber o título do livro para realizar as operações de remoção e busca.

3. O programa deve retornar uma mensagem de sucesso ou erro, dependendo da operação.

4. O programa deve permitir a visualização de todos os livros cadastrados.

### Exemplos

**Adicionar um novo livro**

```java
adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
```

Saída

```plaintext
Livro adicionado com sucesso: O Senhor dos Anéis
```

----

**Remover um livro pelo título**

```java
removerLivro("O Hobbit");
```

Saída

```plaintext
Livro removido com sucesso: O Hobbit
```

----

**Buscar um livro pelo título**

```java
buscarLivro("Harry Potter");
```

Saída

```plaintext
Livro{titulo='Harry Potter', autor='J.K. Rowling', anoPublicacao=1997}
```

----

**Listar todos os livros**

```java
listarTodosLivros();
```

Saída

```plaintext
Livro{titulo='O Senhor dos Anéis', autor='J.R.R. Tolkien', anoPublicacao=1954}
Livro{titulo='Harry Potter', autor='J.K. Rowling', anoPublicacao=1997}
Livro{titulo='O Hobbit', autor='J.R.R. Tolkien', anoPublicacao=1937}
```