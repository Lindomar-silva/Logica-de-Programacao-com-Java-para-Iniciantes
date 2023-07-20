package cursos.capitulo8;
import java.util.Scanner;

public class Exercicio02 {

	// Identifique um novo padrão no algoritmo da aula passada
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		imprimirTraco();
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		println("***** LISTAGEM DE CURSOS *****");
		iterarExibirVetorsString(cursos);

		print("ESCOLHA UMA OPÇÃO DE CURSO DESEJADO: ");
		Integer indiceCursoEscolhido = scanner.nextInt();

		validaIndice(indiceCursoEscolhido, cursos);

		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };

		imprimirTraco();
		println("***** LISTAGEM DE FORMAS DE PAGAMENTOS *****");
		iterarExibirVetorsString(formasDePagamento);

		print("ESCOLHA UMA OPÇÃO DE FORMA DE PAGAMENTO DESEJADO: ");
		Integer indiceFormaPagamentoEscolhida = scanner.nextInt();

		validaIndice(indiceFormaPagamentoEscolhida, formasDePagamento);

		String cursoEscolhido = cursos[indiceCursoEscolhido];
		String formaPagamntoEscolhido = formasDePagamento[indiceFormaPagamentoEscolhida];

		imprimirTraco();
		println("\n***** RESUMO FINAL *****");
		printf("CURSO ESCOLHIDO...: %s\nFORMA DE PAGAMENTO: %s ", cursoEscolhido, formaPagamntoEscolhido);

		scanner.close();
	}

	private static void print(String texto) {
		System.out.print(texto);
	}

	private static void println(String texto) {
		System.out.println(texto);
	}

	private static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}

	private static void iterarExibirVetorsString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			println("[" + i + "]" + vetor[i]);
		}
	}

	static void imprimirTraco() {
		println("-----------------------------------------------------");
	}

	static void validaIndice(Integer indiceEscolhido, String[] vetor) {
		Boolean indiceInvalido = indiceEscolhido < 0 || indiceEscolhido >= vetor.length;

		if (indiceInvalido) {
			System.err.println("OPÇÃO INVÁLIDA!");
			System.exit(1);
		}
	}
}
