package ExerSwitch3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);

		System.out.println("Escolha qual a modalidade em que você irá usar a conversão: ");
		System.out.println("1) Temperatura | 2) Peso | 3) Comprimento | 4) Volume");
		int escConverter = input.nextInt();

		switch (escConverter) {

		// temperatura
		case 1:

			System.out.println("1) Celsius | 2) Fahrenheit | 3) Kelvin");
			int escTemp = input.nextInt();
			System.out.println("Insira o valor que irá converter");
			double valor = input.nextDouble();

			switch (escTemp) {

			// celsius
			case 1:
				System.out.println("Converter o C° para 1) Fehrenheit | 2) Kelvin");
				int celsiusPara = input.nextInt();

				switch (celsiusPara) {

				// celsius para fehrenheit
				case 1:
					System.out.println(((valor * 9) /5) + 32);
					break;

				// celsius para kelvin
				case 2:
					System.out.println(valor + 273.15);
					break;

				default:
					break;
				}
				break;

			// fehrenheit
			case 2:

				System.out.println("Converter o F° para 1) Celsius | 2) Kelvin");
				int fehrenheitPara = input.nextInt();

				switch (fehrenheitPara) {

				// fehrenheit para celsius
				case 1:
					System.out.println( ((valor - 32) * 5) / 9 );
					break;

				// fehrenheit para kelvin
				case 2:
					System.out.println(((valor - 32) * 5) / 9 + 273.15);
					break;

				default:
					break;

				}
				break;

			// kelvin
			case 3:

				System.out.println("Converter o K° para 1) Celsius | 2) Kelvin");
				int kelvinPara = input.nextInt();

				switch (kelvinPara) {

				// kelvin para celsius
				case 1:
					System.out.println(valor - 273.15 );
					break;

				// kelvin para fehrenheit
				case 2:
					System.out.println((((valor - 273.15) * 9) / 5) + 32);
					break;

				default:
					break;

				}
				break;

			default:
				break;
			}
			break;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			

		// peso
		case 2:

			System.out.println("1) Quilos | 2) Libras | 3) Onças");
			int escPeso = input.nextInt();
			System.out.println("Insira o valor que irá converter");
			double valor2 = input.nextDouble();

			switch (escPeso) {

			// quilos
			case 1:

				System.out.println("Converter o Kg para 1) Libras | 2) Onças");
				int quilosPara = input.nextInt();

				switch (quilosPara) {

				// quilos para libras
				case 1:
					System.out.println(valor2 * 2.205);
					break;

				// quilos para onças
				case 2:
					System.out.println(valor2 * 35.274);
					break;

				default:
					break;

				}
				break;

			// libras
			case 2:

				System.out.println("Converter o Lb para 1) Quilos | 2) Onças");
				int librasPara = input.nextInt();

				switch (librasPara) {

				// libras para quilos
				case 1:
					System.out.println(valor2 / 2.205);
					break;

				// libras para onças
				case 2:
					System.out.println(valor2 * 16);
					break;

				default:
					break;

				}
				break;

			// onças
			case 3:

				System.out.println("Converter de Oç para 1) Quilos | 2) Libras");
				int oncasPara = input.nextInt();

				switch (oncasPara) {

				// onças para quilos
				case 1:
					System.out.println(valor2 / 35.274);
					break;

				// onças para libras
				case 2:
					System.out.println(valor2 / 16);
					break;

				default:
					break;
				}
				break;

			default:
				break;

			}
			break;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// comprimento
		case 3:

			System.out.println("1) Metros | 2) Pés | 3) Polegadas");
			int escComp = input.nextInt();
			System.out.println("Insira o valor que irá converter");
			double valor3 = input.nextDouble();

			switch (escComp) {

			// metros
			case 1:
				System.out.println("Converter de Metros para 1) Pés | 2) Polegadas");
				int metrosPara = input.nextInt();

				switch (metrosPara) {

				// metros para pés
				case 1:
					System.out.println(valor3 * 3.281);
					break;

				// metros para polegadas
				case 2:
					System.out.println(valor3 * 39.37);
					break;

				default:
					break;

				}
				break;

			// pés
			case 2:
				System.out.println("Converter de Pés para 1) Metros | 2) Polegadas");
				int pesPara = input.nextInt();

				switch (pesPara) {

				// pés para metros
				case 1:
					System.out.println(valor3 / 3.281);
					break;

				// pés para polegadas
				case 2:
					System.out.println(valor3 * 12);
					break;

				default:
					break;

				}
				break;

			// polegadas
			case 3:
				System.out.println("Converter de Polegadas para 1) Metros | 2) Pés");
				int polegadasPara = input.nextInt();

				switch (polegadasPara) {

				// polegadas para metros
				case 1:
					System.out.println(valor3 / 39.37);
					break;

				// polegadas para pés
				case 2:
					System.out.println(valor3 / 12);
					break;

				default:
					break;
				}
				break;

			default:
				break;
			}
			break;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// volume
		case 4:

			System.out.println("1) Litros | 2) Galões | 3) Onças liquídas");
			int escVol = input.nextInt();
			System.out.println("Insira o valor que irá converter");
			double valor4 = input.nextDouble();

			switch (escVol) {

			// litros
			case 1:
				System.out.println("Converter de Litros para 1) Galões | 2) Onças liquídas");
				int litrosPara = input.nextInt();

				switch (litrosPara) {

				// litros para galões
				case 1:
					System.out.println(valor4 / 3.785);
					break;

				// litros para onças liquídas
				case 2:
					System.out.println(valor4 * 33.814);
					break;

				default:
					break;
				}
				break;

			// galões
			case 2:
				System.out.println("Converter de Galões para 1) Litros | 2) Onças liquídas");
				int galoesPara = input.nextInt();

				switch (galoesPara) {

				// galoes para litros
				case 1:
					System.out.println(valor4 * 3.785);
					break;

				// galoes para onças liquidas
				case 2:
					System.out.println(valor4 * 128 );
					break;

				default:
					break;
				}
				break;

			// onças liquídas
			case 3:
				System.out.println("Converter de Onças Liqquídas para 1) Litros | 2) Galões");
				int oncasLqdsPara = input.nextInt();

				switch (oncasLqdsPara) {

				// onças liquídas para litros
				case 1:
					System.out.println(valor4 * 33.814);
					break;

				// onças liquídas para galões
				case 2:
					System.out.println(valor4 / 128);
					break;

				default:
					break;
				}
				break;

			}
			break;
		}
		
	}

}
