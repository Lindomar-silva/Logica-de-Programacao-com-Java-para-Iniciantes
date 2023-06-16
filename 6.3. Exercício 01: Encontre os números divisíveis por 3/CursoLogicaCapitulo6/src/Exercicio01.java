
public class Exercicio01 {

	// Encontre os números divisíveis por 3
	private static final Integer DIVISOR = 3;

	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (Integer numero : numeros) {
			Boolean isDivisivel = numero % DIVISOR == 0;

			if (isDivisivel) {
				System.out.println("NÚMERO " + numero + " É DIVISÍVEL POR " + DIVISOR);
			}
		}
	}

}
