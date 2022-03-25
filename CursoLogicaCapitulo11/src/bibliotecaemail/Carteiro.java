package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	public static void enviar(String para, String assunto, String msg, String username, String password,
			String fromEmail) throws EmailException {

		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(username, password));
		email.setSSLOnConnect(true);
		email.setFrom(fromEmail);
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.send();

	}

}
