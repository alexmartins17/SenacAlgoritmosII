
public class Aula {

	private String data;
	private String atvExec;
	private Turma turma;
	
	public Aula(String data, String atvExec, Turma turma){
		this.data = data;
		this.atvExec = atvExec;
		this.turma = turma;
	}
	
	public String getData(){
		return this.data;
	}
	
	public Turma getTurma(){
		return this.turma;
	}
	
	public String getAtvExec(){
		return this.atvExec;
	}
}
