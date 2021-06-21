package Chapter3_3;
import java.util.NoSuchElementException;
import Chapter3_3.Node;

public class ListQueue <E> {
	private Node<E> front,rear;
	private int size;
	public ListQueue() {
		front = rear = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if (isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public E remove() {
		if (isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if (isEmpty()) rear = null;
		size--;
		return frontItem;
	}
	
	public void print() {
		System.out.print(front.getItem() + " ");
	    if(this.rear != null) {
	       Node p = this.front;
	       for(int i = 1; i < size; i++) {
	          p = p.getNext();
	          if(p != null) {
	             System.out.print(p.getItem() + " ");
	          }
	       }
	       System.out.println();
	    }
	}
}

	
	
