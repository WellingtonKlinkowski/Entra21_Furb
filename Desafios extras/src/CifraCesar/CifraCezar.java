package CifraCesar;

import java.util.Scanner;

public class CifraCezar {

	public static void main(String[] args) {
		
		//IREI CONTINUAR EM CASA
		Scanner input = new Scanner(System.in);

		System.out.println("1) Decifrar um texto || 2)Cifrar um texto \n");
		int escolha = input.nextInt();

		//Decifrar um texto
		if (escolha == 1) {
			System.out.println("Digite o texto que irá ser decifrado: \n");
			String textoDecifrar = input.next();
		}
		
		
		//Cifrar um texto
		else if (escolha == 2) {
			System.out.println("Digite o texto que irá ser cifrado: \n");
			String textoCifrar = input.next();
			

		}

	}

}
