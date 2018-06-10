
public class Vetor {

	private int numElements;
	private int index;
	private String[] vet;
	
	public Vetor(int size){
		this.vet = new String[size];
	}
	
	public void append(String value){
		if(this.numElements == this.vet.length){
			increaseSize();
		}
		if(this.vet[this.vet.length - 1] == null){ //Se ultima posi��o for nula
			this.vet[this.vet.length - 1] = value; //Ultima posi��o receber� o valor
		}else{									   //Se n�o for nula
			boolean end = false; //Vari�vel P/ sair do la�o.
			int aux = 1;		 									//  ALGORITMO PARA PROUCURAR POSI��O VAZIA 
			this.index = this.vet.length - 2;						//  E FAZER COM QUE O VETOR DESLOQUE ORDENADAMENTE
			do{														//  OS VALORES EM SENTIDO A POSI��O VAZIA, AT� QUE
				if(this.vet[this.index] == null){					//  A ULTIMA POSI��O SEJA NULA, ASSIM PODE-SE ADD
					for(int i = aux; i > 0; i--){					//  O VALOR NA ULTIMA POSI��O!!!!!
						this.vet[this.index] = this.vet[this.index + 1];
						this.index ++;
					}
					this.vet[this.index] = value;
					end = true;
				}
				aux ++;
				this.index --;
			}while(end == false);
		}
		this.numElements ++;
	}
	
	public void addFirst(String value){				// O algoritmo para proucurar o indice nulo � o contr�rio 
		if(this.numElements == this.vet.length){
			increaseSize();
		}
		if(this.vet[0] == null){					// do que foi implementado no m�todo "append"!!!
			this.vet[0] = value;
		}else{
			boolean end = false;
			int aux = this.vet.length - 2;
			this.index = 1;
			do{
				if(this.vet[this.index] == null){
					for(int i = aux; i < this.vet.length - 1; i++){
						this.vet[this.index] = this.vet[this.index - 1];
						this.index --;
					}
					this.vet[this.index] = value;
					end = true;
				}
				aux --;
				this.index ++;
			}while(end == false);
		}
		this.numElements ++;
	}
	
	public void insert(String value, int index){
		if(index < 0 || index > this.vet.length){
			throw new ArrayIndexOutOfBoundsException(index);
		}else{
			this.vet[index] = value;
			this.numElements ++;
		}
	}
	
	public String get(int index){
		if(index < 0 || index > this.vet.length){
			throw new ArrayIndexOutOfBoundsException(index);
		}else{
			return this.vet[index];
		}
	}
	
	public void set(int index, String value){
		if(index < 0 || index > this.vet.length){
			throw new ArrayIndexOutOfBoundsException(index);
		}else{
			this.vet[index] = value;
		}
	}
	public void removeLast(){
		this.vet[this.vet.length - 1] = null;
		this.numElements --;
	}
	public void removeFirst(){
		this.vet[0] = null;
		this.numElements --;
	}
	
	public void remove(int index){
		if(index < 0 || index > this.vet.length){
			throw new ArrayIndexOutOfBoundsException(index);
		}else{
			this.vet[index] = null;
			this.numElements --;
		}
	}
	
	public int size(){
		return this.numElements;
	}
	
	public int capacity(){
		return this.vet.length;
	}
	
	public boolean isEmpty(){
		if(this.numElements != 0){
			return false;
		}else{
			return true;
		}		
	}
	
	public void increaseSize(){
		String[] vetAux = new String[this.vet.length];
		
		for(int i = 0; i > vetAux.length; i++){
			vetAux[i] = this.vet[i];
		}
		
		this.vet = new String[vetAux.length + 10];
		
		for(int i = 0; i > vetAux.length; i++){
			this.vet[i] = vetAux[i];
		}
	}
}
