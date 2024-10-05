public class Main {
    public static void main(String[] args) {
        // Criar instância do sistema de votação
        SistemaVotacao sistema = new SistemaVotacao();

        // Adicionar eleitores
        Eleitor eleitor1 = new Eleitor("123456");
        sistema.adicionarEleitor(eleitor1);

        // Adicionar candidatos
        Candidato candidatoA = new Candidato("Candidato A");
        Candidato candidatoB = new Candidato("Candidato B");
        sistema.adicionarCandidato(candidatoA);
        sistema.adicionarCandidato(candidatoB);

        // Exemplo 1: Login e Autenticação
        System.out.println(sistema.login("123456")); // Login bem-sucedido.
        System.out.println(sistema.login("654321")); // ID inválido. Tentativa 1 de 3.
        System.out.println(sistema.login("654321")); // ID inválido. Tentativa 2 de 3.
        System.out.println(sistema.login("654321")); // ID inválido. Tentativa 3 de 3.
        System.out.println(sistema.login("654321")); // Usuário bloqueado após três tentativas de login falhas.

        // Exemplo 2: Tela de Votação
        System.out.println(sistema.votar("123456", "Candidato A")); // Você selecionou o Candidato A.
        System.out.println(sistema.votar("123456", "Candidato B")); // Você já votou. Não é possível votar novamente.

        // Exemplo 3: Confirmação de Voto
        System.out.println(sistema.confirmarVoto(true)); // Seu voto foi registrado com sucesso.
        System.out.println(sistema.confirmarVoto(false)); // Erro ao registrar o voto. Tente novamente.

        // Exemplo 4: Contagem de Votos
        System.out.println(sistema.contarVotos()); // Candidato A: 1 votos, Candidato B: 0 votos
    }
}
