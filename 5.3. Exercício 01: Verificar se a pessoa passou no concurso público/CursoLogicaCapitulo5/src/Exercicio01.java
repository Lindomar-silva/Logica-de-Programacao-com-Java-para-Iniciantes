import java.util.Scanner;

public class Exercicio01 {

	// Verificar se a pessoa passou no concurso público
	final static Double NOTA_MINIMA_TOTAL = 150.0;
	final static Double PONTO_MINIMO = 60.0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE A NOTA DE PORTUGUÊS: ");
		Double notaPortugues = scanner.nextDouble();

		System.out.print("DIGITE A NOTA DE MATEMÁTICA: ");
		Double notaMatematica = scanner.nextDouble();

		Boolean notaMinimaTotal = (notaPortugues + notaMatematica) >= NOTA_MINIMA_TOTAL;
		Boolean alunoAprovado = notaMinimaTotal && notaPortugues >= PONTO_MINIMO && notaMatematica >= PONTO_MINIMO;

		System.out.println("-----------------------------------------------------");
		System.out.println("NOTA DE PORTUGUÊS: " + notaPortugues);
		System.out.println("NOTA DE MATEMÁTICA: " + notaMatematica);

		if (alunoAprovado) {
			System.out.println("ALUNO FOI APROVADO!");
		} else {
			System.err.println("ALUNO FOI REPROVADO!");
		}

		scanner.close();
	}
}
