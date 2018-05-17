package test;

import entity.Cliente;
import implement.DAOClienteImp;

public class TestAtualizarCliente {
	public static void main(String[] args) {
		DAOClienteImp cliImp = new DAOClienteImp();
		
		Cliente cliente = new Cliente();
		
		cliente.setId(1);
		cliente.setNome("João");
		cliente.setCpf("32145698755");
		cliente.setTelefone("21548756933");
		
		if (cliImp.atualizar(cliente)) {
			System.out.println("Cliente atualizado com sucesso");
		}
	}
}