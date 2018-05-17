package exemplos.aplicativo;

import exemplos.entidades.Aluno;

public class Principal {
	public static void main (String[] args) {
		
		// Cria��o da referencia do obj
		Aluno joao;
		
		// Cria��o da instancia do obj
		joao = new Aluno(); // utilizando o construtor sem argumentos(vazio)
		
		/* A forma simplificada de criar a referencia e instancia �:
		 * Aluno joao = new Aluno();
		 * */
		
		joao.setMatricula(12345);
		joao.setNome("Jo�o da Silva");
		joao.setEmail("joao@senac.com");
		
		System.out.println(joao.getMatricula());
		System.out.println(joao.getNome());
		System.out.println(joao.getEmail());
		System.out.println(joao);
		
		// Cria��o da referencia e instancia utilizando o construtor com argumentos (cheio)
		Aluno maria = new Aluno(1234, "Maria da Silva", "maria@gmail.com");
		// Imprimindo os dados usando o toString
		System.out.println(maria);
	}
}
