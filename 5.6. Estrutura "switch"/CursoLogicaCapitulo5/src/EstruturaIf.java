
public class EstruturaIf {

	public static void main(String[] args) {

		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;

//		Boolean movimentaPeloMenosMetadeDoValor = true;
		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficenteDeAbertura = true;
		Boolean temNomeLimpo = true;

		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficenteDeAbertura
				&& temNomeLimpo;

		if (liberarEmprestimo) {
			System.out.println("EMPRESTIMO LIBERADO!");
		} else {
			System.out.println("EMPRESTIMO NEGADO!");
		}

		if ((!((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficenteDeAbertura && temNomeLimpo)) {
			System.out.println("EMPRESTIMO LIBERADO!");
		} else {
			System.out.println("EMPRESTIMO NEGADO!");
		}
	}
}
