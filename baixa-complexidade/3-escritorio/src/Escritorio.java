import java.util.ArrayList;
import java.util.List;

public class Escritorio {
    private List<Material> materiais = new ArrayList<>();

    public Escritorio() {
        // Adicionando materiais existentes
        materiais.add(new Material(1, "Caneta", 50));
        materiais.add(new Material(2, "Lápis", 30));
        materiais.add(new Material(3, "Borracha", 20));
    }

    public String adicionarMaterial(int id, String nome, int quantidade) {
        for (int i = 0; i < materiais.size(); i++) {
            if (materiais.get(i).id == id) {
                return "{\"erro\": \"Material com este ID já existe.\"}";
            }
        }
        materiais.add(new Material(id, nome, quantidade));
        return "{\"mensagem\": \"Material adicionado com sucesso. Quantidade atual: " + quantidade + "\"}";
    }

    public String usarMaterial(int id, int quantidade) {
        for (int i = 0; i < materiais.size(); i++) {
            Material material = materiais.get(i);
            if (material.id == id) {
                if (material.quantidade < quantidade) {
                    return "{\"erro\": \"Quantidade insuficiente no estoque.\"}";
                }
                material.quantidade = material.quantidade - quantidade;
                return "{\"mensagem\": \"Material usado com sucesso. Quantidade atual: " + material.quantidade + "\"}";
            }
        }
        return "{\"erro\": \"Material não encontrado.\"}";
    }
}