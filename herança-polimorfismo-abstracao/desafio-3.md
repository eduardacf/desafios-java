### Desafio 3: Sistema de Gestão de Produtos

#### Encapsulamento:

*   Crie uma classe `Produto` com os seguintes atributos:
    *   `nome` (String): Nome do produto.
    *   `preco` (double): Preço do produto.
    *   `categoria` (String): Categoria do produto.
*   Utilize modificadores de acesso `private` para proteger esses atributos.
*   Forneça métodos getters e setters para acessar e modificar esses atributos:
    *   `getNome()`: Retorna o nome do produto.
    *   `setNome(String nome)`: Define o nome do produto.
    *   `getPreco()`: Retorna o preço do produto.
    *   `setPreco(double preco)`: Define o preço do produto.
    *   `getCategoria()`: Retorna a categoria do produto.
    *   `setCategoria(String categoria)`: Define a categoria do produto.

#### Herança:

*   Crie uma classe `Eletronico` que herda da classe `Produto`.
*   Adicione um atributo `garantia` (int) à classe `Eletronico`:
    *   `getGarantia()`: Retorna o período de garantia do produto eletrônico.
    *   `setGarantia(int garantia)`: Define o período de garantia do produto eletrônico.

#### Polimorfismo:

*   Na classe `Produto`, crie um método `calcularDesconto` que retorna o preço com desconto:
    *   `calcularDesconto()`: Retorna o preço do produto com um desconto padrão de 5%.
*   Na classe `Eletronico`, sobrescreva o método `calcularDesconto` para incluir um desconto adicional para produtos eletrônicos:
    *   `calcularDesconto()`: Retorna o preço do produto eletrônico com um desconto de 10%.

#### Abstração:

*   Crie uma interface `Vendavel` com um método `getCodigoDeBarras`:
    *   `getCodigoDeBarras()`: Método que deve ser implementado pelas classes que implementam a interface para retornar o código de barras do produto.
*   Faça a classe `Produto` implementar a interface `Vendavel` e implemente o método `getCodigoDeBarras`:
    *   `getCodigoDeBarras()`: Retorna o código de barras do produto.

### Exemplo de Entrada e Saída:

```java
Produto p = new Produto();
p.setNome("Cadeira");
p.setPreco(150.0);
p.setCategoria("Móveis");

Eletronico e = new Eletronico();
e.setNome("Televisão");
e.setPreco(2000.0);
e.setCategoria("Eletrônicos");
e.setGarantia(24);

System.out.println(p.getNome()); // "Cadeira"
System.out.println(p.calcularDesconto()); // 142.5 (assumindo um desconto de 5%)

System.out.println(e.getNome()); // "Televisão"
System.out.println(e.calcularDesconto()); // 1800.0 (assumindo um desconto de 10%)
```

### Tabela de Cálculos:

| Tipo de Produto | Nome | Preço Base | Desconto | Preço com Desconto |
| --- | --- | --- | --- | --- |
| Produto | Cadeira | 150.0 | 5% | 142.5 |
| Eletronico | Televisão | 2000.0 | 10% | 1800.0 |
