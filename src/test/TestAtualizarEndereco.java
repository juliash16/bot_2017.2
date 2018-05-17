package test;

import entity.Endereco;
import implement.EnderecoDAOImp;

public class TestAtualizarEndereco {
	public static void main(String[] args) {
		EnderecoDAOImp daoImp = new EnderecoDAOImp();
		
		Endereco endereco = new Endereco();
		
		endereco.setId(1);
		endereco.setLogradouro("Rua 1, nº 565");
		endereco.setBairro("Recreio");
		endereco.setCidade("Resende");
		endereco.setCep("22674-959");
		
		if (daoImp.atualizar(endereco)) {
			System.out.println("Endereço atualizado com sucesso");
		}
	}
}
