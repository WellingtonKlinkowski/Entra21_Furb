package TratamentoExcecao8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Retangulo teste = new Retangulo();
		System.out.println("Digite a altura: ");
		teste.setAltura(input.nextDouble());
		System.out.println("Digite a largura: ");
		teste.setLargura(input.nextDouble());
		
		System.out.println("A area é " + teste.getArea(teste.getAltura(), teste.getLargura()));
		System.out.println("O perimetro é " + teste.getPerimetro(teste.getAltura(), teste.getLargura()));
	}

}
