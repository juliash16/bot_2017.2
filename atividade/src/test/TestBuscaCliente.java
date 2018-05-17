package test;

import implement.DAOClienteImp;

public class TestBuscaCliente {

	public static void main (String[] args) {
		DAOClienteImp cliImp = new DAOClienteImp(); 
		
		System.out.println(cliImp.buscar(4));
	}
}
