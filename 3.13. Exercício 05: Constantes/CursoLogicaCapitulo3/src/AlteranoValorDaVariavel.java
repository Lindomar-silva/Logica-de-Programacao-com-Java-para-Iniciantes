import java.util.Scanner;

public class AlteranoValorDaVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE O VALOR DO PRODUTO: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("DIGITE O TIPO DO PAAGAMENTO [1 = a vista / 2 = a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();

		Boolean aPrazo = tipoPagamento.equals(2);

		Double juros = 0.0;

		if (aPrazo) {
			juros = 10.0;
		}

		Double acrescimo = (valorProduto * juros) / 100;
		Double valorTotal = acrescimo + valorProduto;

		System.out.printf("Acrescimo: %.2f%n", valorTotal);

		scanner.close();
	}
}
