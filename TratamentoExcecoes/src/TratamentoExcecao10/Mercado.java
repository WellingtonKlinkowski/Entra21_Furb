package TratamentoExcecao10;

import java.util.ArrayList;

public class Mercado {

	int macasVendidas;
	int laranjasVendidas;
	double precoMacas;
	double precoLaranjas;

	static ArrayList<Mercado> array = new ArrayList<>();

	public Mercado(int macasVendidas, int laranjasVendidas, double precoMacas, double precoLaranjas) {
		super();
		this.macasVendidas = macasVendidas;
		this.laranjasVendidas = laranjasVendidas;
		this.precoMacas = precoMacas;
		this.precoLaranjas = precoLaranjas;
		array.add(this);
	}

	public int getMacasVendidas() {
		return macasVendidas;
	}

	public void setMacasVendidas(int macasVendidas) {
		this.macasVendidas = macasVendidas;
	}

	public int getLaranjasVendidas() {
		return laranjasVendidas;
	}

	public void setLaranjasVendidas(int laranjasVendidas) {
		this.laranjasVendidas = laranjasVendidas;
	}

	public double getPrecoMacas() {
		return precoMacas;
	}

	public void setPrecoMacas(double precoMacas) {
		this.precoMacas = precoMacas;
	}

	public double getPrecoLaranjas() {
		return precoLaranjas;
	}

	public void setPrecoLaranjas(double precoLaranjas) {
		this.precoLaranjas = precoLaranjas;
	}

	public void receitaMacas() {

		double maiorReceita = Integer.MIN_VALUE;
		double menorReceita = Integer.MAX_VALUE;
		double receitaMacas;
		String nomeUndMaior = null;
		String nomeUndMenor = null;

		for (int i = 0; i < 3; i++) {

			receitaMacas = array.get(i).getMacasVendidas() * array.get(i).getPrecoMacas();

			if (receitaMacas > maiorReceita) {
				if (i == 0) {
					nomeUndMaior = "Blumenau";
				}
				if (i == 2) {
					nomeUndMaior = "Joinville";
				}
				if (i == 3) {
					nomeUndMaior = "Floripa";
				}
				maiorReceita = receitaMacas;
			}

			if (receitaMacas < menorReceita) {
				if (i == 0) {
					nomeUndMenor = "Blumenau";
				}
				if (i == 2) {
					nomeUndMenor = "Joinville";
				}
				if (i == 3) {
					nomeUndMenor = "Floripa";
				}
				menorReceita = receitaMacas;
			}
		}
		System.out.println(
				"A maior receita vendendo maçãs foi de " + nomeUndMaior + " com a receita de R$" + maiorReceita);
		System.out.println(
				"A menor receita vendendo maçãs foi de " + nomeUndMenor + " com a receita de R$" + menorReceita + "\n");

	}

	public void receitaLaranjas() {

		double maiorReceitaLaranja = Integer.MIN_VALUE;
		double menorReceitaLaranja = Integer.MAX_VALUE;
		double receitaLaranjas;
		String nomeUndMaiorLaranja = null;
		String nomeUndMenorLaranja = null;

		for (int j = 0; j < 3; j++) {

			receitaLaranjas = array.get(j).getLaranjasVendidas() * array.get(j).getPrecoLaranjas();

			if (receitaLaranjas > maiorReceitaLaranja) {
				if (j == 0) {
					nomeUndMaiorLaranja = "Blumenau";
				}
				if (j == 1) {
					nomeUndMaiorLaranja = "Joinville";
				}
				if (j == 2) {
					nomeUndMaiorLaranja = "Floripa";
				}
				maiorReceitaLaranja = receitaLaranjas;
			}

			if (receitaLaranjas < menorReceitaLaranja) {
				if (j == 0) {
					nomeUndMenorLaranja = "Blumenau";
				}
				if (j == 1) {
					nomeUndMenorLaranja = "Joinville";
				}
				if (j == 2) {
					nomeUndMenorLaranja = "Floripa";
				}
				menorReceitaLaranja = receitaLaranjas;
			}
		}
		System.out.println("A maior receita vendendo laranjas foi de " + nomeUndMaiorLaranja + " com a receita de R$"
				+ maiorReceitaLaranja);
		System.out.println("A menor receita vendendo laranjas foi de " + nomeUndMenorLaranja + " com a receita de R$"
				+ menorReceitaLaranja + "\n");

	}
	
	
	public void receitaAnual() {
		
		
		for (int i = 0; i < 3; i++) {
			double receitaAnual;
			double maiorReceitaAnual = Integer.MIN_VALUE;
			double menorReceitaAnual = Integer.MAX_VALUE;
			String nomeMaiorReceita = null;
			String nomeMenorReceita = null;

			receitaAnual = (array.get(i).getMacasVendidas() * array.get(i).getPrecoMacas()) + (array.get(i).getLaranjasVendidas() * array.get(i).getPrecoLaranjas());
		
			
			if (receitaAnual > maiorReceitaAnual) {
				if (i == 0) {
					nomeMaiorReceita = "Blumenau";
				}
				if (i == 1) {
					nomeMaiorReceita = "Joinville";
				}
				if (i == 2) {
					nomeMaiorReceita = "Floripa";
				}
				maiorReceitaAnual = receitaAnual;
			}

			if (receitaAnual < menorReceitaAnual) {
				if (i == 0) {
					nomeMenorReceita = "Blumenau";
				}
				if (i == 1) {
					nomeMenorReceita = "Joinville";
				}
				if (i == 2) {
					nomeMenorReceita = "Floripa";
				}
				menorReceitaAnual = receitaAnual;
			}
			System.out.println("A maior receita anual foi de " + nomeMaiorReceita + " com a receita de R$"
					+ maiorReceitaAnual);
			System.out.println("A menor receita anual foi de " + nomeMenorReceita + " com a receita de R$"
					+ menorReceitaAnual + "\n");
		}
	}

}
