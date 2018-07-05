
public class Test {

	public static void main(String[] args) {
	/*	
		List l = new List();
		
		l.addFirst("3");
		l.addFirst("2");
		l.addFirst("1");
		l.append("4");
		l.append("5");
		l.addFirst("0");
		l.removeFirst();
		l.removeLast();
		
		l.printList();
		
		Node aux = l.getHead();
		while( aux != null){
			if(aux.getData() == "2"){
				l.addBefore(aux, "8");
				break;
			}
			aux = aux.getNext();
		}
		
		aux = l.getHead();
		while( aux != null){
			if(aux.getData() == "2"){
				l.addAfter(aux, "7");
				break;
			}
			aux = aux.getNext();
		}
		
		l.printList();
		
		aux = l.getHead();
		while(aux != null){
			if(aux.getData() == "2"){
				l.remove(aux);
				break;
			}
			aux = aux.getNext();
		}
		
		l.printList();
	*/
		
		List l = new List();
		
		l.addOrdenado("G");
		l.addOrdenado("A");
		l.addOrdenado("C");
		l.addOrdenado("B");
		l.addOrdenado("J");
		l.addOrdenado("M");
		l.addOrdenado("E");
		
		l.printList();
		
	}

}
