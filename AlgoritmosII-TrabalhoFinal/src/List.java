
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

	public void addFirst(int data){
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
	
	public void append(int data){
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
	
	public void addAfter(Node aux, int data){
		Node novo = new Node(data);
		novo.setNext(aux.getNext());
		novo.setPrevious(aux);
		aux.getNext().setPrevious(novo);
		aux.setNext(novo);
	}
	
	public void addBefore(Node aux, int data){
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
		aux.getPrevious().setNext(aux.getNext());
		aux.getNext().setPrevious(aux.getPrevious());
		aux.setNext(null);
		aux.setPrevious(null);
	}
	
	public void printList(){
		Node aux = this.head;
		while(aux != null){
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
	}

}
