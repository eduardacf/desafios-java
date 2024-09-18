## Sistema de Gerenciamento de Consultas Médicas

#### Requisitos Detalhados

**1\. Médico**  
  - Cada médico tem um ID, nome, especialidade, e-mail e lista de consultas agendadas.  
  - Deve ser possível adicionar, remover e atualizar médicos no sistema.  
  - Deve ser possível listar todos os médicos por especialidade.  
  - Deve ser possível verificar a disponibilidade de um médico em um determinado horário.

**2\. Paciente**  
  - Cada paciente tem um ID, nome, e-mail, telefone e lista de consultas agendadas.  
  - Deve ser possível adicionar, remover e atualizar pacientes no sistema.  
  - Deve ser possível listar todos os pacientes.  
  - Deve ser possível verificar o histórico de consultas de um paciente.

**3\. Consulta**  
  - Cada consulta tem um ID, médico, paciente, data e hora da consulta, e status (agendada, realizada, cancelada).  
  - Deve ser possível agendar, atualizar e cancelar consultas.  
  - O sistema deve verificar se o médico e o paciente estão disponíveis no horário antes de agendar a consulta.  
  - Deve ser possível listar todas as consultas de um médico específico.  
  - Deve ser possível listar todas as consultas de um paciente específico.  
  - Deve ser possível marcar uma consulta como realizada.  
  - Deve ser possível remarcar uma consulta.  
  - Deve ser possível listar consultas por status (agendada, realizada, cancelada).

**4\. Relatórios**  
  - Deve ser possível gerar um relatório de consultas por médico e por período.  
  - Deve ser possível gerar um relatório de consultas por paciente e por período.  
  - Deve ser possível gerar um relatório de consultas por especialidade médica.  
  - Deve ser possível gerar um relatório de consultas canceladas por período.

**5\. Notificações**  
  - O sistema deve enviar uma notificação por e-mail para o paciente e o médico ao agendar, atualizar ou cancelar uma consulta.  
  - O sistema deve enviar lembretes de consulta por e-mail para o paciente e o médico um dia antes da consulta.

**6\. Horários de Funcionamento**  
  - O sistema deve permitir configurar os horários de funcionamento da clínica.  
  - O sistema deve verificar se a consulta está sendo agendada dentro dos horários de funcionamento da clínica.  
  - Deve ser possível configurar horários de atendimento específicos para cada médico.

**7\. Sala de Consulta**  
  - Cada sala de consulta tem um ID, nome e lista de consultas agendadas.  
  - Deve ser possível adicionar, remover e atualizar salas de consulta no sistema.  
  - Deve ser possível listar todas as salas de consulta.  
  - O sistema deve verificar a disponibilidade da sala de consulta antes de agendar uma consulta.  
  - Deve ser possível listar todas as consultas agendadas em uma sala específica.

**8\. Pagamentos**  
  - Cada pagamento tem um ID, consulta, valor, data e status (pendente, pago, cancelado).  
  - Deve ser possível registrar, atualizar e cancelar pagamentos.  
  - Deve ser possível listar todos os pagamentos de um paciente específico.  
  - Deve ser possível listar todos os pagamentos de um médico específico.  
  - Deve ser possível gerar um relatório de pagamentos por período.

**Exemplos de Entrada e Saída** **Exemplo** 

**1: Adicionar Médico**

```java
Médico medico1 = new Médico("1", "Dr. João Silva", "Cardiologia", "joao.silva@example.com");
sistema.adicionarMédico(medico1);
```

**Saída:** Médico adicionado com sucesso.

---

**Exemplo 2: Adicionar Paciente**

```java
Paciente paciente1 = new Paciente("1", "Maria Oliveira", "maria.oliveira@example.com", "123456789");
sistema.adicionarPaciente(paciente1);
```

**Saída:** Paciente adicionado com sucesso.

---

**Exemplo 3: Agendar Consulta**

```java
sistema.agendarConsulta("1", "1", "2023-05-01 10:00");
```

**Saída:** Consulta agendada com sucesso.

---

**Exemplo 4: Listar Consultas de um Médico**

```java
List<Consulta> consultasDoMedico = sistema.listarConsultasPorMédico("1");
for (Consulta consulta : consultasDoMedico) {
    System.out.println(consulta.getDataHora());
}
```

**Saída:**

```plaintext
2023-05-01 10:00
```

---

**Exemplo 5: Gerar Relatório de Consultas por Médico**

