
public class Funcionario extends Pessoa {
    private double salarioBase;
    private String cargo;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String getIdentificacao() {
        return getNome();
    }
}
