package start.cep.client;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;
import start.cep.exceptions.ErroDeNegocioException;
import start.cep.exceptions.TabelaErros;
@Component
@Log4j2
public class EnderecoClient { 
	public static EnderecoModel consultarCep(String cep) throws ErroDeNegocioException {
		try {
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target("https://viacep.com.br/ws/" + cep + "/json/");
			Builder builder = target.request();

			Response response = builder.get();

			int status = response.getStatus();

			if (status == 200 || status == 201) {
				EnderecoModel enderecoResponseDto = response.readEntity(EnderecoModel.class);

				if (Boolean.TRUE.equals(enderecoResponseDto.getErro())) {
					throw new ErroDeNegocioException(TabelaErros.CEP_INEXISTENTE);
				}
				return enderecoResponseDto;
			}

			if (status == 400) {
				throw new ErroDeNegocioException(TabelaErros.CEP_INVALIDO);
			}

			throw new ErroDeNegocioException(TabelaErros.SISTEMA_INDISPONIVEL);

		} catch (ProcessingException e) {
			log.error("consultarCep() Erro Processing Exception: e=", e); 
			throw new ErroDeNegocioException(TabelaErros.SISTEMA_INDISPONIVEL);
//			Erro gerado ao errar a URL, por exemplo
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(consultarCep("01310-100"));
//			System.out.println(consultarCep("x"));
//			System.out.println(consultarCep("99999-100"));
		} catch (ErroDeNegocioException e) {
			throw e;
		}
	}

}
