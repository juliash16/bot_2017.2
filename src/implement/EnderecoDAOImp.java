package implement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Endereco;
import persist.EnderecoDAO;

public class EnderecoDAOImp {

	private EnderecoDAO dao;

	public EnderecoDAOImp() {
		dao = new EnderecoDAO();
	}
	
	/* Outro metodo é :
	 * 
	 * ---boolean com letra maiuscula pq é uma classe
	 * public Boolean gravar(Endereco e) {
		try {
			dao.save(e);
			return Boolean.TRUE; // tb retorna 0 e 1
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return Boolean.FALSE;
	}
	 */
	
	public boolean gravar(Endereco e) {
		try {
			dao.save(e);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return false; // caso ocorra erro no catch
	}
	
	public boolean excluir(int id) {
		try {
			dao.excluiEndereco(id);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean atualizar(Endereco e) {
		try {
			dao.atualizaEndereco(e);
			return true;
		} catch (SQLException e2) {
			e2.printStackTrace();
			System.out.println(e2.getMessage());
		}
		return false;
	}
	
	public Endereco buscarPorId(int id) {
		try {
			return dao.localizaEndereco(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new Endereco(); // Esta retornando um novo endereco vazio para nao dar erro
		}
	}
	
	public List<Endereco> listar() {
		try {
			return dao.buscarEnderecos(); // lista 
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new ArrayList<Endereco>(); // lista vazia
		}
	}
	
}
