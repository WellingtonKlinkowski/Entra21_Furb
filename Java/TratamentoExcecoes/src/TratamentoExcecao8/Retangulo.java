package TratamentoExcecao8;

public class Retangulo {

	double largura;
	double altura;
	double area;
	double perimetro;

	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArea(double altura, double largura) {
		return area= this.altura * this.largura;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro(double altura, double largura) {
		return perimetro = (this.largura * this.largura) + (this.altura + this.altura);
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	
	
}
