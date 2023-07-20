package cursos.capitulo10.leituraArquivos;

import java.io.IOException;
import java.util.List;

import cursos.capitulo10.uitl.ToFiles;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {

		List<String> linhas = ToFiles.lendoArquivo("arquivos/lista-de-tarefas.txt");

		for (String linha : linhas) {
			System.out.println(linha);
		}

	}
}
