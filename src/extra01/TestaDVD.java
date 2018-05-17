package extra01;

//Atividade 10

public class TestaDVD {
	public static void main(String[] args) {
		DVD dvd1 = new DVD();
		DVD dvd2 = new DVD();
		DVD dvd3 = new DVD();
		
		dvd1.setNome("Um lugar Silencioso");
		dvd1.setPreco(59.99);
		dvd1.setDuracao("103 min");
		
		dvd2.setNome("Logan");
		dvd2.setPreco(49.99);
		dvd2.setDuracao("142 min");
		
		dvd3.setNome("Jogador nº 1");
		dvd3.setPreco(54.99);
		dvd3.setDuracao("140 min");
		
		System.out.println(dvd1+"\n\n"+dvd2+"\n\n"+dvd3);
	}
}
