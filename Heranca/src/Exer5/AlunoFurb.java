package Exer5;

public class AlunoFurb extends Aluno {

	private char formaIngresso;
	private String curso;
	
	public AlunoFurb(char formaIngresso, String curso, String nome,  int idade) {
		super(nome, idade);
		setFormaIngresso(formaIngresso);
		setCurso(curso);
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) {
		if(formaIngresso == 'V') {
			System.out.println("Vestibular");
		}
		else if(formaIngresso == 'E') {
			System.out.println("Enem");
		}
		else if(formaIngresso == 'S') {
			System.out.println("Seletivo Especial");
		}
		else if(formaIngresso == 'T') {
			System.out.println("Transferência Externa");
		}
		else if(formaIngresso == 'I') {
			System.out.println("Transferência Interna");
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void mostra() {
		super.mostra();
		System.out.println("Seu curso escolhido foi " + getCurso());
		System.out.println("A sua forma de ingresso foi " + getFormaIngresso());
	
	}
	
	
}
