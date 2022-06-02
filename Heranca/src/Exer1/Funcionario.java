package Exer1;

public class Funcionario extends Trabalhador{

	private double cargaHoraria;
	private int idSindicato;
	
	public Funcionario(double cargaHoraria, int idSindicato) {

		this.cargaHoraria = cargaHoraria;
		this.idSindicato = idSindicato;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getIdSindicato() {
		return idSindicato;
	}

	public void setIdSindicato(int idSindicato) {
		this.idSindicato = idSindicato;
	}
	
	public void sairSindicato() {
		idSindicato = 0;
	}
	

}
