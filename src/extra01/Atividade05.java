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
 */

public class Atividade05 {
	 public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      System.out.print("Digite o primeiro número: ");
	      double priNumero = s.nextInt();
	      System.out.print("Digite o segundo número: ");
	      double segunNumero = s.nextInt();
	      
	      System.out.println("Escolha a opção desejada: \n a) soma:\n b) subtração:\n c) multiplicação:\n d) divisão:\n e) resto da divisão:\n f) média dos valores: ");
	      String opcao = s.next();
	      
	      if(opcao.equals("a")) {
	    	  double soma = priNumero + segunNumero;
		      System.out.println("A soma dos números é " + soma);
	      }else if(opcao.equals("b")) {
	    	  double sub = priNumero - segunNumero;
		      System.out.println("A subtração dos números é " + sub);
	      }else if(opcao.equals("c")) {
	    	  double multi = priNumero * segunNumero;
		      System.out.println("A multiplicação dos números é " + multi);
	      }else if(opcao.equals("d")) {
	    	  double divi = priNumero / segunNumero;
		      System.out.println("A divisão dos números é " + divi);
	      }else if(opcao.equals("e")){
	      	  double resto = priNumero % segunNumero;
	      	  System.out.println("O resto da divisão dos números é " + resto);
	      }else if(opcao.equals("f")){
	      	  double media = (priNumero + segunNumero) / 2;
	      	  System.out.println("A média dos números é " + media);	  
	      }else {
	    	  System.out.println("Opção inválida");
	      }
	      
	      s.close();
	      
	     
	 }
}
