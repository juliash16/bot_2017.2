package extra01;

import java.util.Scanner;

/*
 * Considere um vetor din�mico de valores inteiros positivos maiores que zero e um �nico valor X inteiro
positivo maior que zero, construa o seguinte programa:
Carregue um vetor lendo valores do teclado, impossibilitando de o usu�rio digitar valores negativos
a condi��o de parada � quando o usu�rio digitar 0.
Leia um valor X digitado pelo usu�rio e busque no vetor o valor, caso exista o valor no vetor,
imprimir o valor e sua posi��o no vetor. Caso o valor esteja repetido no vetor imprima todas as
posi��es aonde se encontra o valor e informe tamb�m a dist�ncia entre eles.
Ordenar o vetor, e imprimi-lo em ordem crescente e decrescente.
Informar quantos valores s�o menores que X, quantos s�o maiores e quais s�o iguais.
 *
 */

public class Atividade06 {
	
	 public static void main(String[] args) {
	        Scanner numero = new Scanner (System.in);
	        int vetor[] = new int[10];
	        int i;
	        int x;
	        
	        for (i = 0; i < vetor.length; i++) {	        	
	            System.out.println("Digite um n�mero:");
	            x = numero.nextInt();
	            if (x < 0) {
	            	System.out.println("N�meros negativos n�o s�o aceitaveis"); 
	            	System.out.println("Digite outro n�mero:");
		            x = numero.nextInt();
		            vetor[i] = x;
	            }else if (x == 0) {
	            	break;
	            }else {
	            	vetor[i] = x;
	            }
	        }
	        
	    	for (int y = 0; y < vetor.length; y++) {
	    		System.out.println("Posi��o : "+y+" - Valor : "+vetor[y]);
	    	}
	    	
	  }
	  
}








