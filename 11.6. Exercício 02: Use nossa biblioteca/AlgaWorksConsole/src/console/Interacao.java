package console;

import java.util.Scanner;

public class Interacao {

	Scanner scanner = new Scanner(System.in);

	public Integer lerNumero(String texto) {
		print(texto);
		return scanner.nextInt();
	}

	public Double lerDecimal(String texto) {
		print(texto);
		return scanner.nextDouble();
	}

	public String lerTexto(String texto) {
		print(texto);
		return scanner.nextLine();
	}

	public void fechar() {
		scanner.close();
	}

	public void print(String texto) {
		System.out.print(texto);
	}

	public void printf(String format, Object... args) {
		System.out.printf(format, args);
	}

	public void println(String texto) {
		System.out.println(texto);
	}

	public void printTraco() {
		System.out.println("--------------------------------------------");
	}

	public void printErr(String texto) {
		System.err.println(texto);
	}

}
