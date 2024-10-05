
public class Desenvolvedor extends Funcionario {
    private String nivel;

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase();
        if ("Junior".equalsIgnoreCase(nivel)) {
            salario += 500;
        } else if ("Pleno".equalsIgnoreCase(nivel)) {
            salario += 1000;
        } else if ("Senior".equalsIgnoreCase(nivel)) {
            salario += 2000;
        }
        return salario;
    }
}
