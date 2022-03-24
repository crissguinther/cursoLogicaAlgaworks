package exercicio02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {

	public static void main(String[] args) {

		Path fileName = Paths.get(System.getProperty("user.dir") + "/files/exercicio01/textfiles/tasks.txt");

		try {

			List<String> tasks = Files.readAllLines(fileName);

			if (tasks.size() > 0) {
				for (String task : tasks) {
					System.out.println(task);
				}

			} else {
				System.out.println("Não foram adicinadas tarefas!");
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
