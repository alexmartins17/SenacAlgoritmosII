
public class Turma {

	private String disciplina;
	private Aluno alunos[] = new Aluno[5];
	private int i = 0;
	
	public Turma(String disciplina){
		this.disciplina = disciplina;
	}
	public void insereAluno(Aluno aluno){
		this.alunos[this.i] = aluno;
		this.i ++;
	}

	public void chamada() {
		System.out.println("ATENÇÃO PARA A CHAMADA!");
		
		for(int i = 0; i < this.alunos.length; i++){
			System.out.println(this.alunos[i].getNome() + "\n... \n");
			
		}
		
	}	
}
