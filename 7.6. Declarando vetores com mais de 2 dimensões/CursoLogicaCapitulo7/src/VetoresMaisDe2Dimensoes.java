public class VetoresMaisDe2Dimensoes {

	public static void main(String[] args) {

		Double[] faturamentoJaneiro = new Double[] { 1500.3, 2000.0, 1700.0 };
		Double[] faturamentoFevereiro = new Double[] { 1800.0, 2500.0, 1900.0 };
		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };
		Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };
		Double[][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal };

		for (int i = 0; i < faturamentoDaDecada.length; i++) {
			Double[][][] quinQuenal = faturamentoDaDecada[i];

			for (int j = 0; j < quinQuenal.length; j++) {
				Double[][] anual = quinQuenal[j];

				for (int k = 0; k < anual.length; k++) {
					Double[] mes = anual[k];
					String nomeMes = ((k + 1) == 1 ? "JANEIRO" : "FEVEREIRO");
					System.out.println("----- MÊS DE " + nomeMes + " -----");

					for (int l = 0; l < mes.length; l++) {
						Double dia = mes[l];
						System.out.println("FATURAMENTO DO " + (l + 1) + "° DIA " + dia);
					}
				}
			}
		}
	}

}
