package metodoInstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.primeiroNome = "Lindomar";
		cliente1.ultimoNome = "Silva";
		cliente1.telefone = "12 3-4567-8901";
		cliente1.email = "lindomar@cliente.com";

		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "João";
		cliente2.ultimoNome = "Silva";
		cliente2.telefone = "12 3-4567-8901";
		cliente2.email = "joao@cliente.com";

		System.out.println(cliente1.devolverNomeCompletoCliente() + ", DDD: " + cliente1.obterDDD());
		System.out.println(cliente2.devolverNomeCompletoCliente() + ", DDD: " + cliente2.obterDDD());
	}
}
