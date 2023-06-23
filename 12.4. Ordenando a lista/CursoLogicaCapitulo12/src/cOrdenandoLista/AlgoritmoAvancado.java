package cOrdenandoLista;

public class AlgoritmoAvancado {

	public static void main(String[] args) {

		ListaAlunos alunos = new ListaAlunos();

		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		alunos.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Bruno";
		alunos.adicionar(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		alunos.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Daniela";
		alunos.adicionar(aluno4);

		Aluno aluno5 = new Aluno();
		aluno5.nome = "Thiago";
		alunos.adicionar(aluno5);

		iterar(alunos, "LISTAGEM");

		alunos.ordenar();
		iterar(alunos, "ORDENAÇÃO");

		alunos.remover(aluno2);
		alunos.remover(aluno4);
		iterar(alunos, "EXCLUSÃO");
	}

	static void iterar(ListaAlunos alunos, String textoEntreTraco) {

		System.out.println("---------- " + textoEntreTraco + " ----------");

		for (int i = 0; i < alunos.tamanho(); i++) {
			Aluno a = alunos.obter(i);

			if (a != null) {
				System.out.println("Aluno: " + a.nome);

			} else {
				System.out.println("Null Null Null");
			}
		}

	}
}
