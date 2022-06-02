import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_3 {

	public static void main(String[] args) {
		/*
		 * Crie uma Array List
		 *  O usuário vai colocando valores decimais até ele colocar o char n 
		 *  Calcular: 
		 * a) Qual o menor número 
		 * b) Qual o maior número 
		 * c) Calcular a média
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList lista = new ArrayList();
		
		double soma = 0;
		//Da pra fazer com while(true){ que fica melhor
		for(int i = 0; i < 10000; i++) {
			System.out.println("Insira valores: ");
			int valores = input.nextInt();
			lista.add(valores);
			System.out.println("Digite >S< para continuar e >N< para parar: ");
			char escolha = input.next().charAt(0);
			soma += valores;
			if(escolha == 'N' || escolha == 'n') {
				break;
			}
		}
		lista.sort(null);
		System.out.println(lista);
		System.out.println(lista.get(0));
		System.out.println(lista.get(lista.size() - 1));
		System.out.println(soma / lista.size());
		
		
		

	}

}
