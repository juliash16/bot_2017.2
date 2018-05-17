package implement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Especializacao;
import persist.EspecializacaoDAO;

public class EspecializacaoDAOImp {

	private EspecializacaoDAO dao;

	public EspecializacaoDAOImp() {
		dao = new EspecializacaoDAO();
	}
	
	public boolean gravar(Especializacao e) {
		try {
			dao.save(e);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return false;
	}
	
	public boolean excluir(Especializacao espe) {
		try {
			dao.excluiEspecializacao(espe);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public Boolean atualizar(Especializacao es) {
		try {
			dao.atualizarEspecializacao(es);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return Boolean.FALSE;
		}
	}
	
	public Especializacao buscarPorId(int id) {
		try {
			return dao.buscaEspecializacao(id);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new Especializacao();
		}
	}
	
	public List<Especializacao> listar() {
		try {
			return dao.buscaEspecializacao();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new ArrayList<Especializacao>();
		}
	}
}
