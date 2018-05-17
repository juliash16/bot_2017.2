package entidade;

public enum Situacao {

	APROVADO("O aluno está de férias"), REPROVADO("Nos vemos na proxima turma"), RECUPERACAO("Nos vemos na terça!");

	private String msg;
	
	private Situacao(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
