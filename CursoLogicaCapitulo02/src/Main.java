import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");

		double valorProduto = sc.nextDouble();
		sc.nextLine();

		System.out.print("Digite o valor recebido: ");

		double valorRecebido = sc.nextDouble();
		sc.nextLine();

		double troco = valorProduto - valorRecebido;

		System.out.printf("O troco deve ser de: %.2f", troco);
		sc.close();

	}

}
