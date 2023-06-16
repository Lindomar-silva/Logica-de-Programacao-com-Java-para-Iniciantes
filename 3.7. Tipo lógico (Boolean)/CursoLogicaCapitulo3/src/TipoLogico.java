public class TipoLogico {
	public static void main(String[] args) {
		Boolean verdadeira = true;
		System.out.println("Variável verdadeira: " + verdadeira);

		Boolean falsa = false;
		System.out.println("Variável falsa: " + falsa);

		System.out.println("------------------------------------------------");

		Integer idade = 20;
		Boolean podeTirarCarteira = idade >= 18;
//		System.out.println("Pode tirar habilitção? " + podeTirarCarteira);

		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}		
	}
}
