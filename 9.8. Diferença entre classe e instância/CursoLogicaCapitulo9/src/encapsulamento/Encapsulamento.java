package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		cliente.nome = "Lindomar";
//		cliente.telefone = "12 3456-7852";
//		
//		System.out.println("Nome cliente: "+cliente.nome);

		Cliente cliente = new Cliente();
		cliente.setNome("Lindomar Silva");
		cliente.setTelefone("12 3456-7852");

		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());
	}
}
