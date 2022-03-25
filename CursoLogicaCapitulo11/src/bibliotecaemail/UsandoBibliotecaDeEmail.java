package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {

		Carteiro.enviar();

		System.out.println("Enviado!");
	}

}
