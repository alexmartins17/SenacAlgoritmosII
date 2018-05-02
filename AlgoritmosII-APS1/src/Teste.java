import java.util.Random;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		
		Aluno al[] = new Aluno[5];
		Turma ads = new Turma("Análise e Desenvolvimento de Sistemas");
		Aula aula[] = new Aula[10];
		
		
		for(int i = 0; i < 5; i++){ //CRIANDO ALUNOS
			al[i] = new Aluno("João" + i, 1000 + i);
			
			ads.insereAluno(al[i]); //INSERINDO ALUNOS NA TURMA
		}

		for(int i = 0; i < 4; i++){ //CRIANDO AULA
			System.out.println("Aula " + (i + 1));
			System.out.println("Data?");
			String data = ler.nextLine();
			System.out.println("Atividade?");
			String atv =ler.nextLine();
			
			aula[i] = new Aula(data, atv, ads);
		}	
			
		for(int i = 0; i < 3; i++){ //EXECUTANDO AULA
			System.out.println("AULA" + (i + 1));
			System.out.println(aula[i].getData());
			System.out.println(aula[i].getAtvExec() + "\n");
			aula[i].getTurma().chamada();
			
			
			if(aula[i].getAtvExec().equals("Avaliação!")){
				Avaliacao avl = new Avaliacao(aula[i].getData());
				for(int j = 0; j < 5; j++){
					avl.realizaAvl(aleatorio.nextInt(4) + 1);
					al[j].setNota(avl.getNota());
				}
			}
		}
		
		System.out.println("Divulgação das notas");
		System.out.println(aula[3].getData());
		System.out.println(aula[3].getAtvExec() + "\n");
		
		for(int i = 0; i < 5; i++){
			System.out.println(al[i].getNome());
			al[i].calculaMedia();
			al[i].exibeNotas();
			System.out.println("Média: " + al[i].getMedia() + "\n");
		}
		
	}
	
}
