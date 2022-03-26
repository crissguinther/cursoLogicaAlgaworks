
public class AlgoritmoAvancado {

	public static void main(String[] args) {

		ListaAlunos listaAlunos = new ListaAlunos();

		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		listaAlunos.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		listaAlunos.adicionar(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		listaAlunos.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Normandes";
		listaAlunos.adicionar(aluno4);

		Aluno aluno5 = new Aluno();
		aluno5.nome = "Thiago";
		listaAlunos.adicionar(aluno5);

		iterar(listaAlunos);

		System.out.println("------------------------------------------ ");

		listaAlunos.remover(aluno3);
		iterar(listaAlunos);

		System.out.println("------------------------------------------ ");

		listaAlunos.ordenar();
		iterar(listaAlunos);

	}

	static void iterar(ListaAlunos lista) {
		for (int i = 0; i < lista.tamanhoLista; i++) {
			Aluno a = lista.obter(i);
			if (a != null)
				System.out.println("Aluno: " + a.nome);
			else
				System.out.println("Aluno sem nome");
		}
	}

}
