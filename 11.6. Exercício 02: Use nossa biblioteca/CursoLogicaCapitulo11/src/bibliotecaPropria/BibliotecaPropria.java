package bibliotecaPropria;

import console.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {

		Interacao interacao = new Interacao();

		Integer numero = interacao.lerNumero("DIGITE UM NÚMERO: ");
		interacao.println("Número: " + numero);

		interacao.printTraco();

		Double decimal = interacao.lerDecimal("DIGITE UM DECIMAL: ");
		interacao.println("Decimal: " + decimal);

		interacao.printTraco();
		interacao.printErr("Essa é uma mensagem de erro...");

		interacao.fechar();
	}
}
