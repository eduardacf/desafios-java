### Desafio 2: Sistema de Gestão de Funcionários e Projetos

#### Encapsulamento:

Crie uma classe `Funcionario` com os seguintes atributos:

*   `nome` (String)
*   `salarioBase` (double)
*   `cargo` (String)

Utilize modificadores de acesso para proteger esses atributos. Forneça métodos getters e setters para acessar e modificar esses atributos.

#### Herança:

Crie uma classe `Gerente` que herda da classe `Funcionario`. Adicione um atributo `bonus` (double) à classe `Gerente`.

Crie uma classe `Vendedor` que herda da classe `Funcionario`. Adicione um atributo `comissao` (double) à classe `Vendedor`.

Crie uma classe `Desenvolvedor` que herda da classe `Funcionario`. Adicione um atributo `nivel` (String) à classe `Desenvolvedor`.

#### Polimorfismo:

Na classe `Funcionario`, crie um método `calcularSalario` que retorna o salário do funcionário. Na classe `Gerente`, sobrescreva o método `calcularSalario` para incluir o bônus no cálculo do salário. Na classe `Vendedor`, sobrescreva o método `calcularSalario` para incluir a comissão no cálculo do salário. Na classe `Desenvolvedor`, sobrescreva o método `calcularSalario` para ajustar o salário com base no nível do desenvolvedor.

#### Abstração:

Crie uma classe abstrata `Pessoa` com um método abstrato `getIdentificacao`. Faça a classe `Funcionario` herdar da classe `Pessoa` e implemente o método `getIdentificacao`.

Crie uma interface `Bonificavel` com um método `calcularBonus`. Faça a classe `Gerente` implementar essa interface.

#### Regras de Negócio:

1.  Crie uma classe `Departamento` com os seguintes atributos:
    
    *   `nome` (String)
    *   `funcionarios` (List\<Funcionario>)
    
    Adicione métodos para adicionar e remover funcionários do departamento.
    
2.  Crie uma classe `Projeto` com os seguintes atributos:
    
    *   `nome` (String)
    *   `orcamento` (double)
    *   `funcionarios` (List\<Funcionario>)
    
    Adicione métodos para adicionar e remover funcionários do projeto.
    
3.  Crie uma classe `Empresa` com os seguintes atributos:
    
    *   `nome` (String)
    *   `departamentos` (List\<Departamento>)
    *   `projetos` (List\<Projeto>)
    
    Adicione métodos para adicionar e remover departamentos e projetos da empresa.
    
4.  Crie uma classe `FolhaPagamento` com um método `calcularFolha` que recebe uma lista de funcionários e retorna o total de salários a serem pagos.

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

Vendedor v = new Vendedor();
v.setNome("Carlos");
v.setSalarioBase(2000.0);
v.setCargo("Vendedor");
v.setComissao(500.0);

Desenvolvedor d = new Desenvolvedor();
d.setNome("Ana");
d.setSalarioBase(4000.0);
d.setCargo("Desenvolvedor");
d.setNivel("Senior");

Departamento dept = new Departamento();
dept.setNome("TI");
dept.adicionarFuncionario(f);
dept.adicionarFuncionario(g);
dept.adicionarFuncionario(d);

Projeto p = new Projeto();
p.setNome("Projeto X");
p.setOrcamento(100000.0);
p.adicionarFuncionario(f);
p.adicionarFuncionario(d);

Empresa e = new Empresa();
e.setNome("Tech Solutions");
e.adicionarDepartamento(dept);
e.adicionarProjeto(p);

FolhaPagamento fp = new FolhaPagamento();
double totalSalarios = fp.calcularFolha(dept.getFuncionarios());
```

#### Saída:

```java
System.out.println(f.getNome()); // "João"
System.out.println(f.calcularSalario()); // 3000.0

System.out.println(g.getNome()); // "Maria"
System.out.println(g.calcularSalario()); // 6000.0

System.out.println(v.getNome()); // "Carlos"
System.out.println(v.calcularSalario()); // 2500.0

System.out.println(d.getNome()); // "Ana"
System.out.println(d.calcularSalario()); // 5000.0

System.out.println("Total de Salários: " + totalSalarios); // 14000.0
```

### Explicação dos Conceitos:

*   **Encapsulamento**: A classe `Funcionario` possui atributos privados `nome`, `salarioBase` e `cargo`, acessíveis apenas através dos métodos getters e setters.
*   **Herança**: As classes `Gerente`, `Vendedor` e `Desenvolvedor` herdam da classe `Funcionario`, reutilizando seus atributos e métodos.
*   **Polimorfismo**: O método `calcularSalario` é sobrescrito nas classes `Gerente`, `Vendedor` e `Desenvolvedor`, permitindo diferentes implementações.
*   **Abstração**: A classe `Pessoa` é abstrata e define um contrato que a classe `Funcionario` deve implementar. A interface `Bonificavel` define um contrato que a classe `Gerente` deve implementar.
*   **Regras de Negócio**: A classe `Departamento` gerencia uma lista de funcionários, a classe `Projeto` gerencia uma lista de funcionários e um orçamento, e a classe `Empresa` gerencia listas de departamentos e projetos. A classe `FolhaPagamento` calcula o total de salários a serem pagos.

### Tabela de Cálculos

| Tipo de Funcionário | Nome | Salário Base | Bônus | Comissão | Nível | Salário Calculado |
| --- | --- | --- | --- | --- | --- | --- |
| FuncionarioComum | João | 3000.0 | \- | \- | \- | 3000.0 |
| Gerente | Maria | 5000.0 | 1000.0 | \- | \- | 6000.0 |
| Vendedor | Carlos | 2000.0 | \- | 500.0 | \- | 2500.0 |
| Desenvolvedor | Ana | 4000.0 | \- | \- | Senior | 5000.0 |
