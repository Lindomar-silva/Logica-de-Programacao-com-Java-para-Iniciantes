import java.util.Scanner;

public class Exercicio02 {

	// Calcule o bônus do funcionário(a)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE A META ANUAL DE FATURAMENTO DO ANO PASSADO: ");
		Double metaAnualFaturamento = scanner.nextDouble();

		System.out.print("DIGITE O FATURAMENTO REAL DO ANO PASSADO: ");
		Double faturamentoReal = scanner.nextDouble();

		System.out.print("DIGITE A MÉDIA SALARIAL DO FUNCIONÁRIO DO ANO PASSADO: ");
		Double mediaSalarial = scanner.nextDouble();

		Double oitentaPorcentoDaMeta = (metaAnualFaturamento * 80.0) / 100;
		
		Boolean ganhaBonusIgualMediaSalarial = faturamentoReal >= metaAnualFaturamento;
		Boolean ganhaBonus80PorcentoMediaSalarial = faturamentoReal >= oitentaPorcentoDaMeta;

		System.out.println("-----------------------------------------------------");

		if (ganhaBonusIgualMediaSalarial) {
			System.out.printf("FUNCIONÁRIO GANHOU BÔNUS DE: %.2f%n", mediaSalarial);

		} else if (ganhaBonus80PorcentoMediaSalarial) {
			Double bonus80Porcento = (mediaSalarial * 80.0) / 100;
			System.out.printf("FUNCIONÁRIO GANHOU BÔNUS DE 80 PORCENTO DA MEDIA DO SALÁRIO: %.2f%n", bonus80Porcento);

		} else {
			System.out.println("ESSE NÃO TEM BÔNUS!");
		}

		scanner.close();
	}
}