```java
sistema.gerarRelatórioDeConsultasPorMédico();
```

**Saída:**

```plaintext
Médico: Dr. João Silva
 - Consulta: 2023-05-01 10:00, Paciente: Maria Oliveira
```

---

**Exemplo 6: Listar Médicos por Especialidade**

```java
List<Médico> cardiologistas = sistema.listarMédicosPorEspecialidade("Cardiologia");
for (Médico medico : cardiologistas) {
    System.out.println(medico.getNome());
}
```

**Saída:**

```plaintext
Dr. João Silva
Dr. Ana Pereira
```

---

**Exemplo 7: Verificar Disponibilidade de Médico**

```java
boolean disponivel = sistema.verificarDisponibilidadeMédico("1", "2023-05-01 10:00");
System.out.println(disponivel);
```

**Saída:**

```plaintext
true
```

---

**Exemplo 8: Marcar Consulta como Realizada**

```java
sistema.marcarConsultaComoRealizada("1");
```

**Saída:** Consulta marcada como realizada com sucesso.

---

**Exemplo 9: Enviar Notificação de Agendamento**

```java
sistema.enviarNotificaçãoAgendamento("1", "1", "2023-05-01 10:00");
```

**Saída:** Notificação de agendamento enviada com sucesso.

---

**Exemplo 10: Registrar Pagamento**

```java
Pagamento pagamento1 = new Pagamento("1", "1", 200.00, "2023-05-01", "pago");
sistema.registrarPagamento(pagamento1);
```

**Saída:** Pagamento registrado com sucesso.

---

**Exemplo 11: Listar Consultas de um Paciente**

```java
List<Consulta> consultasDoPaciente = sistema.listarConsultasPorPaciente("1");
for (Consulta consulta : consultasDoPaciente) {
    System.out.println(consulta.getDataHora());
}
```

**Saída:**

```plaintext
2023-05-01 10:00
```

---

**Exemplo 12: Gerar Relatório de Consultas por Paciente**

```java
sistema.gerarRelatórioDeConsultasPorPaciente();
```

**Saída:**

```plaintext
Paciente: Maria Oliveira
 - Consulta: 2023-05-01 10:00, Médico: Dr. João Silva
```

---

**Exemplo 13: Configurar Horários de Funcionamento da Clínica**

```java
sistema.configurarHorariosDeFuncionamento("08:00", "18:00");
```

**Saída:** Horários de funcionamento configurados com sucesso.

---

**Exemplo 14: Verificar Disponibilidade de Sala de Consulta**

```java
boolean disponivel = sistema.verificarDisponibilidadeSala("1", "2023-05-01 10:00");
System.out.println(disponivel);
```

**Saída:**

```plaintext
true
```

---

**Exemplo 15: Listar Consultas em uma Sala Específica**

```java
List<Consulta> consultasNaSala = sistema.listarConsultasPorSala("1");
for (Consulta consulta : consultasNaSala) {
    System.out.println(consulta.getDataHora());
}
```

**Saída:**

```plaintext
2023-05-01 10:00
```

---

**Exemplo 16: Gerar Relatório de Consultas por Especialidade Médica**

```java
sistema.gerarRelatórioDeConsultasPorEspecialidade();
```

**Saída:**

```plaintext
Especialidade: Cardiologia
 - Consulta: 2023-05-01 10:00, Médico: Dr. João Silva, Paciente: Maria Oliveira
```

---

**Exemplo 17: Cancelar Consulta**

```java
sistema.cancelarConsulta("1");
```

**Saída:** Consulta cancelada com sucesso.

---

**Exemplo 18: Remarcar Consulta**

```java
sistema.remarcarConsulta("1", "2023-05-02 11:00");
```

**Saída:** Consulta remarcada com sucesso.

---

**Exemplo 19: Gerar Relatório de Consultas Canceladas por Período**

```java
sistema.gerarRelatórioDeConsultasCanceladas("2023-05-01", "2023-05-31");
```

**Saída:**

```plaintext
Consultas Canceladas:
 - Consulta: 2023-05-01 10:00, Médico: Dr. João Silva, Paciente: Maria Oliveira
```

---

**Exemplo 20: Listar Todos os Pacientes**

```java
List<Paciente> pacientes = sistema.listarTodosOsPacientes();
for (Paciente paciente : pacientes) {
    System.out.println(paciente.getNome());
}
```

**Saída:**

```plaintext
Maria Oliveira
João Santos
```
