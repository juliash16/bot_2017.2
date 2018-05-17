package exemplo;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		
		int soma = 0;
		int numero = 0;

		do {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero = teclado.nextInt();
		teclado.close();		
		soma = soma + numero;

		} while (numero != 0);
		System.out.println("A soma foi de: "+soma);
		
	}
}
