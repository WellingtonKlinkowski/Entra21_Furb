package Exer1;

import java.util.Scanner;
import java.util.Set;

public class Empresa {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

				Trabalhador colab = new Trabalhador();
				System.out.println("Qual � seu nome?");
				colab.setNome(input.next());
				System.out.println("Qual o seu sal�rio?");
				colab.setSalario(input.nextDouble());
				System.out.println("Quando entrou na empresa?");
				colab.setDataIngresso(input.nextInt());
				
				System.out.println("Voc� � 1) Funcion�rio ou 2) Chefe?");
				int cargo = input.nextInt();
				
				
				Funcionario colab1 = new Funcionario(cargo, cargo);
				
				if(cargo == 1) {
					System.out.println("Qual sua carga hor�ria?");
					colab1.setCargaHoraria(input.nextDouble());
					System.out.println("Qual seu ID do sindicato?");
					colab1.setIdSindicato(input.nextInt());
					
				}
				
				System.out.println("Desejar sair do sindicato? 1-Sim | 2-N�o");
				int escInd = input.nextInt();
				if(escInd == 1) {
					colab1.sairSindicato();
					System.out.println("Vc saiu do sindicato e seu ID � " + colab1.getIdSindicato());
				}

				Chefe colab2 = new Chefe(cargo);
				if(cargo == 2) {
					System.out.println("Quantos subordinados vc tem?");
					colab2.setQtdSubordinado(input.nextInt());	
				}
				
				System.out.println("Deseja se demitir? 1-Sim | 2-N�o");
				int escolha = input.nextInt();
				if(escolha == 1) {
				colab.demitir();
				}
			
			System.out.println("Seu nome: " + colab.getNome());
			System.out.println("Seu sal�rio: " + colab.getSalario());
			System.out.println("Ingressou em: " + colab.getDataIngresso());
			if(cargo == 1) {
				System.out.println("Sua carga hor�ria �: " + colab1.getCargaHoraria());
				System.out.println("Seu ID do sindicato �: " + colab1.getIdSindicato());
			}else {
				System.out.println("O n�mero de subordinados �: " + colab2.getQtdSubordinado());
				System.out.println("Seu sal�rio passa a ser: " + colab2.getSalario() * 2);
			}

				
				
				
	}
}
