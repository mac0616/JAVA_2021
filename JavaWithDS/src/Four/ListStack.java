package Four;

import java.util.EmptyStackException;

import Second.Node;

public class ListStack <E> {
	private Node<E> top;
	private int size;
	public ListStack() {
		top = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return top.getItem();
	}
	public void push(E newItem) {
		Node newNode = new Node(newItem, top);
		top = newNode;
		size++;
	}
	public E pop() {
		if (isEmpty()) 
			throw new EmptyStackException();
		E topItem = top.getItem();
		top = top.getNext();
		size--;
		return topItem;
		}
	
	public void print() {
		System.out.print(top.getItem() + "   ");
	    if(this.top != null) {
	       Node p = this.top;
	       for(int i = 0; i < size; i++) {
	          p = p.getNext();
	          if(p != null) {
	             System.out.print(p.getItem() + "   ");
	          }
	       }
	    }
	 }
}
