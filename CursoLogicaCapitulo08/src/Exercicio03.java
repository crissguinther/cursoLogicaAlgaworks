import java.util.Scanner;

public class Exercicio03 {

	public static class Calculator {

		private Double value1;
		private Double value2;

		public Calculator(double val1, double val2) {
			this.value1 = val1;
			this.value2 = val2;
		}

		protected Double add() {
			return (value1 + value2);
		};

		protected Double subtract() {
			return (value1 - value2);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual opera??o voc? deseja realizar?");
		System.out.println("1- Adi??o");
		System.out.println("2- Subtra??o");

		Integer operation = sc.nextInt();
		sc.nextLine();

		Boolean isCalculating = true;

		while (isCalculating == true) {
			System.out.println("Digite os dois numeros para serem utilizados na opera??o: ");

			Double firstValue = sc.nextDouble();
			Double secondValue = sc.nextDouble();

			Calculator calc = new Calculator(firstValue, secondValue);

			switch (operation) {

			case 1:
				System.out.println("O resultado da soma ?: " + calc.add());
				isCalculating = false;
				break;

			case 2:
				System.out.println("O resultado da subtra??o ?: " + calc.subtract());
				isCalculating = false;
				break;

			default:
				System.out.println("Selecione uma opera??o v?lida!");
				System.out.println();
				break;
			}

		}

		sc.close();
	}

}
