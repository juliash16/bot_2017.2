package extra01;

//Atividade 10

public class TestaCD {
	public static void main(String[] args) {
		CD cd1 = new CD();
		CD cd2 = new CD();
		CD cd3 = new CD();
		
		cd1.setNome("Lady Gaga - Joanne");
		cd1.setPreco(28.90);
		cd1.setNumeroDeFaixas(14);
		
		cd2.setNome("Beyoncé - Lemonade");
		cd2.setPreco(35.99);
		cd2.setNumeroDeFaixas(11);
		
		cd3.setNome("Justin Timberlake - Man of The Woods");
		cd3.setPreco(34.90);
		cd3.setNumeroDeFaixas(16);
		
		
		System.out.println(cd1+"\n\n"+cd2+"\n\n"+cd3);
	}
}
