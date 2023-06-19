package classeInstancia;

public class Produto {

	private static Integer quantidadeMinima = 1;
	private String nome;

	public static Integer getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public static void setQuantidadeMinima(Integer quantidadeMinima) {
		Produto.quantidadeMinima = quantidadeMinima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
