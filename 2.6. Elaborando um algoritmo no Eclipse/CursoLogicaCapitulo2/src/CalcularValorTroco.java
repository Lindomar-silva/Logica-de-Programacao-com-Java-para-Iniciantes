import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite o valor passado pelo cliente: ");
		Double valorCliente = scanner.nextDouble();

		Double troco = valorCliente - valorProduto;

		System.out.printf("Troco: %.2f%n", troco);
		
		scanner.close();
	}
}
