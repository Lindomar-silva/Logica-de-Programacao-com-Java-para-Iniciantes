package leituraArquivos;

import java.io.IOException;
import java.util.List;

import uitl.ToFiles;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {

		List<String> linhas = ToFiles.lendoArquivo("src/arquivo.txt");

		for (String linha : linhas) {
			System.out.println(linha);
		}

	}
}
