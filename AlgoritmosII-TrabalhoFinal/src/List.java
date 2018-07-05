
public class List {
	
	private Node head = null;
	private Node tail = null;
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	private void addFirst(String data){
		Node novo = new Node(data);
		if(this.head == null){
			this.head = novo;
			this.tail = novo;
		}else{
			novo.setNext(this.head);
			this.head.setPrevious(novo);
			this.head = novo;
		}
	}
	
	private void append(String data){
		Node novo = new Node(data);
		if(this.tail == null){
			this.tail = novo;
			this.head = novo;
		}else{
			novo.setPrevious(this.tail);
			this.tail.setNext(novo);
			this.tail = novo;
		}
	}
	
	private void addAfter(Node aux, String data){
		Node novo = new Node(data);
		novo.setNext(aux.getNext());
		novo.setPrevious(aux);
		aux.getNext().setPrevious(novo);
		aux.setNext(novo);
	}
	
	private void addBefore(Node aux, String data){
		Node novo = new Node(data);
		novo.setPrevious(aux.getPrevious());
		novo.setNext(aux);
		aux.getPrevious().setNext(novo);
		aux.setPrevious(novo);
	}
	
	public void removeFirst(){
		if(this.head == null){
			System.out.println("Lista vazia!");
		}else{
			if(this.head.getNext() == null){
				this.head = null;
				this.tail = null;
			}else{
				this.head = this.head.getNext();
				this.head.getPrevious().setNext(null);
				this.head.setPrevious(null);
			}
		}
	}
	
	public void removeLast(){ 
		if(this.tail == null){
			System.out.println("Lista vazia!");
		}else{
			if(this.tail.getPrevious() == null){
				this.tail = null;
				this.head = null;
			}else{
				this.tail = this.tail.getPrevious();
				this.tail.getNext().setPrevious(null);
				this.tail.setNext(null);
			}
		}
	}
	
	public void remove(Node aux){
		if(aux.getPrevious() == null){
			this.head = aux.getNext();
			this.head.setPrevious(null);
			aux.setNext(null);
		}else{
			if(aux.getNext() == null){
				this.tail = aux.getPrevious();
				this.tail.setNext(null);
				aux.setPrevious(null);
			}else{
				aux.getPrevious().setNext(aux.getNext());
				aux.getNext().setPrevious(aux.getPrevious());
				aux.setNext(null);
				aux.setPrevious(null);
			}
		}
	}
	
	public void printList(){
		Node aux = this.head;
		System.out.println("");
		while(aux != null){
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
		System.out.println("");
	}
	
	//Métodos para lista indexada
	
	public void addOrdenado(String data){
		Node novo = new Node(data);
		Node aux = this.head;
		if(this.head == null){
			this.head = novo;
			this.tail = novo;
		}else{
			while(aux != null){
				if(data.compareTo(aux.getData()) <= 0){
					if(aux.getPrevious() == null){
						novo.setNext(aux);
						aux.setPrevious(novo);
						this.head = novo;
					}else{
						novo.setNext(aux);
						novo.setPrevious(aux.getPrevious());
						aux.getPrevious().setNext(novo);
						aux.setPrevious(novo);
					}//FimSe Nó será inserido no início da lista ou no meio
					break;
				}else{
					if(aux.getNext() == null){
						novo.setPrevious(aux);
						aux.setNext(novo);
						this.tail = novo;
						break;
					}
				}//FimSe comparação é menor/igual ou maior
					aux = aux.getNext();	
			}//FimWhile
		}//FimSe lista está vazia ou não
		
	}
	
	
}
