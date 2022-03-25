package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de tarefas: ");
		Integer quantidadeTarefas = sc.nextInt();
		sc.nextLine();

		List<String> listaDeTarefas = new ArrayList<String>();

		for (int i = 0; i < quantidadeTarefas; i++) {
			System.out.print("Digite a tarefa de número " + (i + 1) + ": ");
			listaDeTarefas.add("\n" + sc.nextLine());
		}

		System.out.print("Insira seu email: ");
		String email = sc.nextLine();

		String msg = "";

		for (String tarefa : listaDeTarefas) {
			msg += tarefa;
		}

		System.out.println("Suas tarefas:" + msg);

//		Carteiro.enviar();

		sc.close();

	}

}
