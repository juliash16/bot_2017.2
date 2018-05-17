package app;

import entidade.Aritmetica;

public class TestAritmetica {

	public static void main(String[] args) {
		Aritmetica a = new Aritmetica();
		
		System.out.println("A soma dos valores é "+a.soma(1, 2));
		
		System.out.println("A soma dos valores é "+a.soma(1, 13, 12, 6, 4, 10, 9, 11, 8));
		
		System.out.println("A subtração é "+a.subtracao(10, 5));
		
		System.out.println("A multiplicação é "+a.multiplicacao(3, 4, 2));
		
		System.out.println("A dividão é "+a.divisao(10, 2));
	}
}

