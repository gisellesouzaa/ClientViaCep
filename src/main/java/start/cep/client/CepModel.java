package start.cep.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CepModel {

	public String cep;
	public String logradouro;
	public String complemento;
	public String bairro;
	public String localidade;
	public String uf;
	public String ibge;
	public String gia;
	public String ddd;
	public String siafi;
}
