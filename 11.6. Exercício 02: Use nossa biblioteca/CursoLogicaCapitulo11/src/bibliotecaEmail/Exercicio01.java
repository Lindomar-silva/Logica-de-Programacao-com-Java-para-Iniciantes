package bibliotecaEmail;

import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio01 {

	// 11.4. Exercício 01: Crie uma lista de tarefas e envie a lista por email
	public static void main(String[] args) throws EmailException {

		Scanner scanner = new Scanner(System.in);

		String tarefas = "";
		String tarefa = "";

		int i = 0;
		while (true) {

			System.out.print("DIGITE A " + ++i + "ª TAREFA OU DIGITE 'X' PARA ENCERRAR: ");
			tarefa = scanner.nextLine().toUpperCase();

			if (tarefa.equals("X")) {
				break;
			}

			tarefas += i + "- " + tarefa.toUpperCase() + "\n";
		}

		System.out.println("-------------------------------------");

		System.out.print("DIGITE O E-MAIL DO DESTINATÁRIO: ");
		String para = scanner.nextLine();

		String Assunto = "Lista de tarefas...";

		scanner.close();

		System.out.println("Enviando e-mail, aguarde...");
		Carteiro.enviar(para, Assunto, tarefas.toString());
	}
}
