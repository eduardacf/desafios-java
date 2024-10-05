
public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("João");
        f.setSalarioBase(3000.0);
        f.setCargo("Desenvolvedor");

        Gerente g = new Gerente();
        g.setNome("Maria");
        g.setSalarioBase(5000.0);
        g.setCargo("Gerente de Projetos");
        g.setBonus(1000.0);

        System.out.println(f.getNome()); // "João"
        System.out.println(f.calcularSalario()); // 3000.0

        System.out.println(g.getNome()); // "Maria"
        System.out.println(g.calcularSalario()); // 6000.0
    }
}
