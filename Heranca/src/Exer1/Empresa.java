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
				
				System.out.println("Você é 1) Funcionário ou 2) Chefe?");
				int cargo = input.nextInt();
				
				
				Funcionario colab1 = new Funcionario(cargo, cargo);
				
				if(cargo == 1) {
					System.out.println("Qual sua carga horária?");
					colab1.setCargaHoraria(input.nextDouble());
					System.out.println("Qual seu ID do sindicato?");
					colab1.setIdSindicato(input.nextInt());
					
				}
				
				System.out.println("Desejar sair do sindicato? 1-Sim | 2-Não");
				int escInd = input.nextInt();
				if(escInd == 1) {
					colab1.sairSindicato();
					System.out.println("Vc saiu do sindicato e seu ID é " + colab1.getIdSindicato());
				}

				Chefe colab2 = new Chefe(cargo);
				if(cargo == 2) {
					System.out.println("Quantos subordinados vc tem?");
					colab2.setQtdSubordinado(input.nextInt());	
				}
				
				System.out.println("Deseja se demitir? 1-Sim | 2-Não");
				int escolha = input.nextInt();
				if(escolha == 1) {
				colab.demitir();
				}
			
			System.out.println("Seu nome: " + colab.getNome());
			System.out.println("Seu salário: " + colab.getSalario());
			System.out.println("Ingressou em: " + colab.getDataIngresso());
			if(cargo == 1) {
				System.out.println("Sua carga horária é: " + colab1.getCargaHoraria());
				System.out.println("Seu ID do sindicato é: " + colab1.getIdSindicato());
			}else {
				System.out.println("O número de subordinados é: " + colab2.getQtdSubordinado());
				System.out.println("Seu salário passa a ser: " + colab2.getSalario() * 2);
			}

				
				
				
	}
}
