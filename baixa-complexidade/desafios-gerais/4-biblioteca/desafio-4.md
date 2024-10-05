## Sistema de Gerenciamento de Biblioteca

### O Desafio

Você foi contratado para desenvolver um sistema simples para gerenciar os livros de uma biblioteca. Sua missão será criar a lógica para adicionar livros, emprestar livros e devolver livros.

### Livros Existentes

A biblioteca possui os seguintes livros:

| ID | Título | Autor | Quantidade | Preço |
| --- | --- | --- | --- | --- |
| 1 | "O Senhor dos Anéis" | J.R.R. Tolkien | 10 | 49.99 |
| 2 | "1984" | George Orwell | 8 | 39.99 |
| 3 | "O Pequeno Príncipe" | Antoine de Saint-Exupéry | 15 | 29.99 |
| 4 | "Dom Quixote" | Miguel de Cervantes | 5 | 59.99 |
| 5 | "Moby Dick" | Herman Melville | 7 | 44.99 |

### Regras para Gerenciamento de Biblioteca

1. O sistema deve permitir adicionar novos livros.
2. O sistema deve permitir emprestar livros, atualizando a quantidade disponível.
3. O sistema deve permitir devolver livros, atualizando a quantidade disponível.
4. O sistema deve calcular o valor total dos livros na biblioteca.

### Entradas e Saídas

1. O programa deve receber o ID do livro e a quantidade para realizar um empréstimo ou devolução.
2. O programa deve retornar uma mensagem de sucesso ou erro, dependendo da operação.
3. O programa deve permitir calcular o valor total dos livros na biblioteca.

### Exemplos

**Adicionar um novo livro**

```java
adicionarLivro(6, "Harry Potter", "J.K. Rowling", 12, 39.99);
```
Saída

```JSON
{
  "mensagem": "Livro adicionado com sucesso. Quantidade atual: 12"
}
```
---
**Emprestar um livro**

```Java
emprestarLivro(1, 2);
```

Saída

```JSON
{
  "mensagem": "Empréstimo realizado com sucesso. Quantidade atual: 8"
}
```
---
**Emprestar um livro com quantidade insuficiente**

```Java
emprestarLivro(4, 6);
```

Saída

```JSON
{
  "erro": "Quantidade insuficiente no acervo"
}
```
---
**Devolver um livro**

```Java
devolverLivro(3, 5);
```

Saída

```JSON
{
  "mensagem": "Devolução realizada com sucesso. Quantidade atual: 20"
}
```
---
**Calcular o valor total dos livros**

```Java
calcularValorTotalAcervo();
```

Saída

```JSON
{
  "valorTotal": 1499.50
}
```