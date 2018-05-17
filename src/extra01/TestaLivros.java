package extra01;

//Atividade 10

public class TestaLivros {
	public static void main (String[] args) {
		Livros livro1 = new Livros();
		Livros livro2 = new Livros();
		Livros livro3 = new Livros();
		
		livro1.setNome("Uma breve história do tempo");
		livro1.setPreco(23.90);
		livro1.setAutor("Stephen Hawking");
		
		livro2.setNome("A sutil arte de ligar o Foda-se");
		livro2.setPreco(20.99);
		livro2.setAutor("Mark Manson");
		
		livro3.setNome("Inferno");
		livro3.setPreco(22.90);
		livro3.setAutor("Dan Brown");
		
		System.out.println(livro1+"\n\n"+livro2+"\n\n"+livro3);
	}
}
