### Sistema de Gerenciamento de Alunos

### O Desafio

Você foi contratado para desenvolver um sistema simples de gerenciamento de alunos que permita adicionar, remover, buscar e listar alunos. Sua missão será criar a lógica para gerenciar os alunos, permitindo que o usuário:

1.  Adicione um novo aluno com nome, idade e matrícula.
2.  Remova um aluno pela matrícula.
3.  Busque um aluno pela matrícula.
4.  Liste todos os alunos.

### Alunos Existentes

Inicialmente, o sistema não possui alunos cadastrados. O usuário poderá adicionar alunos conforme necessário.

### Regras para Gerenciamento de Alunos

1.  O sistema deve permitir adicionar novos alunos.
2.  O sistema deve permitir remover alunos pela matrícula.
3.  O sistema deve permitir buscar alunos pela matrícula.
4.  O sistema deve permitir listar todos os alunos cadastrados.

### Entradas e Saídas

1.  O programa deve receber os dados do aluno (nome, idade, matrícula) para realizar a operação de criação.
2.  O programa deve receber a matrícula do aluno para realizar as operações de remoção e busca.
3.  O programa deve retornar uma mensagem de sucesso ou erro, dependendo da operação.
4.  O programa deve permitir a visualização de todos os alunos cadastrados.

### Exemplos

**Adicionar um novo aluno**

```java
adicionarAluno("Maria Silva", 20, "20231001");
```

Saída

```plaintext
Aluno adicionado com sucesso: Maria Silva
```

---

**Remover um aluno pela matrícula**

```java
removerAluno("20231001");
```

Saída

```plaintext
Aluno removido com sucesso: 20231001
```

---

**Buscar um aluno pela matrícula**

```java
buscarAluno("20231001");
```

Saída

```plaintext
Aluno{nome='Maria Silva', idade=20, matricula='20231001'}
```

---

**Listar todos os alunos**

```java
listarTodosAlunos();
```

Saída

```plaintext
Aluno{nome='Maria Silva', idade=20, matricula='20231001'}
Aluno{nome='João Souza', idade=22, matricula='20231002'}
Aluno{nome='Ana Costa', idade=19, matricula='20231003'}
```