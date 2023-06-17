import java.util.Scanner;

public class PrimeiroMetodoModificado {

	static Integer indiceCursoEscolhido;
	static Integer indiceFormaPagamentoEscolhida;
	static Scanner scanner = null;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };
		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };

		escolhaCurso(cursos);
		escolhaFormaPagamento(formasDePagamento);
		resumoPedido(cursos, formasDePagamento);

		scanner.close();
	}

	static void escolhaCurso(String[] cursos) {

		imprimirTraco();
//		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("***** LISTAGEM DE CURSOS *****");
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos[i]);
		}

		System.out.print("ESCOLHA UMA OPÇÃO DE CURSO DESEJADO: ");
		indiceCursoEscolhido = scanner.nextInt();

		Boolean indiceInvalido = indiceCursoEscolhido < 0 || indiceCursoEscolhido >= cursos.length;
		validaIndice(indiceInvalido);

//		scanner.close();
	}

	static void escolhaFormaPagamento(String[] formasDePagamento) {
//		Scanner scanner = new Scanner(System.in);

//		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };

		imprimirTraco();
		System.out.println("***** LISTAGEM DE FORMAS DE PAGAMENTOS *****");
		for (int i = 0; i < formasDePagamento.length; i++) {
			System.out.println("[" + i + "]" + formasDePagamento[i]);
		}

		System.out.print("ESCOLHA UMA OPÇÃO DE FORMA DE PAGAMENTO DESEJADO: ");
		indiceFormaPagamentoEscolhida = scanner.nextInt();

		Boolean indiceInvalido = indiceFormaPagamentoEscolhida < 0
				|| indiceFormaPagamentoEscolhida >= formasDePagamento.length;

		validaIndice(indiceInvalido);

//		scanner.close();
	}

	static void validaIndice(Boolean indiceInvalido) {
		if (indiceInvalido) {
			System.err.println("OPÇÃO INVÁLIDA!");
//			System.exit(1);
			main(null);
		}
	}

	static void resumoPedido(String[] cursos, String[] formasDePagamento) {
		String cursoEscolhido = cursos[indiceCursoEscolhido];
		String formaPagamntoEscolhido = formasDePagamento[indiceFormaPagamentoEscolhida];

		imprimirTraco();
		System.out.println("\n***** RESUMO FINAL *****");
		System.out.printf("CURSO ESCOLHIDO...: %s\nFORMA DE PAGAMENTO: %s ", cursoEscolhido, formaPagamntoEscolhido);

	}

	static void imprimirTraco() {
		System.out.println("-----------------------------------------------------");
	}

}
