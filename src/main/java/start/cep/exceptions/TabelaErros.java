package start.cep.exceptions;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TabelaErros {
	
	CEP_INVALIDO(HttpStatus.BAD_REQUEST, "400A", "Dados da requisição incorretos"),
	CEP_INEXISTENTE(HttpStatus.NOT_FOUND, "404A", "CEP inexistente"),
	SISTEMA_INDISPONIVEL(HttpStatus.INTERNAL_SERVER_ERROR, "500A", "Sistema indisponível");

	private final HttpStatus httpStatus;
	private final String codigoErro;
	private final String erro;

}
