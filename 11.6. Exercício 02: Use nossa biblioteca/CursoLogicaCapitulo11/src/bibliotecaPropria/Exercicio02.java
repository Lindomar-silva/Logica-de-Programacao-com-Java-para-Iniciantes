package bibliotecaPropria;

import console.Interacao;

public class Exercicio02 {

	// 11.6. Exercício 02: Use nossa biblioteca
	public static void main(String[] args) {

		Interacao interacao = new Interacao();

		Double peso = interacao.lerDecimal("Digite seu peso: ");

		Double altura = interacao.lerDecimal("Digite sua altura: ");

		Double imc = peso / (altura * altura);

		interacao.printf("Seu IMC: %.2f%n", imc);

		if (imc < 18.5) {
			interacao.println("Peso abaixo do recomendado!");
		} else if (imc < 25) {
			interacao.println("Peso ideal!");
		} else if (imc < 30) {
			interacao.println("Levemente acima do peso!");
		} else if (imc < 35) {
			interacao.println("Obesidade grau 1!");
		} else if (imc < 40) {
			interacao.println("Obesidade gráu 2 (severa)!");
		} else if (imc > 40) {
			interacao.println("Obesidade grau 3 (mórbida)");
		}
		
		interacao.fechar();
		
	}
}
