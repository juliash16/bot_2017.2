package extra01;

import java.util.Scanner;

/* Atividade01
 * Fa�a um programa para ler v�rios n�meros e informar quantos n�meros entre 100 e 
 * 200 foram digitados. Se o valor digitado for 0 o programa deve ser encerrado. */

public class Atividade01 {
	public static void main(String[] args ) {
		Scanner dados = new Scanner(System.in);
		int x = 1;
		int contador = 0;
		String lista = "N�meros digitados: ";
		
		while (x != 0) { 
			System.out.print("Digite um n�mero:"); 
			x = dados.nextInt(); 
			if (x >= 100 && x <= 200) {
				lista = lista + x + " | ";
				contador++;
			}
		if(x == 0) {
			System.out.println("------------------------");
			System.out.println("Voc� digitou: "+contador+" n�meros entre 100 e 200");
			System.out.println(lista);
			dados.close();
		}
		} 
	}
}

