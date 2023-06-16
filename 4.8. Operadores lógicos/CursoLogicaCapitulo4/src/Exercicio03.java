import java.util.Scanner;

public class Exercicio03 {

	// Cálculo de gastos familiar
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Double gastoTotal = 0.0;

		System.out.print("DIGITE O VALOR DA CONTA DE LUZ: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("DIGITE O VALOR DA CONTA DE ÁGUA: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("DIGITE O VALOR DA CONTA DE TELEFONE: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("DIGITE O VALOR DA ESCOLA DO FILHO: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("DIGITE O VALOR DA FATURA DO CARTÃO: ");
		gastoTotal += scanner.nextDouble();

		System.out.print("DIGITE O VALOR DOS GASTOS COM SUPERMERCADO: ");
		gastoTotal += scanner.nextDouble();

		System.out.println("-------------------------------------------------");
		System.out.printf("GASTOS TOTAL: %.2f%n ", gastoTotal);

		scanner.close();
	}
}
