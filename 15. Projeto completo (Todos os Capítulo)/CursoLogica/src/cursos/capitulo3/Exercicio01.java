package cursos.capitulo3;
import java.util.Scanner;

public class Exercicio01 {

	// Calculando o quadrado de um número
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("CALCULANDO O QUADRADO DE UM NÚMERO");
		System.out.print("Digite um numero inteiro: ");
		Integer numero = scanner.nextInt();
		Integer result = numero * numero;

		System.out.println("O quadrado do número " + numero + " é igaul á" + result);

		scanner.close();
	}
}
