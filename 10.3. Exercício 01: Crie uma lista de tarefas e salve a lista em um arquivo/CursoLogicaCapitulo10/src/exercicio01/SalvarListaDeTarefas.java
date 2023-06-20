package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalvarListaDeTarefas {

	// 10.3. Exercício 01: Crie uma lista de tarefas e salve a lista em um arquivo
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		List<String> atividades = new ArrayList<>();
		String atividade = "";

		int i = 0;
		while (true) {
			System.out.print("DIGITE A ATIVIDADE " + ++i + ": ");
			atividade = scanner.nextLine().toUpperCase();

			if (atividade.equals("X")) {
				break;
			}

			atividades.add("ATIVIDADE " + i + ": " + atividade);

		}

		salvandoNoArquivo("/tmp/arquivo.txt", atividades);

		scanner.close();
		System.out.println("Encerado!");
	}

	static void salvandoNoArquivo(String arquivo, List<String> atividades) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, atividades);
	}
}
