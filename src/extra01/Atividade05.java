package extra01;

import java.util.Scanner;

/* Atividade05
 * Criei um projeto para calcular dos valores digitados pelo usu�rio. 
 * Dever� ser apresentado um menu para o usu�rio para que ele possa escolher
 *  um dos c�lculos abaixo: 

�	Soma
�	Subtra��o
�	Multiplica��o
�	Divis�o
�	Resto da Divis�o
�	M�dia dos valores
 Utilize o conceito de orienta��o a objetos para implementar.
 */

public class Atividade05 {
	 public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      System.out.print("Digite o primeiro n�mero: ");
	      double priNumero = s.nextInt();
	      System.out.print("Digite o segundo n�mero: ");
	      double segunNumero = s.nextInt();
	      
	      System.out.println("Escolha a op��o desejada: \n a) soma:\n b) subtra��o:\n c) multiplica��o:\n d) divis�o:\n e) resto da divis�o:\n f) m�dia dos valores: ");
	      String opcao = s.next();
	      
	      if(opcao.equals("a")) {
	    	  double soma = priNumero + segunNumero;
		      System.out.println("A soma dos n�meros � " + soma);
	      }else if(opcao.equals("b")) {
	    	  double sub = priNumero - segunNumero;
		      System.out.println("A subtra��o dos n�meros � " + sub);
	      }else if(opcao.equals("c")) {
	    	  double multi = priNumero * segunNumero;
		      System.out.println("A multiplica��o dos n�meros � " + multi);
	      }else if(opcao.equals("d")) {
	    	  double divi = priNumero / segunNumero;
		      System.out.println("A divis�o dos n�meros � " + divi);
	      }else if(opcao.equals("e")){
	      	  double resto = priNumero % segunNumero;
	      	  System.out.println("O resto da divis�o dos n�meros � " + resto);
	      }else if(opcao.equals("f")){
	      	  double media = (priNumero + segunNumero) / 2;
	      	  System.out.println("A m�dia dos n�meros � " + media);	  
	      }else {
	    	  System.out.println("Op��o inv�lida");
	      }
	      
	      s.close();
	      
	     
	 }
}
