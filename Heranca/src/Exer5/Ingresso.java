package Exer5;

import java.util.Scanner;

public class Ingresso {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
	System.out.println("Vc estuda na 1) Furb ou 2) Ensino médio?");
	int escolha = input.nextInt();
	if(escolha == 1) {
		AlunoFurb aluno1 = new AlunoFurb('E', "Educação Fisíca", "Wellington", 23);
		aluno1.mostra();
	}
	else if( escolha == 2) {
		AlunoEnsinoMedio aluno1 = new AlunoEnsinoMedio(9, "Wellington", 23);
		aluno1.mostra();
	}
	}
}
