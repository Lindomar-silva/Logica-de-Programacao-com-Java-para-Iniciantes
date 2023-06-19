package encapsulamento;

public class Cliente {

//	private String nome;
	private String primeiroNome;
	private String ultimoNome;
	private String telefone;

	public String getNome() {
		return primeiroNome + " " + ultimoNome;
	}

	public void setNome(String nome) {
		String[] nomeCompleto = nome.split(" ");

		this.primeiroNome = nomeCompleto[0];
		this.ultimoNome = nomeCompleto[1];
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
