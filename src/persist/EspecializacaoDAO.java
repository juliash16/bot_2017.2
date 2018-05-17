package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Especializacao;
import entity.Professor;

public class EspecializacaoDAO extends DAO{

	private Connection conn;

	public EspecializacaoDAO() {
		try {
			conn = abrirConexao();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir conexao: "+ e.getMessage());
		}
	}
	

	public void save(Especializacao e) throws SQLException {
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into especializacao values (null, ?, ?)");
			stmt.setString(1, e.getTitulo());
			stmt.setInt(2, e.getProfessor().getId());
			
			int flag = stmt.executeUpdate(); // Retorna "0" caso ocorra uma falha e 1 se n tiver erro
			
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
	
	public Especializacao buscaEspecializacao(int id) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.prepareStatement("select * from especializacao where id = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery(); // dispara consulta para o banco de dados
			
			Especializacao espe = null;
			
			if(rs.next()) {
				espe = criaObjEspecializacao(rs); 
			}
			
			return espe;
			
		} finally {
			if(stmt != null)
				stmt.close();
			if(conn != null) 
				conn.close();
			if(rs != null)
				rs.close();
		}
		
	}
	
	public List<Especializacao> buscaEspecializacao() throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("select * from especializacao");
			
			rs = stmt.executeQuery();
			List<Especializacao> listaEspecializacao = new ArrayList<Especializacao>();
			
			while(rs.next()) {
				listaEspecializacao.add(criaObjEspecializacao(rs));
			}
			return listaEspecializacao;
			
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
			if (rs != null)
				rs.close();
		}
		
	}
	
	// Metodo excluir Especialização
	public void excluiEspecializacao(Especializacao esp) throws SQLException {
		PreparedStatement stmt = null;
			
		try {
			stmt = conn.prepareStatement("delete from especializacao where id = ?");
			
			stmt.setInt(1, esp.getId());
				
			int flag = stmt.executeUpdate();
			
			if (flag == 0) {
				System.out.println("Erro ao excluir especialização do banco");
			}
		} finally {
			if (stmt != null) 
				stmt.close();
			if (conn != null) 
				conn.close();
		}
				
	}
	
	// Metodo de atualizar a especializacao
	public void atualizarEspecializacao(Especializacao espe) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("update especializacao set titulo = ? where id = ?");
			
			stmt.setString(1, espe.getTitulo());
			stmt.setInt(2, espe.getId());
			
			int flag = stmt.executeUpdate();
			
			if (flag == 0) {
				System.out.println("Erro ao atualizar banco");
			}
			
		} finally {
			if (stmt != null) 
				stmt.close();
			if (conn != null) 
				conn.close();
		}
	}
	
	// Método responsavel por criar o obj especialização
	private Especializacao criaObjEspecializacao(ResultSet rs) throws SQLException {
		Especializacao especializacao = new Especializacao();
		//Professor professor = new Professor();
		
		especializacao.setId(rs.getInt(1));
		especializacao.setTitulo(rs.getString(2));
		//professor.setId(rs.getInt(3));
		//especializacao.setProfessor(professor);
		
		// Duas maneiras de fazer - uma declarando o prof separadamente e outra ja quando estiver pegando os campos
		especializacao.setProfessor(new Professor());
		especializacao.getProfessor().setId(rs.getInt(3));
		
		return especializacao;
	}
	
	
	
}
