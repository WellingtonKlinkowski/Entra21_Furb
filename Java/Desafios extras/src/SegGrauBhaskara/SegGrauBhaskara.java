package SegGrauBhaskara ;

import java.util.Scanner;

public class SegGrauBhaskara {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int delta = 0;
		double x1 = 0;
		double x2 = 0;

		System.out.println("Digite um valor para A\n");
		int aX = input.nextInt();
		System.out.println("Digite um valor para B\n");
		int bX = input.nextInt();
		System.out.println("Digite um valor para C\n");
		int cX = input.nextInt();
		System.out.println("\n" + aX + "x²" + bX + "x" + cX + "=0");

		// A não pode ser 0
		if (aX == 0) {
			System.out.println("A não pode ser 0. Operação inválida.");
		}

		// Descobrindo o delta
		if (bX < 0 && cX < 0 && aX < 0) {
			delta = (((bX) * (bX)) - 4 * ((aX) * (cX)));
			System.out.println("\nO Delta é " + delta);
		} else if (aX < 0 && bX < 0) {
			delta = (((bX) * (bX)) - 4 * ((aX) * cX));
			System.out.println("\nO Delta é " + delta);
		} else if (aX < 0 && cX < 0) {
			delta = ((bX * bX) - 4 * ((aX) * (cX)));
			System.out.println("\nO Delta é " + delta);
		} else if (bX < 0 && cX < 0) {
			delta = (((bX) * (bX)) - 4 * (aX * (cX)));
			System.out.println("\nO Delta é " + delta);
		} else if (bX < 0) {
			delta = ((bX) * (bX)) - 4 * (aX * cX);
			System.out.println("\nO Delta é " + delta);
		} else if (cX < 0) {
			delta = ((bX * bX) - 4 * (aX * (cX)));
			System.out.println("\nO Delta é " + delta);
		} else if (aX < 0) {
			delta = ((bX * bX) - 4 * ((aX) * cX));
			System.out.println("\nO Delta é " + delta);
		}
		else{
			delta = ((bX * bX) - 4 * (aX * cX));
			System.out.println("\nO Delta é " + delta);
		}

		//Validando se Delta é operável
		System.out.println("Verificando se o Delta é válido...");
		for (int i = 1; i <= 10000; i++) {
			if (delta / i == i) {
				
				System.out.println("O delta é válido. Sua raiz é " + i);
				System.out.println(delta + " / " + i + " = " + i + "\n");
				
				//Descobrindo o X1
				if(aX < 0 && bX < 0) {
					x1 = -(bX) + i;
					x1 = x1 / (2 * (aX));
				}
				else if(aX < 0) {
					x1 = -(bX) + i;
					x1 = x1 / (2 * (aX));
				}
				else if(bX < 0) {
					x1 = -(bX) + i;
					x1 = x1 / (2 * aX);
				}
				else{
					x1 = -(bX) + i;
					x1 = x1 / (2 * aX);
				}
				
				//Descobrindo o X2
				if(aX < 0 && bX < 0) {
					x2 = -(bX) - i;
					x2 = x2 / (2 * (aX));
				}
				else if(aX < 0) {
					x2 = -(bX) - i;
					x2 = x2 / (2 * (aX));
				}
				else if(bX < 0) {
					x2 = -(bX) - i;
					x2 = x2 / (2 * aX);
				}
				else {
					x2 = -(bX) - i;
					x2 = x2 / (2 * aX);
				}

				System.out.println("O x1 é " + x1);
				System.out.println("O x2 é " + x2);
				break;
			}
			else if(i == 10000 && delta / i != i){
				System.out.println("Delta inválido.");
			}
		}

	}

}
