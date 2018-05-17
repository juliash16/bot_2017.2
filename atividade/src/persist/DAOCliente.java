package persist;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Cliente;

public class DAOCliente extends DAO{

	private Connection conn;
	
	public DAOCliente () {
		try {
			conn = abrirConexao();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir o banco"+e.getMessage());
		}
	}
	
	// Metodo salvar cliente
	public void salvarCliente (Cliente c) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into cliente values(null, ?, ?, ?)");
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCpf());
			stmt.setString(3, c.getTelefone());
			
			int flag = stmt.executeUpdate();
			
			if (flag == 0) {
				throw new SQLException("Erro ao gravar no banco");
			}
		} finally {
			if (stmt != null) 
				stmt.close();
			if (conn != null) 
				conn.close();
		}
	}
	
	// Metodo excluir cliente
	public void excluirCliente (int id) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("delete * from cliente where id = ?");
			stmt.setInt(1, id);
			
			int flag = stmt.executeUpdate();
			
			if (flag == 0) {
				throw new SQLException("Erro ao excluir do banco");
			}
		}finally {
			if (stmt != null) 
				stmt.close();
			if (conn != null)
				conn.close();	
		}
	}
	
	// Metodo atualizar
	public void atualizarCliente (Cliente cli) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("update * from cliente nome = ?, cpf = ?, telefone = ? where id = ?");
			stmt.setString(1, cli.getNome());
			stmt.setString(2, cli.getCpf());
			stmt.setString(3, cli.getTelefone());
			stmt.setInt(4, cli.getId());
			
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
	
	// Metodo de buscar Cliente
	public Cliente buscaCliente (int id) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement("select * from cliente where id = ?");
			stmt.setInt(1, id);
			
			rs = stmt.executeQuery();
			Cliente cli = null;
			
			if (rs.next()) {
				cli = criaObjCliente(rs);
			}
			
			return cli;
			
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null) 
				conn.close();
			if (rs != null) 
				rs.close();
		}
	}
	
	// Metodo de listar Cliente 
	public List<Cliente> listarCliente() throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
			
		try {
			stmt = conn.prepareStatement("select * from cliente");
			
			rs = stmt.executeQuery();
			List<Cliente> listaCliente = new ArrayList<Cliente>();
				
			while(rs.next()) {
				listaCliente.add(criaObjCliente(rs));
			}
			
			return listaCliente;
				
		} finally {
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
		}
	}
	
	
	
	
	private Cliente criaObjCliente(ResultSet rs) throws SQLException {
		Cliente cliente = new Cliente();
		
		cliente.setId(rs.getInt(1));
		cliente.setNome(rs.getString(2));
		cliente.setCpf(rs.getString(3));
		cliente.setTelefone(rs.getString(4));
		
		return cliente;
	}
	
}
