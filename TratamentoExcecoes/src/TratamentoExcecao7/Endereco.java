package TratamentoExcecao7;

import javax.naming.LimitExceededException;

public class Endereco {

	String uf;
	String cidade;
	int numbHouse;
	String rua;
	String cep;
	
	public Endereco(String uf, String cidade, int numbHouse, String rua, String cep) {
		super();
		this.uf = uf;
		this.cidade = cidade;
		this.numbHouse = numbHouse;
		this.rua = rua;
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) throws Exception {
		if(uf.length() > 2) {
			throw new LimitExceededException("UF é apenas as duas primeiras letras do seu estado.");
		}
		else if(uf.length() < 2) {
			throw new LimitExceededException("UF é as duas primeiras letras do seu estado. Só a primeira não funciona.");
		}
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumbHouse() {
		return numbHouse;
	}
	public void setNumbHouse(int numbHouse) {
		this.numbHouse = numbHouse;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) throws Exception {
		if(cep.length() != 8) {
			throw new LimitExceededException("Obrigatóriamente somente 8 números.");
		}
	}
	
	
}
