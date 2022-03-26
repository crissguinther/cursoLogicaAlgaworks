package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {

		Path fileName = Paths.get(System.getProperty("user.dir") + "/src/exercicio01/alunos.txt");
		List<String> getAlunos = Files.readAllLines(fileName);
		String[] alunos = new String[getAlunos.size()];

		for (int a = 0; a < getAlunos.size(); a++)
			alunos[a] = getAlunos.get(a);

		for (int i = 1; i < getAlunos.size(); i++) {
			int currentIndex = i;
			String currentAluno = alunos[currentIndex];

			// Este laço se repetirá dentro do for até que o currentIndex chegue a 0
			while (currentIndex > 0) {
				// Reduz o index a cada iteração do loop
				int previousIndex = (currentIndex - 1);
				String previousAluno = alunos[previousIndex];

				if (currentAluno.compareTo(previousAluno) < 0) {
					// Troca o aluno no index atual pelo aluno que vem antes dele
					alunos[currentIndex] = previousAluno;
					alunos[previousIndex] = currentAluno;

					// Reduz o index do loop para que ele continue iterando até chegar ao 0
					currentIndex--;
				} else
					break;
			}

			alunos[currentIndex] = currentAluno;
		}

		List<String> listAlunos = new ArrayList<String>();

		for (String aluno : alunos)
			listAlunos.add(aluno);

		Files.write(Paths.get(System.getProperty("user.dir") + "/src/exercicio01/alunos_ordenados.txt"), listAlunos);
		System.out.println("Ordenado e salvo!");

	}

}
