### Desafio 1: Sistema de Gestão de Funcionários

#### Encapsulamento:

*   Crie uma classe `Funcionario` com os seguintes atributos: `nome` (String), `salarioBase` (double), `cargo` (String).
*   Utilize modificadores de acesso para proteger esses atributos.
*   Forneça métodos getters e setters para acessar e modificar esses atributos.

#### Herança:

*   Crie uma classe `Gerente` que herda da classe `Funcionario`.
*   Adicione um atributo `bonus` (double) à classe `Gerente`.

#### Polimorfismo:

*   Na classe `Funcionario`, crie um método `calcularSalario` que retorna o salário do funcionário.
*   Na classe `Gerente`, sobrescreva o método `calcularSalario` para incluir o bônus no cálculo do salário.

#### Abstração:

*   Crie uma classe abstrata `Pessoa` com um método abstrato `getIdentificacao`.
*   Faça a classe `Funcionario` herdar da classe `Pessoa` e implemente o método `getIdentificacao`.

### Exemplo de Entrada e Saída:

#### Entrada:

```java
Funcionario f = new Funcionario();
f.setNome("João");
f.setSalarioBase(3000.0);
f.setCargo("Desenvolvedor");

Gerente g = new Gerente();
g.setNome("Maria");
g.setSalarioBase(5000.0);
g.setCargo("Gerente de Projetos");
g.setBonus(1000.0);
```

#### Saída:

```java
System.out.println(f.getNome()); // "João"
System.out.println(f.calcularSalario()); // 3000.0

System.out.println(g.getNome()); // "Maria"
System.out.println(g.calcularSalario()); // 6000.0
```

### Explicação dos Conceitos:

*   **Encapsulamento**: A classe `Funcionario` possui atributos privados `nome`, `salarioBase` e `cargo`, acessíveis apenas através dos métodos getters e setters.
*   **Herança**: A classe `Gerente` herda da classe `Funcionario`, reutilizando seus atributos e métodos.
*   **Polimorfismo**: O método `calcularSalario` é sobrescrito na classe `Gerente`, permitindo diferentes implementações.
*   **Abstração**: A classe `Pessoa` é abstrata e define um contrato que a classe `Funcionario` deve implementar.

### Tabela de Cálculos

| Tipo de Funcionário | Nome | Salário Base | Bônus | Salário Calculado |
| --- | --- | --- | --- | --- |
| FuncionarioComum | João | 3000.0 | \- | 3000.0 |
| Gerente | Maria | 5000.0 | 1000.0 | 6000.0 |
