package exercicio02;

// 9.5. Exercício 02: Método de instância que informa necessidade de repor estoque
public class ReporEstoque {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.nome = "TV 50 Polegadas";
		produto.quantidadeEstoque = 9;

		System.out.println(produto.imprimirEstoque());

		if (produto.reporEstoque()) {
			System.out.println("É necessário fazer a reposição!");
		} else {
			System.out.println("Não é necessário fazer a reposição!");
		}
	}
}
