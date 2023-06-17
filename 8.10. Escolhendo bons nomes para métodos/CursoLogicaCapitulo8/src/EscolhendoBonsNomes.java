import java.util.Scanner;

public class EscolhendoBonsNomes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		imprimirTraco();
		String cursoEscolhido = exibeRecebeCurso(scanner);

		imprimirTraco();
		String formaPagamntoEscolhido = exibeRecebeFormaPagamento(scanner);

		imprimirTraco();
		println("\n***** RESUMO FINAL *****");
		printf("CURSO ESCOLHIDO...: %s\nFORMA DE PAGAMENTO: %s ", cursoEscolhido, formaPagamntoEscolhido);

		scanner.close();
	}

	private static String exibeRecebeCurso(Scanner scanner) {
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		println("***** LISTAGEM DE CURSOS *****");
		iterarExibirVetorsString(cursos);

		Integer indiceCursoEscolhido = recebeOpcaoEscolhida("ESCOLHA UMA OPÇÃO DE CURSO DESEJADO: ", scanner);

		validaIndice(indiceCursoEscolhido, cursos);

		return cursos[indiceCursoEscolhido];
	}

	private static String exibeRecebeFormaPagamento(Scanner scanner) {
		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };

		println("***** LISTAGEM DE FORMAS DE PAGAMENTOS *****");
		iterarExibirVetorsString(formasDePagamento);

		Integer indiceFormaPagamentoEscolhida = recebeOpcaoEscolhida(
				"ESCOLHA UMA OPÇÃO DE FORMA DE PAGAMENTO DESEJADO: ", scanner);

		validaIndice(indiceFormaPagamentoEscolhida, formasDePagamento);

		return formasDePagamento[indiceFormaPagamentoEscolhida];
	}

	private static Integer recebeOpcaoEscolhida(String texto, Scanner scanner) {
		print(texto);
		Integer indiceCursoEscolhido = scanner.nextInt();
		return indiceCursoEscolhido;
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
