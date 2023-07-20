package cursos.capitulo6;
public class InteracaoFor {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i + ": Uma frase qualquer");
//		}

//		Double[] carrinhoDeCompra = new Double[] { 50.0, 51.0, 52.0 };
//		Double total = 0.0;
//
//		for (int i = 0; i < carrinhoDeCompra.length; i++) {
//			System.out.println("Interção: " + i + " Total: " + total);
//			total += carrinhoDeCompra[i];
//		}
//		
//		System.out.printf("Total: %.2f", total);

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i + ": Uma frase qualquer");
//			if (i == 5) {
//				System.out.println("SAINDO DO FOR...");
//				break;
//			}
//		}

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i + ": Uma frase qualquer");
//			if (i == 5) {
//				System.out.println("CONTINUANDO FOR...");
//				continue;
//			}
//		}

		Integer[] produtos = new Integer[] { 100, 225, 300 };

		for (int i = 0; i < produtos.length; i++) {

			System.out.println("Produtos " + produtos[i]);
			if (produtos[i].equals(225)) {
				System.out.println("\nProduto " + produtos[i] + " encontrado!");
				break;
			}
		}
	}

}
