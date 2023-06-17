import java.util.Scanner;

public class Exercicio03 {

	// Crie uma pequena calculadora de subtração e adição
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double numero1 = informeNumero(scanner);
		imprimirTraco();

		Integer operacao = informeOperacao(scanner);
		imprimirTraco();

		Double numero2 = informeNumero(scanner);
		imprimirTraco();

		Double resultado = calcular(operacao, numero1, numero2);

		printf("RESULTADO: %.2f", resultado);

		scanner.close();

	}

	static Double informeNumero(Scanner scanner) {
		print("ESCOLHA UM NÚMERO: ");
		return scanner.nextDouble();
	}

	static Integer informeOperacao(Scanner scanner) {
		println("OPERAÇÕES MATEMÁTICA");
		String[] operacoes = new String[] { "Adição", "Subtração", "multiplicacao", "divisao", "Porcentagem",
				"Resto (Módulo)", "TABUADA" };

		for (int i = 0; i < operacoes.length; i++) {
			println("[" + i + "] " + operacoes[i]);
		}

		print("ESCOLHA A OPERAÇÃO: ");
		return scanner.nextInt();
	}

	static Double calcular(Integer operacao, Double numero1, Double numero2) {

		switch (operacao) {
		case 0:
			return adicao(numero1, numero2);

		case 1:
			return subtracao(numero1, numero2);

		case 2:
			return multiplicacao(numero1, numero2);

		case 3:
			return divisao(numero1, numero2);

		case 4:
			return regraDeTres(numero1, numero2);

		case 5:
			return restoModulo(numero1, numero2);

		case 6:
			return imprimirTabuada(new Integer(numero1.intValue()));

		default:
			System.err.println("OPERAÇÃO INVÁLIDA!");
			System.exit(1);
		}

		return null;
	}

	static Double adicao(Double numero1, Double numero2) {
		return numero1 + numero2;
	}

	static Double subtracao(Double numero1, Double numero2) {
		return numero1 - numero2;
	}

	static Double multiplicacao(Double numero1, Double numero2) {
		return numero1 * numero2;
	}

	static Double divisao(Double numero1, Double numero2) {
		return numero1 / numero2;
	}

	static Double regraDeTres(Double premissa, Double proporcao) {
		// 50 --- 100%
		// x --- 20

		// 50 * 20 = x * 100

		// x = (50 * 20) / 100

		return premissa * proporcao / 100;
	}

	static Double restoModulo(Double numero1, Double numero2) {
		return numero1 % numero2;
	}

	static Double imprimirTabuada(Integer multiplicando) {
		return imprimirTabuada(multiplicando, 0);
	}

	static Double imprimirTabuada(Integer multiplicando, Integer multiplicador) {

		Double result = (double) (multiplicando * multiplicador);
		System.out.println(multiplicando + " x " + multiplicador + " = " + result);

		if (multiplicador < 10) {
			return imprimirTabuada(multiplicando, ++multiplicador);
		}

		return 0.0;
	}

	private static void print(String texto) {
		System.out.print(texto);
	}

	private static void println(String texto) {
		System.out.println(texto);
	}

	private static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}

	static void imprimirTraco() {
		println("-----------------------------------------------------");
	}

}
