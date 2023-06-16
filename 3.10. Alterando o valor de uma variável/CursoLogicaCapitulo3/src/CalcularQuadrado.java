import java.util.Scanner;

public class CalcularQuadrado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("CALCULANDO O QUADRADO DE UM NÚMERO");
		System.out.print("Digite um numero inteiro: ");
		Integer numero = scanner.nextInt();
		Integer result = numero * numero;

		System.out.println("O quadrado do número " + numero + " é igaul á" + result);
	}
}
