
public class Aluno {

	private String nome;
	private int matricula;
	private double[] notas = new double[3];
	private double media;
	private int i = 0;
	
	public Aluno(String nome, int matricula){
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getMatricula(){
		return this.matricula;
	}

	public void setNota(double nota) {
		this.notas[this.i] = nota;
		this.i ++;
	}
	
	public void calculaMedia(){
		
		this.media = (this.notas[0] + this.notas[1] + this.notas[2]) / this.notas.length;
	}
	
	public void exibeNotas(){
		for(int i = 0; i < this.notas.length; i++){
			System.out.println((i + 1) + "º AVL" + this.notas[i]);
		}
	}
	
	public double getMedia(){
		return this.media;
	}
}
