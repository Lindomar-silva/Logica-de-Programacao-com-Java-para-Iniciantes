package cursos.capitulo10.exercicio01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cursos.capitulo10.uitl.ToFiles;

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

		ToFiles.salvandoArquivo("arquivos/lista-de-tarefas.txt", atividades);

		scanner.close();
		System.out.println("Encerado!");
	}
}
