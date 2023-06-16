import java.util.Scanner;

public class Exercicio05 {

	// Constantes
	final static Double NOTA_MINIMA_PARA_APROVAR = 70.0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE A NOTA DO ALUNO: ");
		Double nota = scanner.nextDouble();
		Boolean passouDeAno = nota >= NOTA_MINIMA_PARA_APROVAR;

		if (passouDeAno) {
			System.out.println("O Alnuo foi aprovado!");
		} else {
			System.out.println("O Alnuo foi reprovado!");
		}

		scanner.close();
	}
}
