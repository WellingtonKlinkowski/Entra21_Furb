package Caneta2.copy;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Configurando visibilidade dos atributos e métodos
		

		Classe caneta = new Classe();

		// Característica
		System.out.println("Qual o modelo da sua caneta?");
		caneta.setModelo(input.nextLine());
		System.out.println("Qual a cor da sua caneta?");
		caneta.setCor(input.nextLine());
		System.out.println("Qual a espessura da ponta da sua caneta?");
		caneta.setPonta(input.nextDouble());
		System.out.println("Qual a quantidade de tinta? 100, 90, 80...");
		caneta.setTinta(input.nextInt());

		// Estado
		boolean condicao = true;
		while (condicao) {
			System.out.println("Deseja efetuar alguma ação com sua caneta? Sim | Não");
			char escolha = input.next().toUpperCase().charAt(0);

			if (escolha == 'S') {
				System.out.println("Sua caneta está tampada? Sim | Não");
				char estadoTampa = input.next().toUpperCase().charAt(0);

				if (estadoTampa == 'S') {
					System.out.println("Deseja destampar? Sim | Não");
					char destamparCaneta = input.next().toUpperCase().charAt(0);
					if (destamparCaneta == 'S') {
						caneta.destampar();
						System.out.println("Deseja escrever, pintar ou rabiscar?");
						System.out.println("E) Escrever | P) Pintar ou R) Rabiscar?");
						char escolhaAcao = input.next().toUpperCase().charAt(0);
						if (caneta.getTinta() != 0) {
							if (escolhaAcao == 'E' && caneta.tampada == false) {
								caneta.escrevendo();
							} else if (escolhaAcao == 'P' && caneta.tampada == false) {
								caneta.pintando();
							} else if (escolhaAcao == 'R' && caneta.tampada == false) {
								caneta.rabiscar();
							} else {
								System.out.println(
										"Erro. Verifique que escolheu uma ação válida e se a caneta está destampada.");
								condicao = false;
							}
						} else {
							System.out.println("Caneta sem tinta");
							condicao = false;
						}
					} else {
						System.out.println("Caneta parada.");
						condicao = false;
					}
				} else if (estadoTampa == 'N') {
						if(caneta.getTinta() != 0) {
							System.out.println("Deseja escrever, pintar ou rabiscar?");
							System.out.println("E) Escrever | P) Pintar ou R) Rabiscar?");
							char escolhaAcao = input.next().toUpperCase().charAt(0);
							if (escolhaAcao == 'E' && caneta.tampada == false) {
								caneta.escrevendo();
							} else if (escolhaAcao == 'P' && caneta.tampada == false) {
								caneta.pintando();
							} else if (escolhaAcao == 'R' && caneta.tampada == false) {
								caneta.rabiscar();
							} else {
								System.out
										.println("Erro. Verifique que escolheu uma ação válida e se a caneta está destampada.");
								condicao = false;
							}
	
						}
					}
					else {
						System.out.println("Caneta sem tinta.");
						condicao = false;
					}

			} else {
				condicao = false;
				System.out.println("Caneta parada!");
			}
		}
	}
}
