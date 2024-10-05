
public class Gerente extends Funcionario implements Bonificavel {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    @Override
    public double calcularBonus() {
        return bonus;
    }
}
