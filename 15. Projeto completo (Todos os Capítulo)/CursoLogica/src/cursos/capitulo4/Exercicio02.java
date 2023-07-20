package cursos.capitulo4;
import java.util.Scanner;

public class Exercicio02 {

	// Desconto de frete em compras acima de R$100,00
	final static Double VALOR_FRETE = 15.0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE O VALOR DO PRODUTO: ");
		Double valorProduto = scanner.nextDouble();

		Double valorFinal = valorProduto;
		Boolean cobrarFrete = valorProduto < 100.0;

		if (cobrarFrete) {
			valorFinal = valorProduto + VALOR_FRETE;
		}

		System.out.printf("VALOR FINAL DA COMPRA: %.2f%n", valorFinal);
		scanner.close();
	}
}
