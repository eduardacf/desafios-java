
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos = new ArrayList<>();
    private List<Projeto> projetos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void removerDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public void removerProjeto(Projeto projeto) {
        projetos.remove(projeto);
    }
}
