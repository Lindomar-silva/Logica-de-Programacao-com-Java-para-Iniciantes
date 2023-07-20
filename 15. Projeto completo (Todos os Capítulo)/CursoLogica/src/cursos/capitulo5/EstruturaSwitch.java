package cursos.capitulo5;
import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("DIGITE UM MES: ");
		Integer mes = scanner.nextInt();

		int mes1 = 0;
		Double desconto = 0.0;

		if (mes.equals(++mes1)) {
			desconto = 0.0;
		} else if (mes.equals(++mes1)) {
			desconto = 0.0;
		} else if (mes.equals(++mes1)) {
			desconto = 15.0;
		} else if (mes.equals(++mes1)) {
			desconto = 30.0;
		} else if (mes.equals(++mes1)) {
			desconto = 30.0;
		} else if (mes.equals(++mes1)) {
			desconto = 10.0;
		} else if (mes.equals(++mes1)) {
			desconto = 10.0;
		} else if (mes.equals(++mes1)) {
			desconto = 10.0;
		} else if (mes.equals(++mes1)) {
			desconto = 10.0;
		} else if (mes.equals(++mes1)) {
			desconto = 20.0;
		} else if (mes.equals(++mes1)) {
			desconto = 0.0;
		} else {
			System.err.println("DIGITE UM MÊS VÁLIDO!");
			System.exit(1);
		}

		System.out.println("\nUSANDO IF ENCADEADO...");
		System.out.printf("SEU DESCONTO DO MÊS %d, SERÁ DE %.2f\n", mes1, desconto);

		switch (mes) {
		case 1:
			desconto = 0.0;
			break;
		case 2:
			desconto = 0.0;
			break;
		case 3:
			desconto = 15.0;
			break;
		case 4:
			desconto = 30.0;
			break;
		case 5:
			desconto = 30.0;
			break;
		case 6:
			desconto = 10.0;
			break;
		case 7:
			desconto = 10.0;
			break;
		case 8:
			desconto = 10.0;
			break;
		case 9:
			desconto = 10.0;
			break;
		case 10:
			desconto = 20.0;
			break;
		case 11:
			desconto = 10.0;
			break;
		case 12:
			desconto = 0.0;
			break;
		default:
			System.err.println("DIGITE UM MÊS VÁLIDO!");
			System.exit(1);
			break;
		}

		System.out.println("----------------------------------");
		
		System.out.println("USANDO SWITCH CASE...");
		System.out.printf("SEU DESCONTO DO MÊS %d, SERÁ DE %.2f", mes, desconto);

		scanner.close();
	}

}
