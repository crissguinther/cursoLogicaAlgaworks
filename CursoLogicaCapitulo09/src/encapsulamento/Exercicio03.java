package encapsulamento;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.setCodigo(103980);
		pedido.setSubtotal(100);
		pedido.setDesconto(25);
		
		System.out.println(pedido.getTotal());

	}

}
