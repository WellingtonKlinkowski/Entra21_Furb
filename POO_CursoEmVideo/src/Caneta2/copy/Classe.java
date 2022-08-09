package Caneta2.copy;

public class Classe {

	// Classe Caneta
	public String modelo;
	public String cor;
	private Double ponta;
	protected int tinta;
	protected boolean tampada;

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

	private Double getPonta() {
		return ponta;
	}

	private void setPonta(Double ponta) {
		this.ponta = ponta;
	}

	protected int getTinta() {
		return tinta;
	}

	protected void setTinta(int tinta) {
		this.tinta = tinta;
	}

	protected boolean isTampada() {
		return tampada;
	}

	protected void setTampada(boolean tampada) {
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

	protected void tampar() {
		if (this.tampada == false) {
			this.tampada = true;
			System.out.println(this.tampada);
		}
		else {
			System.out.println("Já está tampada!");
		}
	}

	protected void destampar() {
		if (this.tampada == true) {
			this.tampada = false;
			System.out.println(this.tampada);
		}
		else {
			System.out.println("Já está destampada!");
		}
	}

}
