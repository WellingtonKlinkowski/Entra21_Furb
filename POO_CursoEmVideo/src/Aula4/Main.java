package Aula4;

public class Main {

	public static void main(String[] args) {
		// Getters e Setters

		Caneta caneta1 = new Caneta("BIC", "Verde", 0.8);
		Caneta caneta2 = new Caneta("BIC Cystal", "Preta", 0.5);

		//Entendendo os métodos acessores
		//caneta1.modelo("Bic");
		//caneta1.ponta(0.5);
		
		//caneta1.setModelo("Bic");
		//caneta1.setPonta(0.5);
		
		//Mostrando as informações na tela
		//System.out.println("Tenho uma caneta " + caneta1.getModelo() + " com a ponta " + caneta1.getPonta());
		
		caneta1.status();
		System.out.println("------------------------------------------");
		caneta2.status();
	}

}
