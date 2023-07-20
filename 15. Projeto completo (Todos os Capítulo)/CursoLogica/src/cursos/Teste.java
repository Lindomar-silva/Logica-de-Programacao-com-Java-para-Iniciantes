package cursos;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("------------------------------------------------------"); // sem o método!!!

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("Escolha um dos cursos para se matricular: ");

		Integer cursoEscolhido = null;

		while (posicaoInvalida(cursos, cursoEscolhido)) {

			if (cursoEscolhido != null) {
				System.out.println("Opção inválida, tente novamente.\n");
			}

			for (int i = 0; i < cursos.length; i++) {
				System.out.println("[" + i + "]" + cursos[i] + ":");
			}

			System.out.print("Qual a opção escolhida: ");
			cursoEscolhido = scan.nextInt();
		}

		imprimirTraco(); // aqui foi usado o método que foi feito no fim do algoritmo, para invoca-lo
							// basta escrever seu nome de forma correta e ele fará tudo que estiver no
							// método.

		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };
		Integer pagamentoEscolhido = null;

		while (posicaoInvalida(formasDePagamento, pagamentoEscolhido)) {

			if (pagamentoEscolhido != null) {
				System.err.println("Opção inválida, tente novamente.\n");
			}

			for (int i = 0; i < formasDePagamento.length; i++) {
				System.out.println("[" + i + "]" + formasDePagamento[i] + ":");
			}

			System.out.print("Qual a opção escolhida: ");
			pagamentoEscolhido = scan.nextInt();
		}

		String cursoMatriculado = cursos[cursoEscolhido];
		String pagamentoMatricula = formasDePagamento[pagamentoEscolhido];

		imprimirTraco();

		System.out.println(
				"O curso escolhido foi " + cursoMatriculado + " e a forma de pagamento foi " + pagamentoMatricula);

		scan.close();
	}

	static boolean posicaoInvalida(String[] array, Integer indexEscolhido) {
		int quantidadeCursos = array.length;
		boolean indexNulo = indexEscolhido == null;
		if (indexNulo) {
			return true;
		}
		boolean indexMaiorQueLimite = indexEscolhido > (quantidadeCursos - 1);
		boolean indexNegativo = indexEscolhido < 0;
		return (indexMaiorQueLimite || indexNegativo);
	}

	static void imprimirTraco() {
		System.out.println("-----------------------------------------------------------");
	}
}
