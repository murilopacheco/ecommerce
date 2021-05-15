package exception;

import lombok.Getter;

/**
 * Classe que trata exceptions nas chamadas a API
 * 
 * @author Lucas P. Soares (lucas.soares@supera.com.br)
 */
@Getter
public class RoleBusinessException extends RuntimeException {

	private static final long serialVersionUID = -3670336573367480105L;
	
	public RoleBusinessException(String message) {
		super(message);
	}
	
	public RoleBusinessException(Throwable cause) {
		super(cause);
	}
	
}
