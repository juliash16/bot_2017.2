package persist;

//(ctrl + shif + o)
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public abstract class DAO {
	
	private static final String URL = "jdbc:mysql://localhost/aula08"; // statico cia um campo unico para ele (compartilham mesmo espaço de memoria0
	private static final String USER = "root"; // final = constante
	private static final String PASSWORD = "";

	public DAO() {
		
		/* try-catch: Tratamento de exceção do Java, 
		 * utilizando quando preisamos controlar um 
		 * possivel erro */
		
		try {
			// Driver de conexcao
			Class.forName("com.mysql.jdbc.Driver"); // Driver é a classe - jdbc é o pacote - dominio é o mysql.com
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // Detalha o erro
			// Saída da mensagem de erro
			System.out.println("Erro ao selecionar o driver: " + e.getMessage());
		}
	}
	
	protected Connection abrirConexao() throws SQLException {
		// Contém uma conexão com o banco de dados
		Connection conn;
		// DriverManager: abre a conexão com o banco
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		// Retorna a conexão a quem de direito
		return conn;
	}
}













