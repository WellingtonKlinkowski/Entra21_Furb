package Exer2;

public class Natureza {

	public static void main(String[] args) {


		Cachorro neguinho = new Cachorro("Labrador");
		neguinho.especie = "Grande";
		neguinho.deCasa = true;
		neguinho.peso = 29.0;
		
		System.out.println(neguinho.especie);
		System.out.println(neguinho.deCasa);
		System.out.println(neguinho.peso);
		System.out.println(neguinho.getRaca());
		neguinho.Barulho();
		
		
		
		Gato leco = new Gato("Siamês");
		leco.especie = "Mini";
		leco.deCasa = true;
		leco.peso = 2.0;
		
		
		System.out.println(leco.especie);
		System.out.println(leco.deCasa);
		System.out.println(leco.peso);
		System.out.println(leco.getRaca());
		leco.Barulho();
		
		
		
		
		Papagaio rico = new Papagaio("Ring Neck");
		rico.especie = "Normal";
		rico.deCasa = true;
		rico.peso = 0.59;
		
		System.out.println(rico.especie);
		System.out.println(rico.deCasa);
		System.out.println(rico.peso);
		System.out.println(rico.getRaca());
		rico.Barulho();


	}

}
