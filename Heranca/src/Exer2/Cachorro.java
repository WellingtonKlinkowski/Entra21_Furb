package Exer2;

public class Cachorro extends Animal{

	private String raca;

public Cachorro(String raca) {

	this.raca = raca;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public void Barulho(){
	System.out.println("Seu barulho é Au au au au au");
}
	
}
