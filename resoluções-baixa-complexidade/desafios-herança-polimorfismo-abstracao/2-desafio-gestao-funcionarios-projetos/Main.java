
import java.util.ArrayList;
import java.util.List;

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

        System.out.println(f.getNome()); // "João"
        System.out.println(f.calcularSalario()); // 3000.0

        System.out.println(g.getNome()); // "Maria"
        System.out.println(g.calcularSalario()); // 6000.0

        System.out.println(v.getNome()); // "Carlos"
        System.out.println(v.calcularSalario()); // 2500.0

        System.out.println(d.getNome()); // "Ana"
        System.out.println(d.calcularSalario()); // 6000.0

        System.out.println("Total de Salários: " + totalSalarios); // 14000.0
    }
}
