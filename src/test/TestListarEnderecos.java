package test;

import entity.Endereco;
import implement.EnderecoDAOImp;

public class TestListarEnderecos {
	
	public static void main(String[] args) {
		EnderecoDAOImp dao = new EnderecoDAOImp();
		
		for (Endereco end : dao.listar()) {
			System.out.println(end);
		}
		
		// nos dois exemplos abaixo ele mesmo cria o objeto ("Endereco end")
		// metodo dao.listar() - retorna a lista de endere�os
		
		//foreach usando o express�o lambda  // ambos iguais(endereco e endereco) imprime tudo que tem la 
		dao.listar().forEach(endereco->System.out.println(endereco));
		
		//foreach usando o express�o lambda  (imprimir somente o endereco de id 2)
		dao.listar().forEach(endereco-> { 
			if (new Integer(5).equals(endereco.getId())) {
				System.out.println(endereco);
			}
		});
		
		//foreach usando o express�o lambda  (imprimir somente o endereco com bairro Centro)
		dao.listar().forEach(endereco-> { 
		if (new String("Centro").equals(endereco.getBairro())) {
				System.out.println(endereco);
			}
		});
		
		//foreach usando o m�todo por refer�ncia -- dois pontos passa a refer�ncia do metodo
		dao.listar().forEach(System.out::println);
		
	}
}

/**/
