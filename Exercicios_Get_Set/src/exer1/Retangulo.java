package exer1;

public class Retangulo {

	private double altura;
	private double largura;
	
	
	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		if( altura <= 0) {
			this.altura = 0;
		}
		else {
			this.altura = altura;
		}
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		if( largura <= 0) {
			this.largura = 0;
		}
		else {
			this.largura = largura;
		}
	}
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return altura + altura + largura + largura;
	}
	
	

}
