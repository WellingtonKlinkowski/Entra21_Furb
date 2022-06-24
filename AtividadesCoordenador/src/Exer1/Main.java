package Exer1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		InteiroPositivo numero = new InteiroPositivo();
		System.out.println("Digite um valor para X:");
		numero.setNumX1(input.nextInt());
		System.out.println("Digite um valor para X:");
		numero.setNumX2(input.nextInt());
		numero.multi(numero.getNumX1(), numero.getNumX2());
	}

}
