package test;

import entity.Especializacao;
import implement.EspecializacaoDAOImp;

public class TestAtualizarEspecializacao {

	public static void main (String[] args) {
		 EspecializacaoDAOImp espeImp = new EspecializacaoDAOImp();
		 
		 Especializacao especializacao = new Especializacao();
		 
		 especializacao.setId(1);
		 especializacao.setTitulo("T�cnico em Inform�tica");
		 
		 if (espeImp.atualizar(especializacao)) {
			 System.out.println("Especializa��o atualizada com sucesso");
		 }
	}
}
