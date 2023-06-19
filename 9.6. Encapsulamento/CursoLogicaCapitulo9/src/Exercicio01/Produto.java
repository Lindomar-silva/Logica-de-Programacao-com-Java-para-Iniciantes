package Exercicio01;

// 9.3. Exercício 01: Método que informa necessidade de repor estoque
public class Produto {

	final static Integer ESTOQUE_MINIMO = 10;
	String nome;
	Integer quantidadeEstoque;

	public Boolean precisaReporEstoque(Produto produto) {
		return produto.quantidadeEstoque < ESTOQUE_MINIMO;
	}

	public void exibirQuanitdadeEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto " + produto.nome + 
				" é de " + produto.quantidadeEstoque + " unidade");
	}
}
