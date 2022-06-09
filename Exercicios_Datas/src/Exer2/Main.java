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
		}
		
		System.out.println("\n");
		
		int idMaior = 0;
		int idMenor = 0;
		
		for(int i = 0; i < Atributos.amigos.size(); i++) {
			int anos = (amigo.idadeComp(Atributos.amigos.get(i).getDataNasc()));
			if(anos > idMaior) {
				idMaior = anos;
			}
			else {
				idMenor = anos;
			}
		}
		System.out.println("A maior idade é " + idMaior);
		System.out.println("A menor idade é " + idMenor);
		
	}
}
