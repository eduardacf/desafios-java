public class Main {
    public static void main(String[] args) {
        Escritorio escritorio = new Escritorio();

        // Adicionando um novo material
        System.out.println(escritorio.adicionarMaterial(4, "Caderno", 15));

        // Usando materiais
        System.out.println(escritorio.usarMaterial(1, 10));
        System.out.println(escritorio.usarMaterial(2, 40));
    }
}