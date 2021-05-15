package response;

import enums.rest.HttpStatus;
import lombok.Getter;
import lombok.Setter;

import util.ApplicationHelper;

import java.io.Serializable;

/**
 * Classe Modelo DTO para retorno padrao das chamadas na API REST
 * 
 * @author Murilo
 */
@Getter @Setter
public class ResponseModel implements Serializable {

	private static final long serialVersionUID = -8456407316033165940L;

	private HttpStatus status;
	private String detailMessage;
	private String stackTrace;
	private Object responseBody;
	
	/**
	 * @param responseBody {@link Object}
	 */
	private ResponseModel(Object responseBody) {
		this.responseBody = responseBody;
	}
	
	/**
	 * @param status {@link HttpStatus}
	 * @param responseBody {@link Object}
	 */
	private ResponseModel(HttpStatus status, Object responseBody) {
		this.status = status;
		this.responseBody = responseBody;
	}
	
	/**
	 * @param status {@link HttpStatus}
	 * @param stackTrace {@link String}
	 */
	private ResponseModel(HttpStatus status, String stackTrace) {
		this.status = status;
		this.stackTrace = stackTrace;
	}
	
	/**
	 * @param status {@link HttpStatus}
	 * @param detailMessage {@link String}
	 * @param stackTrace {@link String}
	 */
	private ResponseModel(HttpStatus status, String detailMessage, String stackTrace) {
		this.status = status;
		this.detailMessage = detailMessage;
		this.stackTrace = stackTrace;
	}



	/**
	 * @param status {@link HttpStatus}
	 * @param detailMessage {@link String}
	 * @param stackTrace {@link String}
	 */
	private ResponseModel(HttpStatus status, String detailMessage, String stackTrace, Object responseBody) {
		this.status = status;
		this.detailMessage = detailMessage;
		this.stackTrace = stackTrace;
		this.responseBody = responseBody;
	}

	
	/**
	 * Retorna uma resposta de sucesso 200 Ok
	 * 
	 * @author Lucas P. Soares (lucas.soares@supera.com.br)
	 * @param body {@link Object}
	 * @return {@link ResponseModel}
	 */
	public static ResponseModel hasSuccess(Object body) {
		return new ResponseModel(HttpStatus.OK, body);
	}
	
	/**
	 * Retorna uma resposta de sucesso sem conteudo 204 No Content
	 * 
	 * @author Lucas P. Soares (lucas.soares@supera.com.br)
	 * @param body {@link Object}
	 * @return {@link ResponseModel}
	 */
	public static ResponseModel hasNoContent() {
		return new ResponseModel(HttpStatus.NO_CONTENT);
	}
	
	/**
	 * Retorna uma resposta de sucesso sem conteudo 500 Internal Server Error
	 * 
	 * @author Lucas P. Soares (lucas.soares@supera.com.br)
	 * @param body {@link Object}
	 * @return {@link ResponseModel}
	 */
	public static ResponseModel hasError(Throwable err) {
		return new ResponseModel(
			HttpStatus.INTERNAL_SERVER_ERROR,
			err.getMessage(),
			ApplicationHelper.extractStackTrace(err)
		);
	}
	
	/**
	 * Retorna uma resposta de erro com conteudo 500 Internal Server Error
	 * 
	 * @param body {@link Object}
	 * @return {@link ResponseModel}
	 */
	public static ResponseModel hasError(String mensagemDetail, String stackTrace, Object responseBody) {
		return new ResponseModel(
			HttpStatus.INTERNAL_SERVER_ERROR,
			mensagemDetail,
			stackTrace,
			responseBody
		);
	}
	
	/**
	 * Retorna uma resposta de NOT_FOUND com conteudo 500 Internal Server Error
	 * 
	 * @param body {@link Object}
	 * @return {@link ResponseModel}
	 */
	public static ResponseModel hasNotFound(String mensagemDetail, String stackTrace, Object responseBody) {
		return new ResponseModel(
			HttpStatus.INTERNAL_SERVER_ERROR,
			mensagemDetail,
			stackTrace,
			responseBody
		);
	}
	
}
