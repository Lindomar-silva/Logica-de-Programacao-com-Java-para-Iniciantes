import java.util.Scanner;

public class AlunoPassouDeAno {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE A NOTA DO ALUNO: ");
		Double nota = scanner.nextDouble();
		Boolean passouDeAno = nota >= 70;

		if (passouDeAno) {
			System.out.println("O Alnuo foi aprovado!");
		} else {

			System.out.println("O Alnuo foi reprovado!");
		}
		
		scanner.close();
	}
}
