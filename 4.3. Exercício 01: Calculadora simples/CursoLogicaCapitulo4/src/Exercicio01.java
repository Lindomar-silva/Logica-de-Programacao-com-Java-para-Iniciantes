import java.util.Scanner;

public class Exercicio01 {

	// Calculadora simples
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
		Integer numero1 = scanner.nextInt();

		System.out.print("DIGITE O NÚMERO DA OPERAÇÃO [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operacao = scanner.nextInt();

		System.out.print("DIGITE O SEGUNDO NÚMERO: ");
		Integer numero2 = scanner.nextInt();

		Integer resultado = 0;
		String operacaoDescricao = "";

		if (operacao.equals(1)) {
			operacaoDescricao = "Adição";
			resultado = numero1 + numero2;
			
		} else if (operacao.equals(2)) {
			operacaoDescricao = "Subtração";
			resultado = numero1 - numero2;
			
		} else if (operacao.equals(3)) {
			operacaoDescricao = "Multiplicação";
			resultado = numero1 * numero2;
			
		} else {
			operacaoDescricao = "Divisão";
			resultado = numero1 / numero2;
		}

		System.out.println("-----------------------------------------");
		System.out.println("RESULTADO DA " + operacaoDescricao.toUpperCase() + ": " + resultado);
		scanner.close();
	}
}