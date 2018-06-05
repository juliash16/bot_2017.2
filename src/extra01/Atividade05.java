package extra01;

import java.util.Scanner;

/* Atividade05
 * Criei um projeto para calcular dos valores digitados pelo usuário. 
 * Deverá ser apresentado um menu para o usuário para que ele possa escolher
 *  um dos cálculos abaixo: 

•	Soma
•	Subtração
•	Multiplicação
•	Divisão
•	Resto da Divisão
•	Média dos valores
 Utilize o conceito de orientação a objetos para implementar.
* Parte 1 de 2.
 * Parte 2 é : TestCalculo.
 */

public class Calculo {

	public double soma(double ...valores) {
		double resultado = 0;
		
		for (double v : valores) {
			resultado += v;
		}
		return resultado;
	}
	
	public double subtracao(double ...valores) {
		double resultado = valores[0];
		
		for (int i = 1; i < valores.length; i++) {
			resultado -= valores[i];
		}
		return resultado;	
	}
	
	public double multiplicacao(double ...valores) {
		double resultado = 1;
		
		for (double v : valores) {
			resultado *= v;
		}
		return resultado;
	}
	
	public double divisao(double ...valores) {
		double resultado = valores[0];
		
		for (int i = 1; i < valores.length; i++) {
			resultado /= valores[i];
		}
		return resultado;
	}
	
	public double restodivisao(double ...valores) {
		double resultado = valores[0];
		
		for (int i = 1; i < valores.length; i++) {
			resultado %= valores[i];
		}
		return resultado;
	}
	
	public double mediavalores(double ...valores) {
		double resultado = 0;
		int contador = 0;
		
		for (double v : valores) {
			resultado += v;
			contador++;
		}
		return resultado / contador;
	}
	
}
