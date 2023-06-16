
public class Exercicio02 {

	// Repita o exercício anterior com o "while"
	private static final Integer DIVISOR = 3;

	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int i = 0;
		while (i < numeros.length) {
			Boolean isDivisivel = numeros[i] % DIVISOR == 0;

			if (isDivisivel) {
				System.out.println("NÚMERO " + numeros[i] + " É DIVISÍVEL POR " + DIVISOR);
			}

			i++;
		}

		System.out.println("FIM DO WHILE...");
	}

}
