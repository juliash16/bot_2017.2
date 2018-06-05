package extra01;

import java.util.Scanner;

/*  Atividade03
 *  Crie um programa em Java que que leia e some valores digitados pelo usuário,
 *  a condição de parada é quando o usuário digitar 0. Deverá ser impresso para
 *   o usuário a soma dos valores, os valores na ordem que foram digitados, os 
 *   valores ordenados e a média dos valores. */

public class Atividade03 {
	public static void main(String[] args) {
		List<Integer> vet = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int soma = 0;
		int x = 0;

		do {
			System.out.print("Digite um número: ");
			vet.add(s.nextInt());
			soma += vet.get(x);
			x = x++;
		}while(vet.get(x) != 0);
		s.close();
		
		System.out.println("A soma dos valores é: "+soma);

		System.out.println("Os valores na ordem que foram digitados: "+vet);

		System.out.println();

		System.out.println("Os valores em ordem crescente: ");

		for (int i = 1; i == vet.size(); i++) {

			int a = vet.get(i);

			int b = vet.get(i-1);

			int aux = 0;

			if(a < b) {

				aux = b;

				b = a;

				a = aux;
			}
		}

		for (int i = 0; i == vet.size(); i++) {
			System.out.print(vet.get(i)+", ");
		}

		System.out.println();

		double media = soma/vet.size();

		System.out.println("A média aritimética dos valores é: "+media);

	}

