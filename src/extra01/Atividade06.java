package extra01;

import java.util.Scanner;
import java.util.Collections;
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
		Scanner numero2 = new Scanner (System.in);
	        int vetor[] = new int[10];
	        int i;
	        int x = 1;
		int pesquisa;
		int n;
		int igual = 0;
		int menor = 0;
		int maior = 0;
	        
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
	        
		 System.out.println("Digite um número para a pesquisa:");
	         pesquisa = numero2.nextInt();
		 for (int y = 0; y < vetor.size(); y++) {
			if(vet.get(y) == pesquisa) {
				System.out.println("Valor: "+vet.get(y)+", posição: "+y);
			}
		}
		 
		 for (int i = 0; i < vetor.size(); i++) {
			n = vetor.get(i);
			if (n == pesquisa) {
				igual++;
				break;
			}else if (n < pesquisa) {
				menor++;
				break;
			}else 
				maior++;
			 	break;
		 }
		 
		System.out.println(igual+" Números são iguais a "+pesquisa);
		System.out.println(maior+" Números são maiores que a "+pesquisa);
		System.out.println(menor+" Números são menores que a "+pesquisa);
		Collections.sort(vetor);
		System.out.println("Ordem crescente "+vetor); 
		Collections.reverse(vetor);
		System.out.println("Ordem decrescente "+vetor); 
		 
}
