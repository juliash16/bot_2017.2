package extra01;

import java.util.Calendar;

/* Atividade02
 * Pedro tem 1,50m e cresce 2 centímetros por ano, enquanto Mauro tem 1,10m 
 * e cresce 3 centímetros por ano. Construir um algoritmo que calcule e imprima 
 * quantos anos serão necessários para que Mauro seja maior que Pedro. */

public class Atividade02 {
	public static void main(String[] args) {
		double pedro = 1.50;
		double mauro = 1.10;
		
		Calendar c = Calendar.getInstance();
        int ano = c.get(Calendar.YEAR);
        
		do {
			pedro = pedro + 0.02;
			mauro = mauro + 0.03;
			ano = ano + 1;
		}while(mauro < pedro);
			ano = ano - 2018;
			System.out.println("Serão necessarios "+ano+" anos para que Mauro seja maior que Pedro");
	}
	
}
