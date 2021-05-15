package util;

/**
 * Interface para executar acoes nas chamadas API REST
 * 
 * @author Lucas P. Soares (lucas.soares@supera.com.br)
 */
@FunctionalInterface
public interface ExecuteAction {

	/**
	 * Deve executar uma acao e retorna o resultado
	 * 
	 * @author Murilo
	 * @return {@link Object}
	 */
	Object execute();
	
}
