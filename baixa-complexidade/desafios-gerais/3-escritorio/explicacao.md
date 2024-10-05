### Classe `Material`

A classe `Material` representa um material de escritório. Ela possui três atributos: `id`, `nome` e `quantidade`. Aqui está a definição completa da classe:

```java
public class Material {
    int id;
    String nome;
    int quantidade;

    public Material(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Getters e Setters (opcional, dependendo da necessidade)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
```

### Classe `Escritorio`

A classe `Escritorio` é responsável por gerenciar a lista de materiais. Ela possui métodos para adicionar novos materiais e usar materiais existentes. 

### Atributos

`materiais`: Uma lista de objetos `Material` que representa os materiais disponíveis no escritório.

```java
import java.util.ArrayList;
import java.util.List;

public class Escritorio {
    private List<Material> materiais = new ArrayList<>();

    // Construtor
    public Escritorio() {
        // Adicionando materiais existentes
        materiais.add(new Material(1, "Caneta", 50));
        materiais.add(new Material(2, "Lápis", 30));
        materiais.add(new Material(3, "Borracha", 20));
    }

    // Método para adicionar um novo material
    public String adicionarMaterial(int id, String nome, int quantidade) {
        for (Material material : materiais) {
            if (material.getId() == id) {
                return "{\"erro\": \"Material com este ID já existe.\"}";
            }
        }
        materiais.add(new Material(id, nome, quantidade));
        return "{\"mensagem\": \"Material adicionado com sucesso. Quantidade atual: " + quantidade + "\"}";
    }

    // Método para usar um material existente
    public String usarMaterial(int id, int quantidade) {
        for (Material material : materiais) {
            if (material.getId() == id) {
                if (material.getQuantidade() < quantidade) {
                    return "{\"erro\": \"Quantidade insuficiente no estoque.\"}";
                }
                material.setQuantidade(material.getQuantidade() - quantidade);
                return "{\"mensagem\": \"Material usado com sucesso. Quantidade atual: " + material.getQuantidade() + "\"}";
            }
        }
        return "{\"erro\": \"Material não encontrado.\"}";
    }
}
```

### Detalhamento dos Métodos

### Construtor

O construtor da classe `Escritorio` inicializa a lista de materiais com alguns materiais predefinidos:

```java
public Escritorio() {
    // Adicionando materiais existentes
    materiais.add(new Material(1, "Caneta", 50));
    materiais.add(new Material(2, "Lápis", 30));
    materiais.add(new Material(3, "Borracha", 20));
}
```

**Objetivo**: Inicializar a lista de materiais com alguns materiais padrão.

**Funcionamento**: Adiciona três materiais (`Caneta`, `Lápis` e `Borracha`) com quantidades específicas à lista `materiais`.

### Método `adicionarMaterial`

Este método permite adicionar novos materiais ao sistema. Ele verifica se já existe um material com o mesmo ID antes de adicionar um novo material.

```java
public String adicionarMaterial(int id, String nome, int quantidade) {
    for (Material material : materiais) {
        if (material.getId() == id) {
            return "{\"erro\": \"Material com este ID já existe.\"}";
        }
    }
    materiais.add(new Material(id, nome, quantidade));
    return "{\"mensagem\": \"Material adicionado com sucesso. Quantidade atual: " + quantidade + "\"}";
}
```

**Objetivo**: Adicionar um novo material à lista de materiais.

**Parâmetros**:  

*   `id`: Identificador único do material.  
*   `nome`: Nome do material.  
*   `quantidade`: Quantidade inicial do material.

**Funcionamento**:  

 1. Itera sobre a lista de materiais para verificar se já existe um material com o mesmo ID.  
 2. Se encontrar um material com o mesmo ID, retorna uma mensagem de erro.  
 3. Caso contrário, adiciona o novo material à lista e retorna uma mensagem de sucesso com a quantidade atual.

### Método `usarMaterial`

Este método permite usar uma quantidade específica de um material existente. Ele atualiza a quantidade disponível do material.

```java
public String usarMaterial(int id, int quantidade) {
    for (Material material : materiais) {
        if (material.getId() == id) {
            if (material.getQuantidade() < quantidade) {
                return "{\"erro\": \"Quantidade insuficiente no estoque.\"}";
            }
            material.setQuantidade(material.getQuantidade() - quantidade);
            return "{\"mensagem\": \"Material usado com sucesso. Quantidade atual: " + material.getQuantidade() + "\"}";
        }
    }
    return "{\"erro\": \"Material não encontrado.\"}";
}
```

**Objetivo**: Usar uma quantidade específica de um material existente e atualizar a quantidade disponível.

**Parâmetros**:  

*   `id`: Identificador único do material.  
*   `quantidade`: Quantidade a ser usada.

**Funcionamento**:  

 1. Itera sobre a lista de materiais para encontrar o material com o ID fornecido.  
 2. Se encontrar o material, verifica se a quantidade disponível é suficiente.  
 3. Se a quantidade disponível for insuficiente, retorna uma mensagem de erro.  
 4. Caso contrário, atualiza a quantidade do material subtraindo a quantidade usada e retorna uma mensagem de sucesso com a quantidade atual.  
 5. Se não encontrar o material com o ID fornecido, retorna uma mensagem de erro indicando que o material não foi encontrado.

### Exemplo de Uso

Aqui está um exemplo de como você pode usar a classe `Escritorio`:

```java
public class Main {
    public static void main(String[] args) {
        Escritorio escritorio = new Escritorio();

        // Adicionar um novo material
        System.out.println(escritorio.adicionarMaterial(4, "Caderno", 15));

        // Usar um material existente
        System.out.println(escritorio.usarMaterial(1, 10));

        // Tentar usar um material com quantidade insuficiente
        System.out.println(escritorio.usarMaterial(2, 40));

        // Tentar usar um material que não existe
        System.out.println(escritorio.usarMaterial(5, 10));
    }
}
```

**Saída esperada:**

```plaintext
{"mensagem": "Material adicionado com sucesso. Quantidade atual: 15"}
{"mensagem": "Material usado com sucesso. Quantidade atual: 40"}
{"erro": "Quantidade insuficiente no estoque."}
{"erro": "Material não encontrado."}
```

### Conclusão

O código fornecido implementa um sistema simples de gerenciamento de materiais de escritório. Ele permite adicionar novos materiais e usar materiais existentes, atualizando a quantidade disponível. O sistema também lida com casos de erro, como tentar adicionar um material com um ID já existente ou usar uma quantidade de material maior do que a disponível.