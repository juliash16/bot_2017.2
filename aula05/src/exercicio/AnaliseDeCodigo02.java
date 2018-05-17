package exercicio;

/*
1. José desenvolvedor Sênior, com mais de 20 anos de atuação, foi designado para criar uma funcionalidade para 
o Sistema do Senac Rio, porém, ele está enfrentando um problema e não consegue localiza. Ele solicitou sua ajuda 
para que juntos encontrem o problema. O programa deve limitar a inscrição de alunos caso a quantidade seja 
atingida ou o período de inscrição já esteja encerrado. 

Informações:

•	Limite de alunos por turma é: 10
•	Data limite de inscrição é ao meio dia do dia 28/11/2017 

Analise o código abaixo e sugira ao José a solução do problema. 
*
*/
/*
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AnaliseDeCodigo02 {
		public static void main(String[] args) {
			
			// Array começa com 0 entao mês 10 é 11
			Calendar date_encerramento = new GregorianCalendar(2017, 10, 28, 12, 00, 00);
			Calendar date_atual = new GregorianCalendar(2017, 10, 30, 13, 20, 56);
			
			// Definir o tamanho do array antes -> String[] = new String [10];
			// Esse array é estatico
			String[] inscritos = { "Gabriela", "Thais", "Karla", "Gabriel", "Joaquim", "Anisio", "Roberto", "Maxwell" };

			int i = 0;

			while ((date_encerramento.compareTo(date_atual) > 0) && (inscritos.length <= 10)) {
				matricula_aluno(inscritos[i]);
				i++;
			}
		}
}
*/

