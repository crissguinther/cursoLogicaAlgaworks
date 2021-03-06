import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();

		imprimirTabuada(number, 0, 10);
		
		sc.close();

	}

	static void imprimirTabuada(Integer number, Integer counter, Integer times) {
		if (times == null)
			times = 10;

		if (counter == 0) {
			System.out.println(number + " x " + counter + " = " + 0);
			++counter;
			imprimirTabuada(number, counter, times);

		} else if (counter <= times) {

			System.out.println(number + " x " + counter + " = " + (number * counter));
			++counter;
			imprimirTabuada(number, counter, times);

		}
	}
}
