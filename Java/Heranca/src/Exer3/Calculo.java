package Exer3;

public class Calculo {

	public static void main(String[] args) {
		
		Cilindro garrafa = new Cilindro("Azul", 9.0, 1.20);
		
		System.out.println(garrafa.getCor());
		System.out.println(garrafa.getRaio());
		System.out.println(garrafa.getAltura());
		System.out.println(garrafa.area());
		System.out.println(garrafa.volume());
	}

}
