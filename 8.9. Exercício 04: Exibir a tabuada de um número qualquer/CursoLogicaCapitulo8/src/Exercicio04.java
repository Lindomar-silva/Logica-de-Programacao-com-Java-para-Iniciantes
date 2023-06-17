import java.util.Scanner;

public class Exercicio04 {

	// 8.9. Exercício 04: Exibir a tabuada de um número qualquer
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE UM NÚMERO PARA TABUADA: ");
		Integer multiplicando = scanner.nextInt();
		System.out.println("----------------------------------");

		imprimirTabuada(multiplicando);

		scanner.close();
	}

	private static void imprimirTabuada(Integer multiplicando) {
		imprimirTabuada(multiplicando, 0);
	}

	private static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {

		Integer result = multiplicando * multiplicador;
		System.out.println(multiplicando + " x " + multiplicador + " = " + result);

		if (multiplicador < 10) {
			imprimirTabuada(multiplicando, ++multiplicador);
		}
	}

}
