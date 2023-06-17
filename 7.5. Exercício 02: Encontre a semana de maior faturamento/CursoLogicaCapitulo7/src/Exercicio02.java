
public class Exercicio02 {

	// Encontre a semana de maior faturamento
	public static void main(String[] args) {

		Double[] semanaUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[] { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] semanas = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

		Double maiorFaturamento = 0.0;
		Integer semanaVencedora = null;

		for (int i = 0; i < semanas.length; i++) {
			System.out.println("----- SEMANA " + (i + 1) + " -----");

			Double[] dias = semanas[i];
			Double faturamentoSemana = 0.0;

			for (int j = 0; j < dias.length; j++) {
				System.out.printf("DIAS %d VALOR %.2f\n", (j + 1), dias[j]);
				faturamentoSemana += dias[j];
			}

			Boolean isMaiorFaturamento = faturamentoSemana > maiorFaturamento;

			if (isMaiorFaturamento) {
				maiorFaturamento = faturamentoSemana;
				semanaVencedora = i + 1;
			}
		}

		System.out.printf("A SEMANA %d TEVE O MAIOR FATURAMNETO DE: %.2f", semanaVencedora, maiorFaturamento);
	}
}
