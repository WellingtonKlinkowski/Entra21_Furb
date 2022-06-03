package Exer4;

public class Notebook extends Computador {

	private double peso;

	public Notebook(int ram, double armazenamento, boolean teclado, double peso) {
		super(ram, armazenamento, teclado);
		setPeso(peso);
	}

	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public void ehPesado(){
		if(peso >= 3) {
			System.out.println("é pesado");
		}
		else {
			System.out.println("é leve");
		}
	}
	
}
