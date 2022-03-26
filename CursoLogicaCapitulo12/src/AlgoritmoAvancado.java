
public class AlgoritmoAvancado {

	public static void main(String[] args) {

		ListaAlunos lista = new ListaAlunos();

		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		lista.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		lista.adicionar(null);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		lista.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Normandes";
		lista.adicionar(aluno4);

		Aluno aluno5 = new Aluno();
		aluno5.nome = "Thiago";
		lista.adicionar(aluno5);

//		for (int i = 0; i < lista.tamanhoLista; i++) {
//			Aluno a = lista.obter(i);
//			if (a != null)
//				System.out.println("Aluno: " + a.nome);
//			else
//				System.out.println("Aluno sem nome");
//		}

		mostrarAlunos(lista);
		
		System.out.println("------------------------------------------ ");

		lista.remover(aluno3);
		
		mostrarAlunos(lista);

//		for (int i = 0; i < lista.tamanhoLista; i++) {
//			Aluno a = lista.obter(i);
//			if (a != null)
//				System.out.println("Aluno: " + a.nome);
//			else
//				System.out.println("Aluno sem nome");
//		}

	}
	
	static void mostrarAlunos(ListaAlunos lista) {
		for (int i = 0; i < lista.tamanhoLista; i++) {
			Aluno a = lista.obter(i);
			if (a != null)
				System.out.println("Aluno: " + a.nome);
			else
				System.out.println("Aluno sem nome");
		}
	}

}
