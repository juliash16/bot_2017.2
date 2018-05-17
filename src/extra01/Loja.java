package extra01;

// Atividade 10

public class Loja {
	protected String nome;
	protected double preco;
	
	public Loja() {
		
	}

	public Loja(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override 
	public String toString() {
		return loja();
	}
	
	protected String loja() {
		return "Nome: "+nome+" \nPreço: "+preco;
	}
}
