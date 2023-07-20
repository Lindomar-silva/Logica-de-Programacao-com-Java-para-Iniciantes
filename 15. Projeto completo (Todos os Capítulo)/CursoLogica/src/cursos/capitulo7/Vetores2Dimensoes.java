package cursos.capitulo7;
public class Vetores2Dimensoes {

	public static void main(String[] args) {

		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFevereiro = new Double[] { 1800.0, 2500.0, 1900.0 };

		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };

//		System.out.println("FATURAMENTO DO DIA 1° DE JANEIRO: " + faturamentoAnual[0][0]);
//		System.out.println("FATURAMENTO DO DIA 3° DE FEVEREIRO: " + faturamentoAnual[1][2]);

		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("MÊS " + (i + 1));

			Double[] mes = faturamentoAnual[i];

			for (int j = 0; j < mes.length; j++) {
				Double dia = mes[j];
				System.out.println("FATURAMENTO DO DIA " + (j + 1) + "° DE FEVEREIRO: " + dia);
			}
		}
	}

}
