public class Main {
    public static void main(String[] args) {
        GerenciamentoAlunos gerenciamentoAlunos = new GerenciamentoAlunos();

        // Adicionar novos alunos
        System.out.println(gerenciamentoAlunos.adicionarAluno("Maria Silva", 20, "20231001"));
        System.out.println(gerenciamentoAlunos.adicionarAluno("João Souza", 22, "20231002"));
        System.out.println(gerenciamentoAlunos.adicionarAluno("Ana Costa", 19, "20231003"));

        // Listar todos os alunos
        System.out.println("Lista de todos os alunos:");
        System.out.println(gerenciamentoAlunos.listarTodosAlunos());

        // Buscar um aluno pela matrícula
        System.out.println("Buscar aluno '20231001':");
        System.out.println(gerenciamentoAlunos.buscarAluno("20231001"));

        // Remover um aluno pela matrícula
        System.out.println("Remover aluno '20231003':");
        System.out.println(gerenciamentoAlunos.removerAluno("20231003"));

        // Listar todos os alunos após remoção
        System.out.println("Lista de todos os alunos após remoção:");
        System.out.println(gerenciamentoAlunos.listarTodosAlunos());
    }
}