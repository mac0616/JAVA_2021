package Third;
import java.util.NoSuchElementException;

import Second.Node;

public class DList <E> {
	protected DNode head, tail;
	protected int size;
	public DList() {
		head = new DNode (null, null, null);
		tail = new DNode (null, head, null);
		head.setNext(tail);
		size = 0;
	}
	//삽입, 삭제 연산을 위한 메소드 선언
	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	
	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}
	
	public void delete(DNode x) {
		if (x == null)
			throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}
	
	public void print() {
		 if(this.head != null) {
			 DNode p = this.head;
			 for(int i = 0; i < size; i++) {
				 p = p.getNext();
				 if(p != null) {
					 System.out.print(p.getItem() + " ");
				 }
			 }
			 
		 }
		 if(size == 0) {
			 System.out.println("리스트 비어있음");
		 }
		 System.out.println();
	}
}