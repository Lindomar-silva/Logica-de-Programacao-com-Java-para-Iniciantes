package cursos.capitulo9.exercicio02;

// 9.5. Exercício 02: Método de instância que informa necessidade de repor estoque
public class Produto {

	final static Integer ESTOQUE_MINIMO = 10;
	String nome;
	Integer quantidadeEstoque;

	public Boolean reporEstoque() {
		return quantidadeEstoque < ESTOQUE_MINIMO;
	}

	public String imprimirEstoque() {
		return "Estoque: " + quantidadeEstoque;
	}
}
