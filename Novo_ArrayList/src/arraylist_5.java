import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_5 {

	public static void main(String[] args) {
		//Fa�a um algoritmo que coloque o n�mero 0 no �ndice que o usu�rio escolheu
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		System.out.println("Digite um indice: ");
		int indice = input.nextInt();
		
		for(int i = 0; i <= 100; i++) {
			array.add(i * i);
		}
		
		array.set(indice, 0);
		System.out.println(array);
	}
}
