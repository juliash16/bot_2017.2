package extra01;

import java.util.Scanner;

/* Atividade01
 * Faça um programa para ler vários números e informar quantos números entre 100 e 
 * 200 foram digitados. Se o valor digitado for 0 o programa deve ser encerrado. */

public class Atividade01 {
	public static void main(String[] args ) {
		Scanner dados = new Scanner(System.in);
		int x = 1;
		int contador = 0;
		String lista = "Números digitados: ";
		
		while (x != 0) { 
			System.out.print("Digite um número:"); 
			x = dados.nextInt(); 
			if (x >= 100 && x <= 200) {
				lista = lista + x + " | ";
				contador++;
			}
		if(x == 0) {
			System.out.println("------------------------");
			System.out.println("Você digitou: "+contador+" números entre 100 e 200");
			System.out.println(lista);
			dados.close();
		}
		} 
	}
}

