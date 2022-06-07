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
			System.out.println(Atributos.amigos.get(i).getNome() + " e a data é " + Atributos.amigos.get(i).getDataNasc());
			amigo.estAno(Atributos.amigos.get(i).getDataNasc());
			amigo.diaSemana(Atributos.amigos.get(i).getDataNasc());
			amigo.anoBissexto(Atributos.amigos.get(i).getDataNasc());
			amigo.idade(Atributos.amigos.get(i).getDataNasc());

			LocalDate idade = LocalDate.now();
			int anos = amigo.getDataNasc().compareTo(idade);
			anos = anos - anos - anos;

			int maiorIdade = Integer.MIN_VALUE;
			int menorIdade = Integer.MAX_VALUE;

			for (int i1 = 0; i1 <= Atributos.amigos.size(); i1++) {
				if (anos > maiorIdade) {
					maiorIdade = anos;
				}
				else if( anos < menorIdade) {
					menorIdade = anos;
				}
			}
			System.out.println("A maior idade é " + maiorIdade);
			System.out.println("A maior idade é " + menorIdade);
			System.out.println("\n");
		}

	}
}
