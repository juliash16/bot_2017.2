package exemplo;

public class ExemploVetor {
	public static void main(String[] args) {
		
		int[] numeros = new int[3];
		numeros[0] = 29;
		numeros[1] = 30;
		numeros[2] = 31;
		
		// for com tamanho fixo
		for (int i = 0; i < 3; i++) {
			System.out.println(numeros[i]);
		}
		
		// for com tamanho do vetor (ler o tamanho)
		for (int i = 0; i < numeros.length; i++) { // retorna o tamanho do array -> numeros.length;
			System.out.println(numeros[i]);
		}
		
		// foreach simplificado do for para "varrer" o array
		for (int i : numeros) {
			System.out.println(i);
		}
	}
	
}
