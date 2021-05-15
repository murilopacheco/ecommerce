package util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Classe Utilitaria para aa aplicacao
 * 
 * @author Lucas P. Soares (lucas.soares@supera.com.br)
 */
public class ApplicationHelper {

	/**
	 * Extrai o stack trace de uma exception
	 * 
	 * @author Lucas P. Soares (lucas.soares@supera.com.br)
	 * @param err {@link Throwable}
	 * @return {@link String}
	 */
	public static String extractStackTrace(Throwable err) {
		String message = null;
		if(err != null) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			err.printStackTrace(pw);
			message = sw.toString();
		}
		return message;
	}
	
}
