package primeiraclasse;

public class Exercicio01 {

	public static void main(String[] args) {

		Produto prod1 = new Produto();
		prod1.setNome("TV");
		prod1.setPrecoUnitario(750.00);
		prod1.setQuantidade(15);

		System.out.println("Precisa repor " + prod1.getNome() + "? " + prod1.estaEmFalta());

		Produto prod2 = new Produto();
		prod2.setNome("Computador");
		prod2.setPrecoUnitario(1250.00);
		prod2.setQuantidade(4);

		System.out.println("Precisa repor " + prod2.getNome() + "? " + prod2.estaEmFalta());
	}

}
