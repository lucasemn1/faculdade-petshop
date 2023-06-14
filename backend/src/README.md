# Criando o banco de dados

``` $ docker run --name petshop -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE=petshop -e MYSQL_USER=exemplo -e MYSQL_PASSWORD=123 -p 3306:3306 -d mysql:latest ```