package cursos.capitulo5;
import java.util.Scanner;

public class UtilizandoIfEncadeado {

	final static Double PESO_LEVE = 60.0;
	final static Double PESO_INTERMEDIARIO = 90.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE SE PESO: ");
		Double peso = scanner.nextDouble();

		Boolean pesoLeve = peso <= PESO_LEVE;
		Boolean pesoMedio = (peso > PESO_LEVE && peso <= PESO_INTERMEDIARIO);
		Boolean pesoPesado = peso > PESO_INTERMEDIARIO;

		System.out.println("-----------------------------------------------------");

		// PRIMEIRA RESOLUÇÃO (VERIFICA TODAS AS CONDIÇÕES)
		if (pesoLeve) {
			System.out.println("LUTADOR DE PESO LEVE");
		}
		if (pesoMedio) {
			System.out.println("LUTADOR DE PESO MÉDIO");
		}
		if (pesoPesado) {
			System.out.println("LUTADOR DE PESO PESADO");
		}

		// SEGUNDA RESOLUÇÃO (INTERPRETAÇÃO COMPLICADA)
		if (pesoLeve) {
			System.out.println("LUTADOR DE PESO LEVE");

		} else {
			Boolean pesoMedio1 = (peso > PESO_LEVE && peso <= PESO_INTERMEDIARIO);
			if (pesoMedio1) {
				System.out.println("LUTADOR DE PESO MÉDIO");

			} else {
				Boolean pesoPesado1 = peso > PESO_INTERMEDIARIO;
				if (pesoPesado1) {
					System.out.println("LUTADOR DE PESO PESADO");
				}
			}
		}

		// TERCEIRA RESOLUÇÃO (MELHOR OPCÃO, SE A PRIMEIRA CONDIÇÃO SASTIFAZ, NÃO VERIFICA AS DEMAIS)
		if (pesoLeve) {
			System.out.println("LUTADOR DE PESO LEVE");

		} else if (pesoMedio) {
			System.out.println("LUTADOR DE PESO MÉDIO");

		} else if (pesoPesado) {
			System.out.println("LUTADOR DE PESO PESADO");
		}

		scanner.close();
	}
}
