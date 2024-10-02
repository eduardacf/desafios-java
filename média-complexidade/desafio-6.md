# Sistema de Votação Eletrônica

**Descrição Geral**:
Vamos criar um programa onde as pessoas podem votar em candidatos para uma eleição. Cada pessoa precisa se identificar antes de votar, e cada voto deve ser registrado de forma segura e anônima.

## Funcionalidades e Regras de Negócio

1. **Login e Autenticação**
   - **Regra Positiva**: O usuário deve se identificar com um ID único (por exemplo, um número de registro de eleitor).
   - **Regra Negativa**: O sistema deve bloquear o usuário após três tentativas de login falhas.
   
2. **Tela de Votação**
   - **Regra Positiva**: O usuário pode ver a lista de candidatos e escolher um para votar.
   - **Regra Negativa**: O usuário não pode votar em mais de um candidato.

3. **Confirmação de Voto**
   - **Regra Positiva**: O sistema deve mostrar uma tela de confirmação antes de registrar o voto.
   - **Regra Negativa**: O voto não pode ser alterado depois de confirmado.

4. **Contagem de Votos**
   - **Regra Positiva**: O sistema deve contar os votos para cada candidato e mostrar os resultados em tempo real.
   - **Regra Negativa**: O sistema deve impedir a contagem de votos duplicados.

## Exemplos de Entrada e Saída

1. **Login e Autenticação**
   - **Método**: `login(String idEleitor)`
   - **Entrada**: `login("123456")`
   - **Saída**: 
     - Sucesso: `Login bem-sucedido.`
     - Falha: `ID inválido. Tentativa 1 de 3.`

2. **Tela de Votação**
   - **Método**: `votar(String candidato)`
   - **Entrada**: `votar("Candidato A")`
   - **Saída**: 
     - Sucesso: `Você selecionou o Candidato A.`
     - Falha: `Você já votou. Não é possível votar novamente.`

3. **Confirmação de Voto**
   - **Método**: `confirmarVoto(boolean confirmacao)`
   - **Entrada**: `confirmarVoto(true)`
   - **Saída**: 
     - Sucesso: `Seu voto foi registrado com sucesso.`
     - Falha: `Erro ao registrar o voto. Tente novamente.`

4. **Contagem de Votos**
   - **Método**: `contarVotos()`
   - **Entrada**: `contarVotos()`
   - **Saída**: 
     - Sucesso: `Candidato A: 100 votos, Candidato B: 150 votos`
     - Falha: `Erro ao contar os votos. Tente novamente.`
