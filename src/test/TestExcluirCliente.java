package test;

import implement.DAOClienteImp;

public class TestExcluirCliente {

	public static void main(String[] args) {
		DAOClienteImp cliImp = new DAOClienteImp();
		
		if (cliImp.excluir(5)) {
			System.out.println("Cliente excluido com sucesso");
		}
	}
		
}
