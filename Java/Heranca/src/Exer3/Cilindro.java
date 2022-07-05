package Exer3;

public class Cilindro extends Circulo {

	private double altura;

	public Cilindro(String cor, Double raio, double altura) {
		super(cor, raio);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double volume(double altura) {
		return altura;
	}

	public double volume() {
		return area() * this.altura;
	}

}
