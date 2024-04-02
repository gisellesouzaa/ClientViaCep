package start.cep.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoModel {

	public String cep;
	public String logradouro;
	public String complemento;
	public String bairro;
	public String localidade;
	public String uf;
//	public String ibge;
//	public String gia;
//	public String ddd;
//	public String siafi;
	
	public Boolean erro;
}
