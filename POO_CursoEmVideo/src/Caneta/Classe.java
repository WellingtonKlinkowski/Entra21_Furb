package Caneta;

public class Classe {

	// Classe Caneta
	String modelo, cor;
	Double ponta;
	int tinta;
	boolean tampada;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPonta() {
		return ponta;
	}

	public void setPonta(Double ponta) {
		this.ponta = ponta;
	}

	public int getTinta() {
		return tinta;
	}

	public void setTinta(int tinta) {
		this.tinta = tinta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = true;
		this.tampada = tampada;
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Retire a tampa antes");
		} else {
			String estado = "Rabiscando!";
			System.out.println(estado);
		}
	}

	public void escrevendo() {
		if (this.tampada == true) {
			System.out.println("Retire a tampa antes");
		} else {
			String estado = "Escrevendo";
			System.out.println(estado);
		}

	}

	public void pintando() {
		if (this.tampada == true) {
			System.out.println("Retire a tampa antes");
		} else {
			String estado = "Pintando";
			System.out.println(estado);
		}
	}

	public void tampar() {
		if (this.tampada == false) {
			this.tampada = true;
			System.out.println(this.tampada);
		}
		else {
			System.out.println("Já está tampada!");
		}
	}

	public void destampar() {
		if (this.tampada == true) {
			this.tampada = false;
			System.out.println(this.tampada);
		}
		else {
			System.out.println("Já está destampada!");
		}
	}

}
