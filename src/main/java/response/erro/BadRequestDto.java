package response.erro;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe DTO que mapeia o retorno de HTTP 400 - Bad Request
 *
 * @author Murilo
 */
@Getter @Setter
public class BadRequestDto {

	private String timestamp;
	private int status;
	private String error;
	private String trace;
	private String message;
	private Object[] errors;
	private String path;
	
}
