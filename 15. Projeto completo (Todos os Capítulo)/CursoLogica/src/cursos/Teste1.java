package cursos;

public class Teste1 {
	public static void main(String[] args) {
//		imprimirNumero(0);
		String[] alunos = new String[] { "Alexandre", "Paula", "Gustavo", "Roberto" };

		interarNomes(alunos, 0);
	}

	private static void interarNomes(String[] alunos, Integer i) {
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println("Aluno: " + alunos[i]);
//		}
		System.out.println("Aluno: " + alunos[i]);

		if (i < alunos.length - 1)
			interarNomes(alunos, ++i);
	}

//	private static void imprimirNumero(Integer numero) {
//		System.out.println("Número: " + numero);
//
//		if (numero < 10)
//			imprimirNumero(++numero);
//	}
}
