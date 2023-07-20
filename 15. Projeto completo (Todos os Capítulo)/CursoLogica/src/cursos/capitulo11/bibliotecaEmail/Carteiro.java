package cursos.capitulo11.bibliotecaEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	// DICA PARA ENVIAR USANDO A CONTA DO GMAIL
	// https://app.algaworks.com/forum/topicos/88055/codigo-para-o-gmail-funciona-tambem
	// https://support.google.com/mail/answer/185833?hl
	public static void enviarEmail(String para, String assunto, String corpoMsg) throws EmailException {

		Email email = new SimpleEmail();
		emailConfig(email);

		email.addTo(para);
		email.setSubject(assunto);
		email.setMsg(corpoMsg);

		System.out.println("Enviando e-mail, aguarde...");
		email.send();

		System.out.println("E-mail enviado com sucesso para '" + para + "'");
	}

	private static void emailConfig(Email email) throws EmailException {

		String emailAuthenticator = "carteirosemail@gmail.com";
		String emailPassword = "zpqfzleogbwbjhtv";
		String emailFrom = emailAuthenticator;

		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator(emailAuthenticator, emailPassword));
		email.setSSLOnConnect(true);
		email.setFrom(emailFrom, "Carteiro");
	}
}
