
import java.util.List;

public class FolhaPagamento {
    public double calcularFolha(List<Funcionario> funcionarios) {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.calcularSalario();
        }
        return totalSalarios;
    }
}
