package extra01;

//Atividade 10

public class CD extends Loja{
	private int numeroDeFaixas;
	
	public CD() {
		
	}

	public CD(int numeroDeFaixas) {
		super();
		this.numeroDeFaixas = numeroDeFaixas;
	}

	public int getNumeroDeFaixas() {
		return numeroDeFaixas;
	}

	public void setNumeroDeFaixas(int numeroDeFaixas) {
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	@Override
	protected String loja() {
		return super.loja() +
				"\nNúmero de faixas: "+numeroDeFaixas;
	}
}
