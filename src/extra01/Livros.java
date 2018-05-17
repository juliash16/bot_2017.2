package extra01;

//Atividade 10

public class Livros extends Loja{
	private String autor;
	
	public Livros (){
		
	}

	public Livros(String autor) {
		super();
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	protected String loja() {
		return super.loja() +
				"\nAutor: "+autor;
	}
}
