package SegGrauSomaProduto;

import java.util.Scanner;

public class SomaEProduto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int aX = 1;
		int bX = 0;
		int cX = 0;
		int a = 0;
		int b = 0;
		int contador = 0;
		
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
		for( int i = -1000; i <= 1000; i++) {
			for(int j = -1000; j <= 1000; j++) {
				if(j + i == a && j * i == b) {
					System.out.println("O X¹ = " + i + " e X² = " + j ) ;
					contador++;
					break;
				}
			}
			
			if(i == 1000 && contador > 0) {
				break;
			}
			else if (i == 1000 && contador == 0){
				System.out.println("Equação sem raizes reais!");
				break;
			}
		}
	}
}
