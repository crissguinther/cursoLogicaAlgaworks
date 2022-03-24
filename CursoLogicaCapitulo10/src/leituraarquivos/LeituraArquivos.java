package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {

		Path arquivo = Paths.get(System.getProperty("user.dir") + "/files/exercicio01/textfiles/tasks.txt");
		try {
			List<String> linhas = Files.readAllLines(arquivo);

			for (String linha : linhas)
				System.out.println(linha);

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
