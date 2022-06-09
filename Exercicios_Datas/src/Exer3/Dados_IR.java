package Exer3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dados_IR {
	static ArrayList<Dados_IR> array = new ArrayList<>();

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	private LocalDate datNasc;
	private String endereco;
	double impApagar;

	public Dados_IR(String nome, String cpf, String uf, double rendaAnual, LocalDate datNasc, String endereco) {
		super();
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
		setDatNasc(datNasc);
		setEndereco(endereco);
		this.impApagar = this.calcImp();
		this.array.add(this);
	}

	public Double getImpApagar() {
		return impApagar;
	}

	public void setImpApagar(Double impApagar) {
		this.impApagar = impApagar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public LocalDate getDatNasc() {
		return datNasc;
	}

	public void setDatNasc(LocalDate datNasc) {
		this.datNasc = datNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double calcImp() {

		double aliquota = 0;
		int ano = this.getDatNasc().getYear();
		double irApagar = 0;
		if (ano <= 1990) {
			if (this.rendaAnual <= 4000) {
				aliquota = 0;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else if (this.rendaAnual > 4000 && this.rendaAnual <= 9000) {
				aliquota = 0.058;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else if (this.rendaAnual > 9000 && this.rendaAnual <= 25000) {
				aliquota = 0.15;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else if (this.rendaAnual > 25000 && this.rendaAnual <= 30000) {
				aliquota = 0.275;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else {
				aliquota = 0.30;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			}
		}

		else {
			if (this.rendaAnual <= 8000) {
				aliquota = 0;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else if (this.rendaAnual > 8000 && this.rendaAnual <= 12000) {
				aliquota = 0.058;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else if (this.rendaAnual > 12000 && this.rendaAnual <= 25000) {
				aliquota = 0.15;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else if (this.rendaAnual > 25000 && this.rendaAnual <= 39000) {
				aliquota = 0.275;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			} else {
				aliquota = 0.30;
				irApagar = this.rendaAnual * aliquota;
				return irApagar;
			}

		}

	}

}
