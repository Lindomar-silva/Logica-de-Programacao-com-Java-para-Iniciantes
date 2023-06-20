package exercicio02;

import java.io.IOException;

import uitl.ToFiles;

public class LerListaDeTarfas {

	public static void main(String[] args) throws IOException {

		System.out.println("LISTA DE TAREFAS DO DIA");
		imprimeTraco();

		ToFiles.lendoArquivo("src/lista-de-tarefas.txt")
			.forEach(tarefa -> System.out.println(tarefa));

		imprimeTraco();
	}

	static void imprimeTraco() {
		System.out.println("--------------------------");
	}
}
