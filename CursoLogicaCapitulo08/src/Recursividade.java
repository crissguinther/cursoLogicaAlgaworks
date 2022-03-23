
public class Recursividade {

	public static void main(String[] args) {

		String[] alunos = new String[] { "Alexandre", "Jo�o", "Maria" };

		iterarNomes(alunos, 0);
	}

	static void iterarNomes(String[] alunos, Integer i) {
		System.out.println("Aluno: " + alunos[i]);

		if (i < (alunos.length - 1)) {
			iterarNomes(alunos, ++i);
		}
	}

}
