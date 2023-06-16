import java.util.Scanner;

public class Exercicio02 {

	// Faça a impressão do nome e do sobrenome da pessoa
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE SEU NOME: ");
		String nome = scanner.nextLine();

		System.out.print("DIGITE SEU SOBRENOME: ");
		String sobrenome = scanner.nextLine();

		System.out.print("DIGITE SEU SEXO ('M' ou 'F'): ");
		Character sexo = scanner.next().charAt(0);

		String nomeCompleto = nome.substring(0, 1).toUpperCase() + nome.substring(1) + " " + sobrenome;

		System.out.println("------------------------------------------");
		System.out.println("NOME..: " + nomeCompleto);
		System.out.println("SEXO..: " + sexo.toString().toUpperCase());

		scanner.close();

	}
}
