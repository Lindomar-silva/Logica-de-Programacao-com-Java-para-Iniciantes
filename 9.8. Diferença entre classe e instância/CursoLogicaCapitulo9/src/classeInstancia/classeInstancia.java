package classeInstancia;

public class classeInstancia {

	public static void main(String[] args) {
		System.out.println("Estoque mínimo: " + Produto.getQuantidadeMinima());

		Produto produto1 = new Produto();
		produto1.setNome("Caneca");

//		produto1.setQuantidadeMinima(10);
//		System.out.println("Estoque mínimo: " + Produto.getQuantidadeMinima());

		Produto produto2 = new Produto();
		produto2.setNome("Carteira");

		System.out.println("Estoque mínimo: " + Produto.getQuantidadeMinima());

//		System.out.println("Produto 1: " + produto1.getNome());
//		System.out.println("Produto 2: " + produto2.getNome());

		Impressao.informacao("Produto 1: " + produto1.getNome());
		Impressao.informacao("Produto 2: " + produto2.getNome());

	}

}
