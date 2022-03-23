package exercicio01;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		ArrayList<String> linhas = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		String folder = "./src/exercicio01/textfiles/";
		String fileName = folder + "/tasks.txta";

		Path folderPath = Paths.get(folder);

		try {
			// Checa se o diretório existe e cria ele, caso contrário
			if (!Files.isDirectory(folderPath)) {
				File f = new File(folder);
				f.mkdir();
				System.out.println("Diretorio criado!");
			}

			while (true) {
				System.out.print("Digite a tarefa a ser adicionada: ");

				String tarefa = sc.nextLine();

				if ("x".equals(tarefa)) {
					break;
				} else {
					linhas.add(tarefa);
					Files.write(Paths.get(fileName), linhas);
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Houve um erro ao tentar salvar seus arquivos!");
		}

		sc.close();
		System.out.println("Finalizado!");

	}

}
