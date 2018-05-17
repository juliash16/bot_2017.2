package exemplo;

public class ExemploFibonacci {
	public static void main(String[] args) {
		
		int anterior1 = 1;
		int anterior2 = 1;
		int calculado = anterior1 + anterior2;
		
		System.out.print(anterior1 + ", " + anterior2 + ", " + calculado + ", ");
		
		for (int i = 4; i < 10; i++) {
			anterior1 = anterior2;
			anterior2 = calculado;
			calculado = anterior1 + anterior2;
			System.out.print(calculado + ", ");
		}
	}
}
