package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Alexandre", "Afonso", "176890864", "alexandre@algaworks.com");

		System.out.println(cliente.getNomeCompleto());
		System.out.println(cliente.obterDDD());

	}

}
