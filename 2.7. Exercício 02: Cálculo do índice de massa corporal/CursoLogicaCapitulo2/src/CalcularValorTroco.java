import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		Double peso = scanner.nextDouble();

		System.out.print("Digite sua altura: ");
		Double altura = scanner.nextDouble();

		Double imc = peso / (altura * altura);

		System.out.printf("Seu IMC: %.2f%n", imc);

		if (imc < 18.5) {
			System.out.println("Peso abaixo do recomendado!");
		} else if (imc < 25) {
			System.out.println("Peso ideal!");
		} else if (imc < 30) {
			System.out.println("Levemente acima do peso!");
		} else if (imc < 35) {
			System.out.println("Obesidade grau 1!");
		} else if (imc < 40) {
			System.out.println("Obesidade gráu 2 (severa)!");
		} else if (imc > 40) {
			System.out.println("Obesidade grau 3 (mórbida)");
		}
		
		scanner.close();
	}
}
