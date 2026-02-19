package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

	private Node top; // tope de la pila
	private Node bottom; // nodo inicial de la pila

	public boolean isEmpty() {
		return top == null;
	}
	
	public void initStack(char value) {
		top = new Node(value, top, 0); 
	}

	public void push(char value) {
		if (isEmpty()) {
			top = new Node(value, null, 0);
			bottom = top;
		} else {
			top = new Node(value, top, top.count); // el nuevo nodo apunta al anterior
		}
	}
	
	public int size() {
		return isEmpty() ? 0 : top.count;
	}

	public char pop() {
		if (isEmpty()) { 
			//throw new IllegalStateException("Stack is empty"); 
			return '0'; 
		} 
		char value = top.value; 
		top = top.next; 
		return value;
	}

	public char peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack underflow");
		}
		return top.value;
	}
	
	public Node getNodeInit() {
		return bottom;
	}

}
