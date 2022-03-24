package encapsulamento;

public class Pedido {

	private int codigo;
	private double subtotal;
	private int desconto;
	
	public Pedido() {
	}

	public Pedido(int codigo, double subtotal, int desconto, double total) {
		this.codigo = codigo;
		this.subtotal = subtotal;
		this.desconto = desconto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public double getTotal() {
		double valorDesconto = this.subtotal - ((subtotal / 100) * this.desconto);

		return valorDesconto;

	}

}
