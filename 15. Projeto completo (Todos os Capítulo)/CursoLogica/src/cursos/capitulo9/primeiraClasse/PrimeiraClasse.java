package cursos.capitulo9.primeiraClasse;

public class PrimeiraClasse {

	public static void main(String[] args) {

		Produto produto = new Produto();

		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0;
		produto.qauntidade = 15;

		exibirQuantdadeEmEstoque(produto);
	}

	static void exibirQuantdadeEmEstoque(Produto produto) {
		System.out.println(
				"Quantidade em estoque do produto " + produto.nome + " é de " + produto.qauntidade + " unidade");
	}
}
