package exer3;

public class P3_1 {

	public static void main(String[] args) {
		/*
		 * Fa�a uma classe chamada OnibusEscolar, com os atributos estudantes e
		 * professor
		 * 
		 * Fa�a uma exce��o no m�todo setAlunos que se o n�mero de alunos for maior do
		 * que 40, fa�a com que o n�mero de alunos seja 40
		 * 
		 * Caso o n�mero de professores for 0, o n�mero de alunos tamb�m deve ser zerado
		 * 
		 * Fa�a tamb�m um m�todo chamado remover alunos, que devera remover os alunos de
		 * acordo com o valor passado como par�metro
		 */
		
		OnibusEscolar onibus1 = new OnibusEscolar( 30, 1, 5);
		
		System.out.println("O n�mero de alunos � " + onibus1.getAlunos() + "\nN�mero de professores � " + onibus1.getProfessor() + "\nE o n�mero de alunos � " + onibus1.getRemoverAlunos());

	}

}
