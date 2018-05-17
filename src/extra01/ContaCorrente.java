package extra01;

/* Desenvolva um projeto representar uma conta corrente de um banco. 
 * A classe conta corrente deverá ter métodos para depositar, sacar e obter
 * o saldo. Para cada saque será debitada também uma taxa de operação 
 * equivalente à 0,5% do valor sacado. Crie, em seguida, uma subclasse desta
 * classe anterior para representar uma conta corrente de um cliente especial.
 * Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado.
 * Faça testes com as duas classes e verifique seus resultados. */

// Atividade09

public class ContaCorrente {
	protected String nome;
	protected String cpf;
	protected double saldo;
	protected int numeroConta;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String nome, String cpf, double saldo, int numeroConta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + numeroConta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (numeroConta != other.numeroConta)
			return false;
		return true;
	}

	/*	@Override
	public String toString() {
		return metodoDepositar();
	}
	
	protected String metodoDepositar() {
		
	}
	*/
}
