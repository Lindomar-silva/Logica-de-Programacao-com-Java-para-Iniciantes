
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
}
