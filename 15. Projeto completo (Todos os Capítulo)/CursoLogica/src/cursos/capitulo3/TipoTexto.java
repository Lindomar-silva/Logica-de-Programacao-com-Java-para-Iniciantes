package cursos.capitulo3;
import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE SEU NOME: ");
		String nome = scanner.nextLine();

		System.out.print("DIGITE SUA IDADE: ");
		Integer idade = scanner.nextInt();

		System.out.print("DIGITE SEU SEXO ('M' ou 'F'): ");
		Character sexo = scanner.next().charAt(0);

		System.out.println("SEGUE OS DADOS...");
		System.out.println("NOME..: " + nome.substring(0, 1).toUpperCase() + nome.substring(1));
		System.out.println("IDADE.: " + idade);
		System.out.println("SEXO..: " + sexo.toString().toUpperCase());

		scanner.close();

	}
}
