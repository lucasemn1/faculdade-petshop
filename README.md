# Petshop
## Descrição
Este projeto é um sistema de Petshop desenvolvido em Java utilizando o framework Spring Boot. O objetivo do sistema é fornecer funcionalidades para gerenciamento de um petshop, como cadastro de clientes, agendamento de consultas e registro de animais.

## Dependências
Para executar o projeto, é necessário ter as seguintes dependências instaladas:

- Docker

## Configuração do Banco de Dados
Para criar o banco de dados necessário para o funcionamento do sistema, execute o seguinte comando no terminal:

```shell
$ docker run --name petshop -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE=petshop -e MYSQL_USER=exemplo -e MYSQL_PASSWORD=123 -p 3306:3306 -d mysql:latest
```
