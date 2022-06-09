package Exer3;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double maior = 0;
		double menor = 0;
		double totalImp = 0;

		Dados_IR contb1 = new Dados_IR("Wellington", "08994233962", "SC", 28989.00, LocalDate.of(1999, 03, 30), "Nº 3082, Rua Professor Jacob Ineichen");
		Dados_IR contb2 = new Dados_IR("William", "98432677689", "SP", 32989.00, LocalDate.of(1999, 03, 30), "Nº 134, Rua Romário Badia");
		Dados_IR contb3 = new Dados_IR("Wesley", "13487654998", "RJ", 8989.00, LocalDate.of(1999, 03, 30), "Nº 289, Rua Frederico Jensen");
		Dados_IR contb4 = new Dados_IR("Washington", "12333322343", "RS", 289.00, LocalDate.of(1999, 03, 30), "Nº 4589, Rua George Fridrich Mordhorst");

		for(int i = 0; i < Dados_IR.array.size(); i++) {
			System.out.println(Dados_IR.array.get(i).getNome() + " seu imposto devido é " + Dados_IR.array.get(i).getImpApagar());

			totalImp += Dados_IR.array.get(i).getImpApagar();
			
			if (Dados_IR.array.get(i).getImpApagar() < menor) {
				menor = Dados_IR.array.get(i).getImpApagar();
			}
			if (Dados_IR.array.get(i).getImpApagar() > maior) {
				maior = Dados_IR.array.get(i).getImpApagar();
			}
		}
		System.out.println("\n");
		System.out.println("o maior imp é " + maior);
		System.out.println("o maior imp é " + menor);
		System.out.println("O total de imposto a pagar é " + totalImp);
		
		
	}

}
