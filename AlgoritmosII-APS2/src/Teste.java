
public class Teste {

	public static void main(String[] args) {
		
		Vetor vet = new Vetor(5);
		
		System.out.println("Capacidade: " + vet.capacity());
		System.out.println("Nº elementos add: " + vet.size());
		System.out.println(vet.isEmpty());
		
		vet.addFirst("Alex - 0");
		vet.append("Rafael - 4");
		vet.insert("Lucas - 1", 1);
		
		for(int i = 0; i < vet.capacity(); i++){
			System.out.println(vet.get(i));
		}
		
		
		System.out.println("Capacidade: " + vet.capacity());
		System.out.println("Nº elementos add: " + vet.size());
		System.out.println(vet.isEmpty());
		
		vet.addFirst("Caroline - 0");
		vet.append("Sara - 4");
		
		
		for(int i = 0; i < vet.capacity(); i++){
			System.out.println(vet.get(i));
		}
		
		System.out.println("Capacidade: " + vet.capacity());
		System.out.println("Nº elementos add: " + vet.size());
		System.out.println(vet.isEmpty());
		
		vet.removeLast();
		vet.removeFirst();
		vet.remove(2);
		
		for(int i = 0; i < vet.capacity(); i++){
			System.out.println(vet.get(i));
		}
		
		System.out.println("Capacidade: " + vet.capacity());
		System.out.println("Nº elementos add: " + vet.size());
		System.out.println(vet.isEmpty());
		
		vet.addFirst("Jones");
		vet.append("Joana");
		vet.insert("Maria", 2);
		
		vet.increaseSize();
		
		for(int i = 0; i < vet.capacity(); i++){
			System.out.println(vet.get(i));
		}
		
		System.out.println("Capacidade: " + vet.capacity());
		System.out.println("Nº elementos add: " + vet.size());
		System.out.println(vet.isEmpty());
		
		
		
	}

	
}
