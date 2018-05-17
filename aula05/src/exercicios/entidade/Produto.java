package exercicios.entidade;

public class Produto {

	private String nomeProduto;
	private float preco;
	private int quantidade;
	private String descricao;

	public Produto() {

	}

	public Produto(String nomeProduto, float preco, int quantidade, String descricao) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// Definir os métodos sobreescritos
	
	@Override
	public String toString() {
		return "\nInformações do produto:\nNome: "+ nomeProduto + "\nPreço: " + preco + "\nQuantidade: " + quantidade + "\nDescrição: " + descricao;
	}
}
