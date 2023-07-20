package cursos.capitulo6;
public class InteracaoWhile {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			System.out.println("Um texto qualqer");
//		}

//		int i = 0;
//		while (i < 10) {
//			System.out.println("Um texto qualqer");
//			i++;
//		}

		int i = 0;
		while (i < 10) {
			i++;
			if (i == 5) {
				System.out.println("Vai parar...");
				continue;
			}

			System.out.println(i + ": Um texto qualqer");
		}
	}

}
