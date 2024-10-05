### Explicação Detalhada da Resolução

A resolução do desafio de criar um sistema de gerenciamento de alunos foi feita utilizando a linguagem de programação Java. O sistema é composto por três classes principais: `Aluno`, `GerenciamentoAlunos` e `Main`. Vamos detalhar cada uma dessas classes e suas funcionalidades.

### Classe Aluno

A classe `Aluno` representa um aluno com três atributos: nome, idade e matrícula. Ela contém um construtor para inicializar esses atributos, métodos getters e setters para acessar e modificar os atributos, e um método `toString` para retornar uma representação em string do objeto.

```java
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
```

### Classe GerenciamentoAlunos

A classe `GerenciamentoAlunos` é responsável por gerenciar a lista de alunos. Ela utiliza uma lista (`List`) para armazenar os alunos e fornece métodos para adicionar, remover, buscar e listar alunos.

```java
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    // Método para adicionar um novo aluno
    public String adicionarAluno(String nome, int idade, String matricula) {
        alunos.add(new Aluno(nome, idade, matricula));
        return "Aluno adicionado com sucesso: " + nome;
    }

    // Método para remover um aluno pela matrícula
    public String removerAluno(String matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                alunos.remove(i);
                return "Aluno removido com sucesso: " + matricula;
            }
        }
        return "Aluno não encontrado: " + matricula;
    }

    // Método para buscar um aluno pela matrícula
    public String buscarAluno(String matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                return alunos.get(i).toString();
            }
        }
        return "Aluno não encontrado: " + matricula;
    }

    // Método para listar todos os alunos
    public String listarTodosAlunos() {
        if (alunos.isEmpty()) {
            return "Nenhum aluno encontrado.";
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < alunos.size(); i++) {
            resultado.append(alunos.get(i).toString()).append("\n");
        }
        return resultado.toString();
    }
}
```

### Métodos da Classe GerenciamentoAlunos

1. **adicionarAluno**: Adiciona um novo aluno à lista.   

*   Parâmetros: nome, idade, matrícula.   
*   Retorna: Mensagem de sucesso com o nome do aluno adicionado.

2. **removerAluno**: Remove um aluno da lista pela matrícula.   

*   Parâmetro: matrícula.   
*   Retorna: Mensagem de sucesso se o aluno for encontrado e removido, ou mensagem de erro se o aluno não for encontrado.

3. **buscarAluno**: Busca um aluno na lista pela matrícula.   

*   Parâmetro: matrícula.   
*   Retorna: Representação em string do aluno se encontrado, ou mensagem de erro se não encontrado.

4. **listarTodosAlunos**: Lista todos os alunos cadastrados.   

*   Retorna: Representação em string de todos os alunos, ou mensagem indicando que não há alunos cadastrados.

### Classe Main

A classe `Main` contém o método `main`, que é o ponto de entrada do programa. Ela cria uma instância de `GerenciamentoAlunos` e realiza operações de adicionar, remover, buscar e listar alunos, exibindo os resultados no console.

```java
public class Main {
    public static void main(String[] args) {
        GerenciamentoAlunos gerenciamentoAlunos = new GerenciamentoAlunos();

        // Adicionar novos alunos
        System.out.println(gerenciamentoAlunos.adicionarAluno("Maria Silva", 20, "20231001"));
        System.out.println(gerenciamentoAlunos.adicionarAluno("João Souza", 22, "20231002"));
        System.out.println(gerenciamentoAlunos.adicionarAluno("Ana Costa", 19, "20231003"));

        // Listar todos os alunos
        System.out.println("Lista de todos os alunos:");
        System.out.println(gerenciamentoAlunos.listarTodosAlunos());

        // Buscar um aluno pela matrícula
        System.out.println("Buscar aluno '20231001':");
        System.out.println(gerenciamentoAlunos.buscarAluno("20231001"));

        // Remover um aluno pela matrícula
        System.out.println("Remover aluno '20231003':");
        System.out.println(gerenciamentoAlunos.removerAluno("20231003"));

        // Listar todos os alunos após remoção
        System.out.println("Lista de todos os alunos após remoção:");
        System.out.println(gerenciamentoAlunos.listarTodosAlunos());
    }
}
```

### Operações Realizadas na Classe Main

1. **Adicionar Alunos**: Adiciona três alunos ao sistema e exibe mensagens de sucesso.

2. **Listar Todos os Alunos**: Lista todos os alunos cadastrados e exibe no console.

3. **Buscar Aluno**: Busca um aluno pela matrícula e exibe os detalhes do aluno encontrado.

4. **Remover Aluno**: Remove um aluno pela matrícula e exibe mensagem de sucesso ou erro.

5. **Listar Todos os Alunos Após Remoção**: Lista todos os alunos cadastrados após a remoção de um aluno e exibe no console.

### Conclusão

A resolução do desafio foi feita de forma a atender todas as especificações do enunciado. O sistema permite adicionar, remover, buscar e listar alunos, retornando mensagens apropriadas para cada operação. A implementação é modular, com cada classe e método desempenhando um papel específico, facilitando a manutenção e a expansão do sistema no futuro.