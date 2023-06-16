import java.util.Scanner;

public class Exercicio03 {

	// Imprima o nome do dia da semana (domingo, segunda-feira, etc.)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE UM DIA DA SEMANA [DE 1 ATÉ 7]: ");
		Integer dia = scanner.nextInt();

		String diaEscolhido = "";

		switch (dia) {
		case 1:
			diaEscolhido = "DOMINGO";
			break;
		case 2:
			diaEscolhido = "SEGUNDA-FEIRA";
			break;
		case 3:
			diaEscolhido = "TERÇA-FEIRA";
			break;
		case 4:
			diaEscolhido = "QUARTA-FEIRA";
			break;
		case 5:
			diaEscolhido = "QUINTA-FEIRA";
			break;
		case 6:
			diaEscolhido = "SEXTA-FEIRA";
			break;
		case 7:
			diaEscolhido = "SÁBADO";
			break;
		default:
			System.err.println("DIA DA SEMANA INVÁLIDO!");
			System.exit(1);
			break;
		}

		System.out.println("----------------------------------------");
		System.out.println("DIA ESCOLHIDO DA SEMANA: " + diaEscolhido);
		
		scanner.close();
	}
}
