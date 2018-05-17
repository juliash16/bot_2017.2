package test;

import entity.Cliente;
import implement.DAOClienteImp;

public class TestGravarCliente {

	public static void main(String[] args) {
		DAOClienteImp cliImp = new DAOClienteImp();
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Katarina");
		cliente.setCpf("32145698744");
		cliente.setTelefone("21547897566");
		
		cliente.setId(1);
		
		if (cliImp.gravar(cliente)) {
			System.out.println("Cliente gravado com sucesso");
		}
	}
}
