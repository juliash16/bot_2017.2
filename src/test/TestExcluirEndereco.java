package test;

import implement.EnderecoDAOImp;

public class TestExcluirEndereco {
	public static void main(String[] args) {
		EnderecoDAOImp endeImp = new EnderecoDAOImp();
		
		if (endeImp.excluir(8)) {
			System.out.println("Endereco excluido com sucesso");
		}
		
	}
}
