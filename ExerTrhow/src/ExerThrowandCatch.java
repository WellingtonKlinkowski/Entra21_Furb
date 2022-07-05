import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerThrowandCatch {

	
	@SuppressWarnings({ "unused" })
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Digite um valor");
			int valor1 = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Digite apenas números");
		}
		input.close();
	}

}
