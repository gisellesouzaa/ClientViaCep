package start.cep.client;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
public class CepClient {

	public static CepModel consultarCep(String cep) throws IOException {
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("https://viacep.com.br/ws/" + cep + "/json/");
		Builder builder = target.request();
		
		Response response = builder.get();
		
		int status = response.getStatus();
		
		if(status == 200 || status == 201) {
			CepModel entity = response.readEntity(CepModel.class);
			
			return entity;
		}
		throw new RuntimeException("Status " + status);
	}
	
	public static void main(String[] args){
		try {
			System.out.println(consultarCep("08575220"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
