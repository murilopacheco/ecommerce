package enums.rest;

import lombok.Getter;

/**
 * Enum utilizado para guardar os status de resposta HTTP
 * 
 * @author Lucas P. Soares (lucas.soares@supera.com.br)
 */
@Getter
public enum HttpStatus {

	OK(200, "Ok"), CREATED(201, "Created"), NO_CONTENT(204, "No Content"), BAD_REQUEST(400, "Bad Request"),
	UNAUTHORIZED(401, "Unauthorized"), FORBIDDEN(403, "Forbidden"), NOT_FOUND(404, "Not Found"),
	INTERNAL_SERVER_ERROR(500, "Internal Server Error"), NOT_IMPLEMENTED(501, "Not Implemented");
	
	private int codeStatus;
	private String message;
	
	private HttpStatus(int codeStatus, String message) {
		this.codeStatus = codeStatus;
		this.message = message;
	}
	
}
