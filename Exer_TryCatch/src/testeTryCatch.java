import java.util.Scanner;

public class testeTryCatch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor para acessar o vetor: ");
		int numb = input.nextInt();
		
		//Testando e estudando o Try and Catch
		
		for(int i = 0; i <= numb; i++ ) {
			try {
				int vetor[] = new int [numb];
				vetor[i] = i * i + i;
				System.out.println(vetor[numb]);
			}catch (Exception e) {
				System.out.println("O índice do vetor que vc solicitou está fora do tamanho");
				break;
			}
		}

	}

}
