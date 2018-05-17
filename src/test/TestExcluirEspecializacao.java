package test;

import entity.Especializacao;
import implement.EspecializacaoDAOImp;

public class TestExcluirEspecializacao {

	public static void main(String[] args) {
		EspecializacaoDAOImp espeImp = new EspecializacaoDAOImp();
		
		Especializacao especializacao = new Especializacao();
		
		especializacao.setId(6);
		
		if (espeImp.excluir(especializacao)) {
			System.out.println("Especialização excluida com sucesso");
		}
	}
}
