
public class DivisiveisPorTresWhile {

	public static void main(String[] args) {

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int counter = 0;
		while (counter < numeros.length) {
			Integer currentNumber = numeros[counter];
			
			if (!(currentNumber % 3 == 0)) {
				counter++;
				continue;
			}

			System.out.println("O número " + currentNumber + " é divisível por 3!");
			counter++;
		}

	}

}
