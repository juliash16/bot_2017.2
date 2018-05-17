package test;

import entity.Professor;
import entity.Especializacao;
import implement.EspecializacaoDAOImp;

public class TestGravaEspecializacao {
	public static void main(String[] args) {
		EspecializacaoDAOImp daoImp = new EspecializacaoDAOImp();
		
		Especializacao especializacao = new Especializacao();
		
		especializacao.setTitulo("Técnico em Meio Ambiente");
		
		especializacao.setProfessor(new Professor());
		especializacao.getProfessor().setId(1);
		
		if(daoImp.gravar(especializacao))
			System.out.println("Especializacao gravada");
		
	}
}
