package extra01;

/* Desenvolva um projeto representar uma conta corrente de um banco. 
 * A classe conta corrente deverá ter métodos para depositar, sacar e obter
 * o saldo. Para cada saque será debitada também uma taxa de operação 
 * equivalente à 0,5% do valor sacado. Crie, em seguida, uma subclasse desta
 * classe anterior para representar uma conta corrente de um cliente especial.
 * Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado.
 * Faça testes com as duas classes e verifique seus resultados. 
 * Parte 1 de 3
 * 
 */

// Atividade09

public class ContaCorrente {
	protected double saldo;
	protected int numeroConta;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(double saldo, int numeroConta) {
		super();
		this.saldo = saldo;
		this.numeroConta = numeroConta;
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
	
	private void sacar(int numeroConta,double valor){
		double conta = this.saldo.get(numeroConta);
		double saque = conta-(valor*1.05);
		this.saldo.add(id, saque);
	}
	
	private void depositar(int numeroConta,double valor){
		double conta = this.saldo.get(numeroConta);
		double deposito = saldo + valor;
	}
	
	private double saldo(int numeroConta){
		double saldo = this.saldo.get(numeroConta);
		return saldo;
	}
	
}
