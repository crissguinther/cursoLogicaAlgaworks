
public class IteracaoFor {

	public static void main(String[] args) {

//		Double[] carrinhoDeCompras = new Double[]{
//				50.0,
//				51.0,
//				52.0
//				};
//		
//		Double total = 0.0;
//		for(int i = 0; i < carrinhoDeCompras.length; i++) {
//			total += carrinhoDeCompras[i];
//		}
//		
//		System.out.println(total);

//		for(int i = 0; i < 10; i++) {
//			if(i == 5) break;
//			System.out.println("Itera??o");
//		}

//		for (int i = 0; i < 10; i++) {
//			if (i == 5) {
//				System.out.println("Vai continuar");
//				continue;
//			}
//			System.out.println(i + ": Itera??o");
//		}

		Integer[] produtos = new Integer[] { 100, 225, 300 };

		for (int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			if (produto.equals(225)) {
				System.out.println("Produto encontrado! C?digo: " + produto);
				break;
			}
			System.out.println("Produto de c?digo " + produto);
		}

	}

}
