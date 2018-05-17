package extra01;

import java.util.Scanner;

/*
 * Considere um vetor dinâmico de valores inteiros positivos maiores que zero e um único valor X inteiro
positivo maior que zero, construa o seguinte programa:
Carregue um vetor lendo valores do teclado, impossibilitando de o usuário digitar valores negativos
a condição de parada é quando o usuário digitar 0.
Leia um valor X digitado pelo usuário e busque no vetor o valor, caso exista o valor no vetor,
imprimir o valor e sua posição no vetor. Caso o valor esteja repetido no vetor imprima todas as
posições aonde se encontra o valor e informe também a distância entre eles.
Ordenar o vetor, e imprimi-lo em ordem crescente e decrescente.
Informar quantos valores são menores que X, quantos são maiores e quais são iguais.
 *
 */

public class Atividade06 {
	
	 public static void main(String[] args) {
	        Scanner numero = new Scanner (System.in);
	        int vetor[] = new int[10];
	        int i;
	        int x;
	        
	        for (i = 0; i < vetor.length; i++) {	        	
	            System.out.println("Digite um número:");
	            x = numero.nextInt();
	            if (x < 0) {
	            	System.out.println("Números negativos não são aceitaveis"); 
	            	System.out.println("Digite outro número:");
		            x = numero.nextInt();
		            vetor[i] = x;
	            }else if (x == 0) {
	            	break;
	            }else {
	            	vetor[i] = x;
	            }
	        }
	        
	    	for (int y = 0; y < vetor.length; y++) {
	    		System.out.println("Posição : "+y+" - Valor : "+vetor[y]);
	    	}
	    	
	  }
	  
}








