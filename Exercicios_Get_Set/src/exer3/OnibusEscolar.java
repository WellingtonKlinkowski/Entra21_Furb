package exer3;

public class OnibusEscolar {

	private int alunos;
	private int professor;
	private int removerAlunos;
	
	public OnibusEscolar(int alunos, int professor, int removerAlunos) {
		setAlunos(alunos);
		setProfessor(professor);
		setRemoverAlunos(removerAlunos);
	}
	
	//Aluno
	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		if( alunos > 40) {
			this.alunos = 40;
		}
		else {
			this.alunos = alunos;
		}
	}
	
	//Professor
	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		if(professor == 0) {
			this.alunos = 0;
		}
		else {
			this.professor = professor;
		}
	}

	//Removendo alunos
	public int getRemoverAlunos() {
		return removerAlunos;
	}

	public void setRemoverAlunos( int removerAlunos) {
		if(alunos > 0) {
			    alunos = alunos - removerAlunos;
		}
		this.removerAlunos = removerAlunos;
	}
}
