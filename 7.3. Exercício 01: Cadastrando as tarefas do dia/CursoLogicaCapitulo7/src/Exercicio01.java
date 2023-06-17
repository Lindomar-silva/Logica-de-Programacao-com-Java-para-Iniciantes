import java.util.Scanner;

public class Exercicio01 {

	// Cadastrando as tarefas do dia
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] tarefas = new String[5];

		System.out.println("CADASTRE SUAS TAREFAS IMPORTANTES: ");

		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("DIGITE A TAREFA " + i + ": ");
			tarefas[i] = scanner.nextLine();
		}

		System.out.println("-------------------------------------");

		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("TAREFA " + i + ": " + tarefas[i]);
		}
		scanner.close();
	}

}
