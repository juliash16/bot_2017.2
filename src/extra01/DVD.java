package extra01;

//Atividade 10

public class DVD extends Loja{
	private String duracao;
	
	public DVD() {
		
	}

	public DVD(String duracao) {
		super();
		this.duracao = duracao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	@Override
	protected String loja() {
		return super.loja() +
				"\nDuração: "+duracao;
	}
}
