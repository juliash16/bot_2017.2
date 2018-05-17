package entidade;

public enum Situacao {

	APROVADO("O aluno est� de f�rias"), REPROVADO("Nos vemos na proxima turma"), RECUPERACAO("Nos vemos na ter�a!");

	private String msg;
	
	private Situacao(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
