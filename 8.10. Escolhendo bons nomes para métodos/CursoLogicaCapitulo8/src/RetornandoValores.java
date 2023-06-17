
public class RetornandoValores {

	public static void main(String[] args) {
		// 50 --- 100%
		// x --- 20

		// 50 * 20 = x * 100

		// x = (50 * 20) / 100

		Double[] premissa = new Double[] {50.0, 100.0 };
		Double porcento = 20.0;

		printf("Resultado final: %.2f", regraDeTres(premissa, porcento));

	}

	static Double regraDeTres(Double[] premissa, Double proporcao) {
		return premissa[0] * proporcao / premissa[1];
	}

	@SuppressWarnings("unused")
	private static void println(String texto) {
		System.out.println(texto);
	}

	private static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}
}
