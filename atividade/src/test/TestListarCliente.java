package test;

import entity.Cliente;
import implement.DAOClienteImp;

public class TestListarCliente {
	
	public static void main(String[] args) {
		DAOClienteImp dao = new DAOClienteImp();
		
		for (Cliente cli : dao.listar()) {
			System.out.println(cli);
		}
		
		// nos dois exemplos abaixo ele mesmo cria o objeto ("Endereco end")
		// metodo dao.listar() - retorna a lista de endere�os
		
		//foreach usando o express�o lambda  // ambos iguais(endereco e endereco) imprime tudo que tem la 
		dao.listar().forEach(cliente->System.out.println(cliente));
		
		//foreach usando o express�o lambda  (imprimir somente o endereco de id 2)
		dao.listar().forEach(cliente-> { 
			if (new Integer(5).equals(cliente.getId())) {
				System.out.println(cliente);
			}
		});
		
		//foreach usando o express�o lambda  (imprimir somente o endereco com bairro Centro)
		dao.listar().forEach(cliente-> { 
		if (new String("Julia").equals(cliente.getNome())) {
				System.out.println(cliente);
			}
		});
		
		//foreach usando o m�todo por refer�ncia -- dois pontos passa a refer�ncia do metodo
		dao.listar().forEach(System.out::println);
		
	}
}