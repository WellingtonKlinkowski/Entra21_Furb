package TratamentoExcecao10;

public class Main {

	public static void main(String[] args) {
		
		Mercado undBnu = new Mercado(101, 198, 1.22 , 1.28);
		Mercado undJvll = new Mercado(78, 45, 1.49 , 1.76);
		Mercado undFlrp = new Mercado(189, 102, 1.30 , 1.11);
		undBnu.receitaMacas();
		undBnu.receitaLaranjas();

	}

}
