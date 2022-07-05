package ExerSwitch;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		char letra = input.next().charAt(0);
		letra = Character.toUpperCase(letra);

		switch (letra) {
		case 'A', 'E', 'I', 'O', 'U':
			System.out.println("É vogal.");
		break;

		default:
			System.out.println("É consoante");
		}

	}

}
