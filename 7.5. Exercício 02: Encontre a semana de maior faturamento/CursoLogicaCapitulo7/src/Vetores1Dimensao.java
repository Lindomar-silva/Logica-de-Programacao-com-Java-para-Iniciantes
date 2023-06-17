public class Vetores1Dimensao {

	public static void main(String[] args) {
//		String[] cardapio = new String[] { "Calabreza", "Atum", "Queijo", "Presunto" };

//		System.out.print("ESCOLHA UM SABOR\n");
//
//		for (int i = 0; i < cardapio.length; i++) {
//			System.out.println("[" + i + "]: " + cardapio[i]);
//		}
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("DIGITE UM NÚMERO REFERENTE AO SABOR: ");
//		Integer saborEscolhido = scanner.nextInt();
//
//		System.out.println("VOCÊ ESCOLHEU O SABOR: " + cardapio[saborEscolhido]);
//		
//		scanner.close();

//		String[] cardapio = new String[] { "Calabreza", "Atum", "Queijo", "Presunto" };
//		cardapio[3] = "Frango";
//
//		for (int i = 0; i < cardapio.length; i++) {
//			System.out.println("[" + i + "]: " + cardapio[i]);
//		}

		String[] cardapio = new String[4];

		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "Presunto";

		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "]: " + cardapio[i]);
		}

	}

}
