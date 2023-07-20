package cursos.capitulo9.exercicio01;

//9.3. Exercício 01: Método que informa necessidade de repor estoque
public class ReporEstoque {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.nome = "TV 50 Polegadas";
		produto.quantidadeEstoque = 9;

		produto.exibirQuanitdadeEstoque(produto);
		precisaReporEstoque(produto);
	}

	static void precisaReporEstoque(Produto produto) {

		if (produto.precisaReporEstoque(produto)) {
			System.out.println("É necessário fazer a reposição!");
		} else {
			System.out.println("Não é necessário fazer a reposição!");
		}
	}

}
