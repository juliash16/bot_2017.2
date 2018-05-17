package persist;

//(ctrl + shif + o)
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public abstract class DAO {
	
	private static final String URL = "jdbc:mysql://localhost/aula08"; // statico cia um campo unico para ele (compartilham mesmo espa�o de memoria0
	private static final String USER = "root"; // final = constante
	private static final String PASSWORD = "";

	public DAO() {
		
		/* try-catch: Tratamento de exce��o do Java, 
		 * utilizando quando preisamos controlar um 
		 * possivel erro */
		
		try {
			// Driver de conexcao
			Class.forName("com.mysql.jdbc.Driver"); // Driver � a classe - jdbc � o pacote - dominio � o mysql.com
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // Detalha o erro
			// Sa�da da mensagem de erro
			System.out.println("Erro ao selecionar o driver: " + e.getMessage());
		}
	}
	
	protected Connection abrirConexao() throws SQLException {
		// Cont�m uma conex�o com o banco de dados
		Connection conn;
		// DriverManager: abre a conex�o com o banco
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		// Retorna a conex�o a quem de direito
		return conn;
	}
}













