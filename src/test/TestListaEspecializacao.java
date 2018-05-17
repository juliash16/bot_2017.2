package test;

import entity.Especializacao;
import implement.EspecializacaoDAOImp;

public class TestListaEspecializacao {
	public static void main(String[] args) {
		EspecializacaoDAOImp dao = new EspecializacaoDAOImp();
		
		for (Especializacao espe : dao.listar()) {
			System.out.println(espe);
		}
		
		//foreach usando o expressão lambda  
/*		dao.listar().forEach(especializacao->System.out.println(especializacao));
		
		dao.listar().forEach(especializacao-> { 
			if (new String("Tecnico").equals(especializacao.getTitulo())) {
					System.out.println(especializacao);
				}
		});
		*/
	
	}
}
