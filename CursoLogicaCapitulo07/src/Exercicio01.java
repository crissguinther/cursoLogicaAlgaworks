import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		String[] tarefasDia = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int numeroTarefa = 0; numeroTarefa < tarefasDia.length; numeroTarefa++) {
			String tarefa = null;

			System.out.print("Digite sua " + (numeroTarefa + 1) + "ª mais importante: ");
			tarefa = sc.nextLine();

			tarefasDia[numeroTarefa] = tarefa;
		}

		sc.close();

		System.out.println();
		System.out.println("Suas tarefas do dia são: ");
		for (String tarefa : tarefasDia) {
			System.out.println(tarefa);
		}
	}

}
