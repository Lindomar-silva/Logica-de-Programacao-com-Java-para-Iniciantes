package cursos.capitulo10.escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			System.out.print("JOGADOR " + i + ": ");
			String nome = scanner.nextLine();

			linhas.add(nome.toUpperCase());
		}

		Path arquivo = Paths.get("/tmp/arquivo.txt");
		Files.write(arquivo, linhas);
		System.out.println("Encerrado!");

		scanner.close();
	}
}
