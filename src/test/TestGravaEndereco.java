package test;

import entity.AlunoGra;
import entity.Endereco;
import implement.EnderecoDAOImp;

public class TestGravaEndereco {
	public static void main(String[] args) {
		EnderecoDAOImp daoImp = new EnderecoDAOImp();
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro("Rua 11, nº 980");
		endereco.setBairro("Paciência");
		endereco.setCidade("Rio de Janeiro");
		endereco.setCep("22874-035");
		
		endereco.setPessoa(new AlunoGra());
		endereco.getPessoa().setId(1);
		
		if(daoImp.gravar(endereco))
			System.out.println("Endereco gravado");
		
	}
}
