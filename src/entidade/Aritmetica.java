package entidade;

public class Aritmetica {
	
	/**
	 * 
	 * @param ...valores (varatgs) - é como fosse
	 * definido um vetor com parametro
	 * */
	
	public double soma(double ...valores) {
		double resultado = 0;
		
		for (double v : valores) {
			resultado += v;
		}
		
		return resultado;
	}
	
	public double subtracao(double ...valores) {
		double resultado = valores[0]; // a variavel resultado sera iniciada com a primeria posição do array
		
		for (int i = 1; i < valores.length; i++) {
			resultado -= valores[i];
		}
		
		return resultado;
	}
	
	public double multiplicacao(double ...valores) {
		double resultado = 1;
		
		for (double v : valores) {
			resultado *= v;
		}
		
		return resultado;
	}
	
	public double divisao(double ...valores) {
		double resultado = valores[0];
		
		for (int i =1; i < valores.length; i++) {
			resultado /= valores[i];
		}
		return resultado;
	}
}
