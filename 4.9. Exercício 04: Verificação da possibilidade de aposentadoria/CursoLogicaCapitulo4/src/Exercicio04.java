import java.util.Scanner;

public class Exercicio04 {

	// Verificação da possibilidade de aposentadoria
	final static Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	final static Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE A IDADE: ");
		Integer idade = scanner.nextInt();

		System.out.print("DIGITE A O TEPO DE CONTRIBUIÇÃO: ");
		Integer tempoContribuicao = scanner.nextInt();

		Boolean podeAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR
				&& tempoContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;

		if (podeAposentar) {
			System.out.println("VOCÊ PODE APOSENTAR!");
		} else {
			System.out.println("VOCÊ NÃO PODE APOSENTAR!");
		}

		scanner.close();
	}
}
