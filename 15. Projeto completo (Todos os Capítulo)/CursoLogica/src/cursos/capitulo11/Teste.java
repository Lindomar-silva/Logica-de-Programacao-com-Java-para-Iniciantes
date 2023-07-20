package cursos.capitulo11;

import org.apache.commons.mail.EmailException;

import cursos.capitulo11.bibliotecaEmail.Carteiro;

public class Teste {
	public static void main(String[] args) throws EmailException {

		String para = "frisurado@gmail.com";
		String Assunto = "Aula sobre uso de bibliotecas de terceiros";
		String corpoEmail = "Aula sobre uso de bibliotecas de terceiros";

		Carteiro.enviarEmail(para, Assunto, corpoEmail);
	}
}
