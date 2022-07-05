package Exer4;

import java.time.LocalDate;

public class Endereco {

	private String rua;
	private String numero;
	private String cep;
	
	public Endereco(String rua, String numero, String cep) {
		super();
		setRua(rua);
		setNumero(numero);
		setCep(cep);
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
