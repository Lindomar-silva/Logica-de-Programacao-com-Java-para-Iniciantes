package Exrcicio01;

import java.io.IOException;
import java.util.List;

import uitl.ToFiles;

public class OrdenarListaArquivo {

	public static void main(String[] args) throws IOException {

		List<String> nomes = ToFiles.lendoArquivo("arquivos/lista-desordenada.txt");

		ListaAlunos listaAlunos = new ListaAlunos();

		nomes.forEach(nome -> {
			Aluno aluno = new Aluno();
			aluno.nome = nome;
			listaAlunos.adicionar(aluno);
			System.out.println(aluno.nome);
		});

		System.out.println("------------------------------");
		listaAlunos.ordenar();

		String listaOrdenada = "";

		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			listaOrdenada += (a.nome + "\n");
			System.out.println(a.nome);
		}

		ToFiles.salvandoArquivo("arquivos/lista-ordenada.txt", listaOrdenada);
	}

}
