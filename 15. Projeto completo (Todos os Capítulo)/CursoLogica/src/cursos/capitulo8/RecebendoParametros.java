package cursos.capitulo8;
import java.util.Scanner;

public class RecebendoParametros {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		imprimirTraco();
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("***** LISTAGEM DE CURSOS *****");
		iterarExibirVetorsString(cursos);

		System.out.print("ESCOLHA UMA OPÇÃO DE CURSO DESEJADO: ");
		Integer indiceCursoEscolhido = scanner.nextInt();

		Boolean indiceInvalido = indiceCursoEscolhido < 0 || indiceCursoEscolhido >= cursos.length;

		validaIndice(indiceInvalido);

		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };

		imprimirTraco();
		System.out.println("***** LISTAGEM DE FORMAS DE PAGAMENTOS *****");
		iterarExibirVetorsString(formasDePagamento);

		System.out.print("ESCOLHA UMA OPÇÃO DE FORMA DE PAGAMENTO DESEJADO: ");
		Integer indiceFormaPagamentoEscolhida = scanner.nextInt();

		indiceInvalido = indiceFormaPagamentoEscolhida < 0 || indiceFormaPagamentoEscolhida >= formasDePagamento.length;

		validaIndice(indiceInvalido);

		String cursoEscolhido = cursos[indiceCursoEscolhido];
		String formaPagamntoEscolhido = formasDePagamento[indiceFormaPagamentoEscolhida];

		imprimirTraco();
		System.out.println("\n***** RESUMO FINAL *****");
		System.out.printf("CURSO ESCOLHIDO...: %s\nFORMA DE PAGAMENTO: %s ", cursoEscolhido, formaPagamntoEscolhido);

		scanner.close();
	}

	private static void iterarExibirVetorsString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "]" + vetor[i]);
		}
	}

	static void imprimirTraco() {
		System.out.println("-----------------------------------------------------");
	}

	static void validaIndice(Boolean indiceInvalido) {
		if (indiceInvalido) {
			System.err.println("OPÇÃO INVÁLIDA!");
			System.exit(1);
		}
	}

}
