package cursos.capitulo12.bRemovendoElementoDaLista;

public class AlgoritmoAvancado {

	public static void main(String[] args) {

		ListaAlunos alunos = new ListaAlunos();

		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		alunos.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		alunos.adicionar(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		alunos.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Normandes";
		alunos.adicionar(null);

		Aluno aluno5 = new Aluno();
		aluno5.nome = "Thiago";
		alunos.adicionar(aluno5);

		for (int i = 0; i < alunos.tamanho(); i++) {
			Aluno a = alunos.obter(i);

			if (a != null) {
				System.out.println("Aluno: " + a.nome);

			} else {
				System.out.println("Null Null Null");
			}
		}

		System.out.println("-------------------------------------");

		alunos.remover(aluno2);
		alunos.remover(aluno4);

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
