package app;

import entidade.Aritmetica;

public class TestAritmetica {

	public static void main(String[] args) {
		Aritmetica a = new Aritmetica();
		
		System.out.println("A soma dos valores � "+a.soma(1, 2));
		
		System.out.println("A soma dos valores � "+a.soma(1, 13, 12, 6, 4, 10, 9, 11, 8));
		
		System.out.println("A subtra��o � "+a.subtracao(10, 5));
		
		System.out.println("A multiplica��o � "+a.multiplicacao(3, 4, 2));
		
		System.out.println("A divid�o � "+a.divisao(10, 2));
	}
}

