package extra01;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


/* Atividade04
 * Escreva um programa para mostra a hora atual, colete o nome do 
 * usuário logado no pc e uma saudação (bom dia, boa tarde ou boa noite)
 *  de acordo com a hora do dia. */

public class Atividade04 {
	public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = s.next();
        
        Date hj = new Date();
        DateFormat df1;
        
        String f1 = "hh:mm:ss";
        df1 = new SimpleDateFormat(f1);
        
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        
        if(hora >= 0 && hora < 12) {
     	   System.out.println(df1.format(hj)+ " - Bom dia "+nome);
        }else if(hora >= 12 && hora < 18) {
     	   System.out.println(df1.format(hj)+ " - Boa tarde "+nome);
        }else if(hora >= 18 && hora < 0){
     	   System.out.println(df1.format(hj)+ " - Boa noite "+ nome);
        }
        s.close();
	}
}
