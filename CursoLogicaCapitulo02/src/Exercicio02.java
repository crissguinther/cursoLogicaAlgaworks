import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double peso;
		double altura;
		double IMC;

		System.out.print("Olá! Bem vindo! Digite seu peso atual: ");
		peso = sc.nextDouble();
		;
		sc.nextLine();

		System.out.print("Digite, agora, a sua altura em metros: ");
		altura = sc.nextDouble();
		sc.nextLine();

		IMC = peso / (altura * altura);

		if (IMC < 18.5) {
			System.out.printf("Muito bem! Seu IMC é de %.2f. ", IMC);
			System.out.println("Você está abaixo do peso!");
		} else if (IMC > 18.5 && IMC < 24.9) {
			System.out.printf("Muito bem! Seu IMC é de %.2f. ", IMC);
			System.out.println("Você está com um peso saudável!");
		} else if (IMC > 25 && IMC < 29.9) {
			System.out.printf("Muito bem! Seu IMC é de %.2f. ", IMC);
			System.out.println("Você está em sobrepeso!É melhor ter cuidado");
		} else if (IMC > 30 && IMC < 39.9) {
			System.out.printf("Muito bem! Seu IMC é de %.2f. ", IMC);
			System.out.println("Você está obeso!Precisa de cuidar melhor!");
		} else {
			System.out.printf("Muito bem! Seu IMC é de %.2f. ", IMC);
			System.out.println("Você está muito obeso!Precisa se cuidar muito bem!");
		}

		System.out.println("");

		System.out.print("Obrigado(a) por usar nosso aplicativo!");

		sc.close();
		
	}

}
