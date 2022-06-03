package Exer3;

public class Circulo {

	String cor;
	Double raio;

	public Circulo(String cor, Double raio) {

		this.cor = cor;
		this.raio = raio;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public double area() {
		return Math.PI * (this.raio * this.raio);

	}

}
