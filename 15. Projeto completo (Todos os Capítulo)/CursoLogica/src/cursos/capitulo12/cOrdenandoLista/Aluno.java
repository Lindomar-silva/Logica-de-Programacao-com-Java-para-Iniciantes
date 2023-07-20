package cursos.capitulo12.cOrdenandoLista;

public class Aluno {

	String nome;

	boolean vemDepoisDe(Aluno aluno) {

		if (aluno == null) {
			return false;
		}

		return this.nome.compareTo(aluno.nome) > 0;
	}
}
