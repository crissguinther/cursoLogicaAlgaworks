package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {

		Produto prod = new Produto();
		prod.setNome("Smartphone");
		;
		prod.setPrecoUnitario(500.00);
		prod.setQuantidade(15);

		exibirQuantidadeEmEstoque(prod);

	}

	static void exibirQuantidadeEmEstoque(Produto prod) {
		System.out.println("Quantidade em estoque do produto: " + prod.getNome() + " � de " + prod.getQuantidade()
				+ " com o valor unit�rio de " + prod.getPrecoUnitario());
	}

}
