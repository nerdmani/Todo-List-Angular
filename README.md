# Teste Prático para Desenvolvedor Full Stack

Este repositório contém o teste prático para a vaga de Desenvolvedor Full Stack.

## Descrição do Projeto

Desenvolver uma aplicação de gerenciamento de tarefas (todo list) com as seguintes funcionalidades:

### Cadastro de Usuários:
- Criar, editar, excluir e listar usuários.
- Cada usuário deve ter um nome e nível (admin, user).

### Gerenciamento de Tarefas:
- Criar, editar, excluir e listar tarefas.
- Cada tarefa deve ter um título, descrição, data de criação, data de vencimento, status (pendente, em andamento, concluída) e um usuário associado.

### Filtros e Ordenação:
- Permitir que as tarefas sejam filtradas por status.
- Permitir que as tarefas sejam ordenadas por data de vencimento.

### Associação de Tarefas a Usuários:
- Permitir que tarefas sejam atribuídas a usuários específicos.
- Permitir que as tarefas de um usuário específico sejam listadas.

### Aplicação de Testes Unitários:
- Os métodos do backend devem ser testados com JUnit e Mockito.
- Os componentes e serviços do frontend devem ser testados com Jasmine e Karma.

## Requisitos Técnicos

### Backend:
- Java 11 ou superior
- Spring Boot
- Banco de Dados Relacional (H2 para facilitar os testes)
- JPA/Hibernate
- Maven
- Spring Security
- Spring Data JPA
- JUnit e Mockito para testes

### Frontend:
- Angular 11 ou superior
- TypeScript
- Testes unitários e de integração com Jasmine e Karma

## Instruções para Implementação

### Clone os Repositórios:

```bash
git clone https://github.com/ManagerThalles/fullStack-Spring-Angular.git
cd fullStack-Spring-Angular
```

### Backend

```bash
cd backend
chmod +x setup.sh
./setup.sh
```

### Frontend

```bash
cd frontend
ng new [nome projeto]
```

## Estrutura do Projeto
- backend: Deve Conter a aplicação Spring Boot com a lógica de negócios e integração com o banco de dados.
- frontend: Deve Conter a aplicação Angular com a interface do usuário e comunicação com o backend via API REST.

## Envio do Projeto
O candidato deve enviar o link do repositório (GitHub) contendo o código-fonte do projeto, junto com um arquivo README.md explicando como configurar e executar a aplicação.

Boa sorte!


# Todo-List-Angular-
