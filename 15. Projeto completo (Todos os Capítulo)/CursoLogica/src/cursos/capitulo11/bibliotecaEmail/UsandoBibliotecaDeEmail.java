package cursos.capitulo11.bibliotecaEmail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {

		String Assunto = "Aula sobre uso de bibliotecas de terceiros";
		String corpoEmail = "Aula sobre uso de bibliotecas de terceiros";
		String para = "frisurado@gmail.com";

		Carteiro.enviarEmail(para, Assunto, corpoEmail);
	}
}
