package cursos.capitulo12.uitl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ToFiles {

	public static void salvandoArquivo(String arquivo, List<String> atividades) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, atividades);
	}

	public static List<String> lendoArquivo(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
	}

	public static void salvandoArquivo(String arquivo, String atividade) throws IOException {
		salvandoArquivo(arquivo, Arrays.asList(atividade));
	}
}
