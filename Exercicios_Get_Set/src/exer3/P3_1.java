package exer3;

public class P3_1 {

	public static void main(String[] args) {
		/*
		 * Faça uma classe chamada OnibusEscolar, com os atributos estudantes e
		 * professor
		 * 
		 * Faça uma exceção no método setAlunos que se o número de alunos for maior do
		 * que 40, faça com que o número de alunos seja 40
		 * 
		 * Caso o número de professores for 0, o número de alunos também deve ser zerado
		 * 
		 * Faça também um método chamado remover alunos, que devera remover os alunos de
		 * acordo com o valor passado como parâmetro
		 */
		
		OnibusEscolar onibus1 = new OnibusEscolar( 30, 1, 5);
		
		System.out.println("O número de alunos é " + onibus1.getAlunos() + "\nNúmero de professores é " + onibus1.getProfessor() + "\nE o número de alunos é " + onibus1.getRemoverAlunos());

	}

}
