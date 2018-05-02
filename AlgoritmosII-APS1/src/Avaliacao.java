import java.util.Random;

public class Avaliacao {

	private String data;
	private double nota;
	
	public Avaliacao(String data){
		this.data = data;
	}
	
	public String getData(){
		return this.data;
	}
	
	public double getNota(){
		return this.nota;
	}
	
	public void realizaAvl(int situacao){
		Random aleatorio = new Random();
		switch(situacao){
		case 1:
			this.nota = aleatorio.nextInt(4) + 8;
			break;
		case 2:
			this.nota = aleatorio.nextInt(4) + 5;
			break;
		case 3:
			this.nota = aleatorio.nextInt(4) + 2;
			break;
		case 4:
			this.nota = aleatorio.nextInt(4);
			break;
		}		
		
	}
}
