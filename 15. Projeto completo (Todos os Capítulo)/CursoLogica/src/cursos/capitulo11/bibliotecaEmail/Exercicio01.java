package cursos.capitulo11.bibliotecaEmail;

import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio01 {

	// 11.4. Exercício 01: Crie uma lista de tarefas e envie a lista por email
	public static void main(String[] args) throws EmailException {

		Scanner scanner = new Scanner(System.in);

		String tarefas = getListaDeTarefas(scanner);

		solicitaDestinatario(scanner, tarefas);

		scanner.close();
	}

	private static String getListaDeTarefas(Scanner scanner) {

		String tarefa = "";
		String tarefas = "";

		int i = 0;
		while (true) {

			System.out.print("DIGITE A " + ++i + "ª TAREFA OU DIGITE 'X' PARA ENCERRAR: ");
			tarefa = scanner.nextLine().toUpperCase();

			if (tarefa.equals("X")) {
				break;
			}

			tarefas += i + "- " + tarefa.toUpperCase() + "\n";
		}

		tarefas += "\nAtte.\nCarteiro";
		
		return tarefas;
	}

	private static void solicitaDestinatario(Scanner scanner, String tarefas) throws EmailException {

		Boolean existTarefas = tarefas != null && tarefas != "";

		if (existTarefas) {
			System.out.println("-------------------------------------");

			System.out.print("DIGITE O E-MAIL DO DESTINATÁRIO: ");
			String para = scanner.nextLine();

			String Assunto = "Lista de tarefas...";

			if (!para.contains("@")) {
				System.err.println("O E-mail digitado do destinatário é invalido!");
				System.exit(1);
			}

			Carteiro.enviarEmail(para, Assunto, tarefas);
		}
	}
}
