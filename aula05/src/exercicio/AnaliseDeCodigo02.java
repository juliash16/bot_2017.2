package exercicio;

/*
1. Jos� desenvolvedor S�nior, com mais de 20 anos de atua��o, foi designado para criar uma funcionalidade para 
o Sistema do Senac Rio, por�m, ele est� enfrentando um problema e n�o consegue localiza. Ele solicitou sua ajuda 
para que juntos encontrem o problema. O programa deve limitar a inscri��o de alunos caso a quantidade seja 
atingida ou o per�odo de inscri��o j� esteja encerrado. 

Informa��es:

�	Limite de alunos por turma �: 10
�	Data limite de inscri��o � ao meio dia do dia 28/11/2017 

Analise o c�digo abaixo e sugira ao Jos� a solu��o do problema. 
*
*/
/*
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AnaliseDeCodigo02 {
		public static void main(String[] args) {
			
			// Array come�a com 0 entao m�s 10 � 11
			Calendar date_encerramento = new GregorianCalendar(2017, 10, 28, 12, 00, 00);
			Calendar date_atual = new GregorianCalendar(2017, 10, 30, 13, 20, 56);
			
			// Definir o tamanho do array antes -> String[] = new String [10];
			// Esse array � estatico
			String[] inscritos = { "Gabriela", "Thais", "Karla", "Gabriel", "Joaquim", "Anisio", "Roberto", "Maxwell" };

			int i = 0;

			while ((date_encerramento.compareTo(date_atual) > 0) && (inscritos.length <= 10)) {
				matricula_aluno(inscritos[i]);
				i++;
			}
		}
}
*/

