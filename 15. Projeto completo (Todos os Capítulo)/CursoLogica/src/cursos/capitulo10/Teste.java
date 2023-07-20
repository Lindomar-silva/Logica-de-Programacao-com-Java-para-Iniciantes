package cursos.capitulo10;

import java.io.IOException;

import cursos.capitulo10.uitl.ToFiles;

public class Teste {

	public static void main(String[] args) throws IOException {
		System.out.println("LISTA DE TAREFAS DO DIA");
		imprimeTraco();

		String arquivo = "src/cursos/capitulo10/lista-de-tarefas.txt";
		
		ToFiles.lendoArquivo(arquivo)
			.forEach(tarefa -> System.out.println(tarefa));

		imprimeTraco();
	}

	static void imprimeTraco() {
		System.out.println("--------------------------");
	}

}
