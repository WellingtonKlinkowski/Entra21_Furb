package SegGrauSomaProduto;

import java.util.Scanner;

public class SomaEProduto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int aX = 0;
		int bX = 0;
		int cX = 0;
		double a = 0;
		double b = 0;
		int contador = 0;
		
		System.out.println("Digite o valor de A\n");
		aX = input.nextInt();
		System.out.println("Digite um valor para B\n");
		bX = input.nextInt();
		System.out.println("Digite um valor para C\n");
		cX = input.nextInt();
		System.out.println("\n" + aX + "x²" + bX + "x" + cX + " = 0");
		
		//a

			a = - (bX) / aX;
	
		
		//b

			b = (cX) / aX;
	
		System.out.println("Seu produto é " + a);
		System.out.println("Sua soma é " + b);
		System.out.println("\n");
		System.out.println("---------------------------------------//-------------------------------------------");

		//Produto
		for( double i = -100.00; i <= 100.00;) {
			for(double j = -100.00; j <= 100.00;) {
				i =i + 0.01;
				j = j + 0.01;
				if(j + i == a && j * i == b) {
					System.out.println("O X¹ = " + i + " e X² = " + j ) ;
					contador++;
					break;
				}
			}
			
			if(i == 100.00 && contador > 0) {
				break;
			}
			else if (i == 100.00 && contador == 0){
				System.out.println("Equação sem raizes reais!");
				break;
			}
		}
	}
}
