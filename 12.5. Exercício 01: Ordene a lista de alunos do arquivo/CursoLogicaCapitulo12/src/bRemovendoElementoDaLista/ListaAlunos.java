package bRemovendoElementoDaLista;

public class ListaAlunos {

	static final int QUATIDADE_LISTA = 5;

	Aluno[] listaAlunos = new Aluno[QUATIDADE_LISTA];

	int tamanhoLista = 0;

	Aluno obter(int indice) {
		return listaAlunos[indice];
	}

	int tamanho() {
		return tamanhoLista;
	}

	void adicionar(Aluno aluno) {
		if (tamanhoLista == listaAlunos.length) {
			Aluno[] novaLista = new Aluno[QUATIDADE_LISTA + listaAlunos.length];

			for (int i = 0; i < listaAlunos.length; i++) {
				novaLista[i] = listaAlunos[i];
			}

			listaAlunos = novaLista;
		}

		listaAlunos[tamanhoLista] = aluno;
		tamanhoLista++;
	}

	void remover(Aluno aluno) {
		for (int i = 0; i < tamanhoLista; i++) {
			Aluno a = listaAlunos[i];

			if (a != null && a.equals(aluno)) {
				remover(i);
				break;

			} else if (a == null || aluno == null) {
				remover(i);
				break;
			}
		}
	}

	void remover(int indice) {
		int indiceInicial = indice + 1;

		for (int i = indiceInicial; i < tamanhoLista; i++) {
			listaAlunos[i - 1] = listaAlunos[i];
		}

		tamanhoLista--;
		listaAlunos[tamanhoLista] = null;
	}
}
