# Acesso a banco de dados com JDBC / Access to database with JDBC

Esse programa tem como objetivo realizar conexão com um banco de dados através do JDBC com padrão de projeto <a href=" " title="Data Access Object">DAO</a>. Esse projeto foi realizado no Eclipse durante um curso de Java e aqui vou listar conhecimentos que considero importantes ressaltar para fins de aprendizado.
## Aprendizados

Nesse projeto pude pela primeira vez realizar uma conexão com um banco de dados, banco de dados que conta com duas tabelas (Sellers e Department). Para fornecer os dados de conexão foi usado o arquivo <a href="https://github.com/mmacedoaraujo/data-access-object-jdbc/blob/master/db.properties">db.properties</a>. Em seguida criamos o pacote db e a classe <a href="https://github.com/mmacedoaraujo/data-access-object-jdbc/blob/master/src/db/DB.java">DB</a>, essa que possui os seguintes métodos:

```java 
private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
/*Esse método começa buscando os dados no arquivo db.properties através do FileInputStream,
 *logo após instancia um objeto Properties com nome props
 *e carrega as informações obtidas no FileInputStream fs. 
 *Em seguida retornamos o props para o método.
 *No catch adicionamos uma exceção personalizada DbException
 */
```

```java
private static Connection conn = null;
	//This method starts the connection
	public static Connection getConnection() {
		if (conn == null) {
			try {
				//this line loads the properties
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
/*Esse método inicia testando a conexão com o if,
 * caso não haja conexão iniciamos o bloco try
 * instanciando um objeto Properties props agora reutilizando
 * o método loadProperties para buscar os dados do banco de dados.
 * Criamos uma String url para conter o url do banco de dados obtido através do props.getProperty("espefico a property do db.properties");
 * Agora atribuímos à variável conn o DriverManager com o método .getConnection(url, props) para iniciar a conexão com o banco de dados.
 */
```


- <a href="https://github.com/mmacedoaraujo/data-access-object-jdbc/blob/master/src/model/dao/impl/SellerDaoJdbc.java">SellerDaoJdbc</a> classe com os métodos de manipulação da tabela de Sellers.

- <a href="https://github.com/mmacedoaraujo/data-access-object-jdbc/blob/master/src/model/dao/impl/DepartmentDaoJdbc.java">DepartmentDaoJdbc</a> classe com os métodos de manipulação da tabela Department.
