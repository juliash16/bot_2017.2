package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Endereco;

public class EnderecoDAO extends DAO{

	private Connection conn;

	public EnderecoDAO() {
		try {
			conn = abrirConexao();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir conexao: "+ e.getMessage());
		}
	}
	
	
	public void save(Endereco e) throws SQLException { // void pq não traz nada do banco
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into endereco values (null, ?, ?, ?, ?, ?)");
			stmt.setString(1, e.getLogradouro());
			stmt.setString(2, e.getBairro());
			stmt.setString(3, e.getCidade());
			stmt.setString(4, e.getCep());
			stmt.setInt(5, e.getPessoa().getId());
			
			int flag = stmt.executeUpdate(); // Retorna "0" caso ocorra uma falha
			
			if(flag == 0) {
				throw new SQLException("Erro ao gravar no banco");
			}
		} finally {
			if(stmt != null) 
				stmt.close();
			
			if(conn != null) 
				conn.close();
				
		}
	}
	
	public Endereco localizaEndereco(int id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("select * from endereco where id = ?");
			stmt.setInt(1, id);
			
			// Vai carregar o rs com o resultado do banco
			rs = stmt.executeQuery();
			Endereco end = null;
			
			if(rs.next()) {
				end = criaObjEndereco(rs);
			}
			
			return end;
		} finally {
			if(stmt != null)
				stmt.close();
			if(conn != null) 
				conn.close();
			if(rs != null) 
				rs.close();
		}
	}
	
	// Metodo para buscar todos os endereços
	public List<Endereco> buscarEnderecos(/*o parametro de entrada n é mais necessario*/) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("select * from endereco");
			
			// Vai carregar o rs com o resultado do banco
			rs = stmt.executeQuery();
			// recebe uma coleção de endereços
			List<Endereco> listaEndereco = new ArrayList<Endereco>(); //array conjunto de listas
			
			while(rs.next()) {
				listaEndereco.add(criaObjEndereco(rs));
			}
			return listaEndereco;
		} finally {
			if(stmt != null)
				stmt.close();
			if(conn != null) 
				conn.close();
			if(rs != null) 
				rs.close();
		}
	}
	
	// Metodo excluir Endereço
	public void excluiEndereco(int id) throws SQLException { // void pq não traz nada do banco
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("delete from endereco where id = ?");
			stmt.setInt(1, id);
			
			int flag = stmt.executeUpdate();
			
			if (flag == 0) {
				 throw new SQLException("Erro ao excluir endereço do banco");
			}
			
			} finally {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
	}
	
	// Metodo para atualizar
	public void atualizaEndereco(Endereco e) throws SQLException { // void pq não traz nada do banco
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("update endereco set logradouro = ?, bairro = ?, cidade = ?, cep = ? where id = ?");
			stmt.setString(1, e.getLogradouro());
			stmt.setString(2, e.getBairro());
			stmt.setString(3, e.getCidade());
			stmt.setString(4, e.getCep());
			stmt.setInt(5, e.getId());
			
			int flag = stmt.executeUpdate();
			
			if (flag == 0) {
				 throw new SQLException("Erro ao atualizar o banco");
			}
			
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}
	
	private Endereco criaObjEndereco(ResultSet rs) throws SQLException { //Entrega o obj montado
		// Criação da referencia e instancia de Endereco
		Endereco endereco = new Endereco();
		
		endereco.setId(rs.getInt(1)); // No lugar do 1 pode ser o nome da coluna (numero é melhor) 
		endereco.setLogradouro(rs.getString(2));
		endereco.setBairro(rs.getString(3));
		endereco.setCidade(rs.getString(4));
		endereco.setCep(rs.getString(5));
		
		return endereco;
		
	}
	
}
