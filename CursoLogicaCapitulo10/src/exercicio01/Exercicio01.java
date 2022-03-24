package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {

		ArrayList<String> linhas = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		Path folder = Paths.get(System.getProperty("user.dir") + "/files/exercicio01/textfiles");		
		Path fileName = Paths.get(folder + "/tasks.txt");

		try {
			// Checa se o diretório existe e cria ele, caso contrário
			if (Files.notExists(folder)) {

				try {
					Files.createDirectories(folder);
					System.out.println("Diretório criado!");
				} catch (IOException e) {
					sc.close();
					System.out.println("Não foi possível criar o diretório! Abortando... ");
					throw new RuntimeException(e);
				}

			} else
				System.out.println("Diretório encontrado! Iniciando...");

			while (true) {
				System.out.print("Digite a tarefa a ser adicionada: ");

				String tarefa = sc.nextLine();

				if ("x".equals(tarefa)) {
					break;
				} else {
					linhas.add(tarefa);
					Files.write(fileName, linhas);
				}

			}
		} catch (IOException e) {
			System.out.println("Houve um erro ao tentar salvar seus arquivos!");
		}

		sc.close();
		System.out.println("Finalizado!");

	}

}
