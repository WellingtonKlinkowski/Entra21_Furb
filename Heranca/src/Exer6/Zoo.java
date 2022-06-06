package Exer6;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		 * EM TESTES
		 * CÓDIGO EM CONSTRUÇÃO
		 */
		
		
		Animais animal1 = new Animais(null, null, null, null, null);
		
		System.out.println("Esolha a raça: 1)Gatos | 2)Aves | 3) Primatas");
		int escolhaRaca = input.nextInt();
			if(escolhaRaca == 1) {
					GatosSelvagens gato1 = new GatosSelvagens(animal1.getRaca(), animal1.getNomeIdnt(), animal1.getPorte(), animal1.getHabitat(), animal1.getPaisOrg(), null, false);
					System.out.println("Qual a cor da pelagem Parda ou Preta");
					gato1.setCorPelagem(input.next());
					System.out.println("Possui listras? 1) true | 2) false");
					gato1.setPossuiListras(input.nextBoolean());
			}
			else if(escolhaRaca == 2) {
				
			}
			else if(escolhaRaca == 3) {
				System.out.println(animal1.getRaca());
				System.out.println(animal1.getNomeIdnt());
				System.out.println(animal1.getPaisOrg());
				System.out.println(animal1.getPorte());
				System.out.println(animal1.getHabitat());
				
			}
	}

}
