package exercicios.aplicativo;

import exercicios.entidade.Produto;

public class Main {
	public static void main(String[] args) {
		
		Produto cola;
		
		cola = new Produto();
		
		cola.setNomeProduto("Cola liquida");
		cola.setPreco(5);
		cola.setQuantidade(2);
		cola.setDescricao("Cola para isopor");
		
		System.out.println(cola.getNomeProduto());
		System.out.println(cola.getPreco());
		System.out.println(cola.getQuantidade());
		System.out.println(cola.getDescricao());
		
		System.out.println("-----------------");
		
		Produto lapis = new Produto("Lapis n²", 2, 7, "Lapis n² preto com barracha");
		System.out.println(lapis);
	
		Produto brinquedo = new Produto("Bola", 5, 2, "Bola azul");
		System.out.println(brinquedo);
		
		
	}
}
