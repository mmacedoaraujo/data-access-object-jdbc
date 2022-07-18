# Acesso a banco de dados com JDBC / Access to database with JDBC

Esse programa tem como objetivo realizar conexão com um banco de dados através do JDBC com padrão de projeto <a href=" " title="Data Access Object">DAO</a>. Esse projeto foi realizado no Eclipse durante um curso de Java e aqui vou listar conhecimentos que considero importantes ressaltar para fins de aprendizado.
## Aprendizados

Nesse projeto pude pela primeira vez realizar uma conexão com um banco de dados, banco de dados que conta com duas tabelas (Sellers e Department). Para fornecer os dados de conexão foi usado o arquivo <a href="https://github.com/mmacedoaraujo/data-access-object-jdbc/blob/master/db.properties">db.properties</a>.



- <a href="https://github.com/mmacedoaraujo/data-access-object-jdbc/blob/master/src/model/dao/impl/SellerDaoJdbc.java">SellerDaoJdbc</a> classe com os métodos de manipulação da tabela de Sellers.
- <a href="https://github.com/mmacedoaraujo/data-access-object-jdbc/blob/master/src/model/dao/impl/DepartmentDaoJdbc.java">DepartmentDaoJdbc</a> classe com os métodos de manipulação da tabela Department.
