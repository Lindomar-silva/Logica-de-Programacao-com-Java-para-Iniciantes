package metodoInstancia;

public class Cliente {

	String primeiroNome = "Lindomar";
	String ultimoNome;
	String telefone;
	String email;

	public String devolverNomeCompletoCliente() {
		return "Nome cliente: " + primeiroNome + " " + ultimoNome;
	}

	public String obterDDD() {
		return telefone.substring(0, 2);
	}
}
