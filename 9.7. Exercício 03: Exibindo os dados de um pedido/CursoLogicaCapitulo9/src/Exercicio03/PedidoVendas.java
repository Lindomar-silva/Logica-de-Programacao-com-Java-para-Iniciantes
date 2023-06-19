package Exercicio03;

public class PedidoVendas {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setCodigo(1);
		pedido.setSubtotal(155.0);
		pedido.setDesconto(55.0);
//		pedido.setTotal(new Double(101.0));

		System.out.printf("Código: %d SubTotal: %.02f Desconto: %.02f Total: %.02f", 
				pedido.getCodigo(),	pedido.getSubtotal(), pedido.getDesconto(), pedido.getTotal());
	}

}
