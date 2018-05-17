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
		// metodo dao.listar() - retorna a lista de endereços
		
		//foreach usando o expressão lambda  // ambos iguais(endereco e endereco) imprime tudo que tem la 
		dao.listar().forEach(cliente->System.out.println(cliente));
		
		//foreach usando o expressão lambda  (imprimir somente o endereco de id 2)
		dao.listar().forEach(cliente-> { 
			if (new Integer(5).equals(cliente.getId())) {
				System.out.println(cliente);
			}
		});
		
		//foreach usando o expressão lambda  (imprimir somente o endereco com bairro Centro)
		dao.listar().forEach(cliente-> { 
		if (new String("Julia").equals(cliente.getNome())) {
				System.out.println(cliente);
			}
		});
		
		//foreach usando o método por referência -- dois pontos passa a referência do metodo
		dao.listar().forEach(System.out::println);
		
	}
}