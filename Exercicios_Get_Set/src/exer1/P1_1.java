package exer1;

import java.util.Scanner;

public class P1_1 {

	public static void main(String[] args) {
		/*
		 * Fa�a uma classe chamada Retangulo, com os atributos altura e largura. Fa�a um
		 * m�todo para descobrir a �rea e outro para descobrir o per�metro.
		 * 
		 * Lembrando que um ret�ngulo n�o pode ter uma largura ou altura negativos!!
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da Altura: ");
		double altura = input.nextDouble();
		System.out.println("Digite o valor da Largura: ");
		double largura = input.nextDouble();

		Retangulo conta = new Retangulo(altura, largura);
		double area = conta.area();
		double perimetro = conta.perimetro();
		
		System.out.println("A area do retangulo � " + area);
		System.out.println("O perimetro do retangulo � " + perimetro);
	
	}
}
