import java.util.Scanner;

public class Exercicio04 {

	// Encontre o valor total baseado na quantidade e no desconto
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("DIDGITE O VALOR DO PRODUTO: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("DIDGITE A QUATIDADE DO PRODUTO: ");
		Integer qtdeProduto = scanner.nextInt();

		Double subTotal = valorProduto * qtdeProduto;
		Boolean qtdeMaiorOuIgualADez = qtdeProduto >= 10;
		Double desconto = 0.0;

		if (qtdeMaiorOuIgualADez) {
			desconto = subTotal * (10.0 / 100);
		}

		Double valorTotal = subTotal - desconto;
		System.out.printf("Valor total do produto: %.2f%n", valorTotal);

		scanner.close();
	}
}
