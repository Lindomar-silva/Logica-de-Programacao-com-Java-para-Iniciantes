package cursos.capitulo9.exercicio03;

public class Pedido {

	private Integer codigo;
	private Double subtotal;
	private Double desconto;
//	private Double total;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return subtotal - desconto;
	}

	public void setTotal(Double total) {
//		this.total = total;
	}

}
