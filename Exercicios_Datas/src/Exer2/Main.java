package Exer2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Atributos amigo = new Atributos();
		amigo.setNome("Wellington");
		amigo.setDataNasc(LocalDate.of(1999, 3, 30));
		Atributos amigo1 = new Atributos();
		amigo1.setNome("Mendes");
		amigo1.setDataNasc(LocalDate.of(2005, 6, 2));
		Atributos amigo2 = new Atributos();
		amigo2.setNome("Vitor");
		amigo2.setDataNasc(LocalDate.of(2005, 9, 11));
		Atributos amigo3 = new Atributos();
		amigo3.setNome("Julio");
		amigo3.setDataNasc(LocalDate.of(1996, 12, 25));

		for (int i = 0; i < Atributos.amigos.size(); i++) {
			System.out.println(Atributos.amigos.get(i).getNome() + " e a data � " + Atributos.amigos.get(i).getDataNasc());
			amigo.estAno(Atributos.amigos.get(i).getDataNasc());
			amigo.diaSemana(Atributos.amigos.get(i).getDataNasc());
			amigo.anoBissexto(Atributos.amigos.get(i).getDataNasc());
			amigo.idade(Atributos.amigos.get(i).getDataNasc());
			amigo.compIdades(Atributos.amigos.get(i).getDataNasc());
			
		}
		/*
		 * int maiorIdade = Integer.MIN_VALUE;
		int menorIdade = Integer.MAX_VALUE;

		for (int i1 = 0; i1 < Atributos.amigos.size(); i1++) {
			if (anos1 > maiorIdade) {
				maiorIdade = anos1;
			}
			else if( anos1 < menorIdade) {
				menorIdade = anos1;
			}
		}
		System.out.println("\n");
		System.out.println("A maior idade � " + maiorIdade);
		System.out.println("A menor idade � " + menorIdade);
		 */
		

	}
}
