package bibliotecaEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	// DICA PARA ENVIAR USANDO A CONTA DO GMAIL
	// https://app.algaworks.com/forum/topicos/88055/codigo-para-o-gmail-funciona-tambem
	// https://support.google.com/mail/answer/185833?hl
	public static void enviar(String para, String assunto, String corpoEmail) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("carteirosemail@gmail.com", "zpqfzleogbwbjhtv"));
		email.setSSLOnConnect(true);
		email.setFrom("carteirosemail@gmail.com");
		email.setSubject(assunto);
		email.setMsg(corpoEmail);
		email.addTo(para);
		email.send();

		System.out.println("E-mail enviado com sucesso!");
	}
}
