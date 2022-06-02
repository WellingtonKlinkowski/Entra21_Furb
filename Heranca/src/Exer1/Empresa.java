package Exer1;

import java.util.Scanner;
import java.util.Set;

public class Empresa {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			

				Trabalhador colab = new Trabalhador();
				System.out.println("Qual é seu nome?");
				colab.setNome(input.next());
				System.out.println("Qual o seu salário?");
				colab.setSalario(input.nextDouble());
				System.out.println("Quando entrou na empresa?");
				colab.setDataIngresso(input.nextInt());
				
				System.out.println("Deseja se demitir? 1-Sim | 2-Não");
				int escolha = input.nextInt();
				if(escolha == 1) {
				colab.demitir();
				}
			
				Funcionario colab1 = new Funcionario(escolha, escolha);
				System.out.println("Qual sua carga horária?");
				colab1.setCargaHoraria(input.nextDouble());
				
				System.out.println("Desejar sair do sindicato? 1-Sim | 2-Não");
				colab1.setIdSindicato(input.nextInt());
				if(colab1.getIdSindicato() == 1) {
					colab1.sairSindicato();
					System.out.println("Vc saiur do sindicato e seu ID é " + colab1.getIdSindicato());
				}
				

				
				
				
	}
}
