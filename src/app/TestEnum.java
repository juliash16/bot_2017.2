package app;

import entidade.Aluno;

public class TestEnum {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Julia");
		aluno.setNota01(9.0);
		aluno.setNota02(5.0);
		
		System.out.println("Informes do aluno:\n"
							+ "Nome: "+aluno.getNome()
							+ "\nPrimeira nota: "+aluno.getNota01()
							+ "\nSegunda nota: "+aluno.getNota02()
							+ "\nE sua situação é: "+aluno.situacao());
		
	}
}
