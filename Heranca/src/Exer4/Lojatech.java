package Exer4;

import java.util.Scanner;

public class Lojatech {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Notebook elige = new Notebook(8, 1000, true, 4.0);
		Smartphone ipfome = new Smartphone(4, 128, true, 12);

		System.out.println("Vai querer o 1)not ou o 2)smartphone?");
		int escolha = input.nextInt();

		if (escolha == 1) {
			System.out.println("Deseja aumentar a ram do Note? 1) Sim ou 2) Não");
			int escRam = input.nextInt();
			if (escRam == 1) {
				elige.aumentarRam();
				System.out.println("Deseja aumentar o armazenamento de " + elige.getArmazenamento()
						+ " para mais? 1) Sim ou 2) Não");
				int escArm = input.nextInt();
				if (escArm == 1) {
					elige.aumentarArmazenamento();
				}
			} else {
				System.out.println("Deseja aumentar o armazenamento de " + elige.getArmazenamento()
						+ " para mais? 1)Sim ou 2) Não");
				int escArm = input.nextInt();
				if (escArm == 1) {
					elige.aumentarArmazenamento();
				}
			}

			System.out.println("Note Elige");
			System.out.println("Tem ram de: " + elige.getRam());
			System.out.println("Armazenamento de " + elige.getArmazenamento());
			System.out.println("Tem reclado: " + elige.isTeclado());
			System.out.println("Tem um peso de " + elige.getPeso());
			elige.ehPesado();

		} else if (escolha == 2) {
			System.out.println("Celular Ipfome");
			System.out.println("Tem ram de: " + ipfome.getRam());
			System.out.println("Armazenamento de " + ipfome.getArmazenamento());
			System.out.println("Tem reclado: " + ipfome.isTeclado());

			while (true) {
				System.out.println("Deseja tirar selfie? 1) Sim ou 2) Não");
				int escSelfie = input.nextInt();
				if (escSelfie == 1) {
					ipfome.selfie();
				} else {
					System.out.println("o número de selfie é " + ipfome.selfies);
				}
			}
		} else {
			System.out.println("Erro");
		}
	}

}
