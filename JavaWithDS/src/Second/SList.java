package Second;
import Second.*;
import java.util.NoSuchElementException;

public class SList<E>{
	protected Node head;
	private int size;
	private int getItem;
	public SList(){
		head = null;
		size = 0;
	}
	public int search(E target) {
		Node p = head;
		for (int k = 0; k<size; k++) {
			if(target == p.getItem())
				return k;
			p = p.getNext();
		}
		return -1;
	}
	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	public void deleteFront() {
		if (isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
				size--;
	}
	public void deleteAfter(Node p) {
		if (p == null)
			throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}

public boolean isEmpty() {
	return false;
}

public void print() {
    System.out.print(head.getItem() + " ");
    if(this.head != null) {
       Node p = this.head;
       for(int i = 0; i < size; i++) {
          p = p.getNext();
          if(p != null) {
             System.out.print(p.getItem() + " ");
          }
       }
    }
 }

public int size() {
	return size;
}	
}