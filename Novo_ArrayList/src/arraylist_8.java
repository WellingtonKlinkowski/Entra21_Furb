import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_8 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo que descubra se uma Array List possui o n�mero que o usu�rio entrou 
		 * Printe tamb�m o seu �ndice
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		System.out.println("Digite um valor para verificar se tem no array: ");
		int valor = input.nextInt();

		for( int i = 0; i <= 100; i++) {
			array.add(i * i);
			if(valor == array.get(i)) {
				System.out.println("Seu indice � " + array.size() + " e seu valor � " + valor);
				break;
			}
			else if( i == 100) {
				System.out.println("Voce n�o acertou!");
			}
		}
		
	}

}
