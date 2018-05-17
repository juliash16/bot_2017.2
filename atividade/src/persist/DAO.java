package persist;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	private static final String HOST = "jdbc:mysql://localhost/aula12"; // URL
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public DAO () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Erro ao tentar encontrar o Drive"+ e.getMessage());
		}
	}
	
	protected Connection abrirConexao() throws Exception {
		Connection conn;
		
		conn = DriverManager.getConnection(HOST, USER, PASSWORD);
		
		return conn;
	}
	
}
