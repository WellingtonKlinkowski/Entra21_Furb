package Aula4;

public class Caneta {

	public String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String m, String c, Double p) { //Método construtor
		this.tampar();
		this.cor = c;
		this.setPonta(p);
		this.setModelo(m);
		
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Informações do objeto caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Tampada? " + this.tampada);
		System.out.println("Cor: " + this.cor);
	}
	
}
