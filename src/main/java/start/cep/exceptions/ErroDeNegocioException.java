package start.cep.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ErroDeNegocioException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private final HttpStatus httpStatus;
	private final String codigoErro;
	private final String erro;
	
	public ErroDeNegocioException(TabelaErros tabela) {
		this.httpStatus = tabela.getHttpStatus();
		this.codigoErro = tabela.getCodigoErro();
		this.erro = tabela.getErro();
	}
}
