### Sistema de Gerenciamento de Materiais de Escritório

### O Desafio

Você foi contratado para desenvolver um sistema muito simples para gerenciar os materiais de um escritório. Sua missão será criar a lógica para adicionar materiais e usar materiais.

### Materiais Existentes

O escritório possui os seguintes materiais:

**Tabela**

| ID | Nome | Quantidade |
| --- | --- | --- |
| 1 | “Caneta” | 50 |
| 2 | “Lápis” | 30 |
| 3 | “Borracha” | 20 |

### Regras para Gerenciamento de Materiais

1.  O sistema deve permitir adicionar novos materiais.
2.  O sistema deve permitir usar materiais, atualizando a quantidade disponível.

### Entradas e Saídas

1.  O programa deve receber o ID do material e a quantidade para realizar uma utilização.
2.  O programa deve retornar uma mensagem de sucesso ou erro, dependendo da operação.

### Exemplos

**Adicionar um novo material**

```java
adicionarMaterial(4, "Caderno", 15);
```

Saída

```plaintext
{
  "mensagem": "Material adicionado com sucesso. Quantidade atual: 15"
}
```

---

**Usar um material**

```plaintext
usarMaterial(1, 10);
```

Saída

```plaintext
{
  "mensagem": "Material usado com sucesso. Quantidade atual: 40"
}
```

---

**Usar um material com quantidade insuficiente**

```plaintext
usarMaterial(2, 40);
```

Saída

```plaintext
{
  "erro": "Quantidade insuficiente no estoque"
}
```