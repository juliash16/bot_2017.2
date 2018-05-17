package exemplos.entidades;

public class Aluno {

	// Definir os atributos da classe entidade
	private Integer matricula;
	private String nome;
	private String email;
	
	// Definir o(s) contrutor(es) de classe e sobrecarga de construtores
	public Aluno() {
		// Sem argumentos e corpo (construtor padrão)
		/* carga 0
		 * Esse construtor é implementado automaticamente
		 * quando não for definido nenhum contrutor 
		 * Sem ele não se cria objeto da classe
		 *  */
	}
	
	public Aluno(Integer matricula, String nome, String email) { // Essas são as cargas
		// Com argumentos, os argumentos são definidos pelo programador
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}
	
	// Definir o encapsulamento (Gets e Sets)
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	// Definir os métodos sobreescritos
	
	@Override
	public String toString() {
		return "Dados do aluno:\nMatricula: "+ matricula + "\nNome: " + nome + "\nEmail: " + email;
	}
}
