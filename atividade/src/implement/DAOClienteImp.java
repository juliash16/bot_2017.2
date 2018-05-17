package implement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Cliente;
import persist.DAOCliente;

public class DAOClienteImp {

	private DAOCliente dao;
	
	public DAOClienteImp() {
		dao = new DAOCliente();
	}
	
	public boolean gravar (Cliente c) {
		try {
			dao.salvarCliente(c);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			ex.getMessage();
		}
		return false;
	}
	
	public boolean excluir (int id) {
		try {
			dao.excluirCliente(id);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		return false;
	}
	
	public boolean atualizar (Cliente cli) {
		try {
			dao.atualizarCliente(cli);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		return false;
	}
	
	public boolean buscar (int id) {
		try {
			dao.buscaCliente(id);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}
		return false;
	}
	
	public List<Cliente> listar() {
		try {
			return dao.listarCliente(); // lista
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new ArrayList<Cliente>(); // lista vazia
		}
	}
}
