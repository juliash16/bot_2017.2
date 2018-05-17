package test;

import entity.Especializacao;
import implement.EspecializacaoDAOImp;

public class TestAtualizarEspecializacao {

	public static void main (String[] args) {
		 EspecializacaoDAOImp espeImp = new EspecializacaoDAOImp();
		 
		 Especializacao especializacao = new Especializacao();
		 
		 especializacao.setId(1);
		 especializacao.setTitulo("Técnico em Informática");
		 
		 if (espeImp.atualizar(especializacao)) {
			 System.out.println("Especialização atualizada com sucesso");
		 }
	}
}
