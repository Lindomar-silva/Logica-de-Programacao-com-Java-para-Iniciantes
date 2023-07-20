package cursos.capitulo4;

public class ConcatenacaoTexto {

	public static void main(String[] args) {

		String inicio = "Esse é o ";
		String meio = "º exemplo ";
		String fim = "sobre concatenação de textos.";
		Integer numero = 1;

		System.out.println(inicio + numero + meio + fim);
		System.out.println("Esse é o 2" + meio + "sobre concatenação de textos.");

	}
}
