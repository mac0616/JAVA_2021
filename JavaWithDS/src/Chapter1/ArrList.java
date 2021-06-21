package Chapter1;
import java. util.NoSuchElementException;

public class ArrList <String> {
	private String s[];
	private int size;
	public ArrList() {
		s = (String[]) new Object[1];
		size=0;
	}
	public String peek(int k) {
		if(size == 0)
			throw new NoSuchElementException();
		return s[k];

	}
	public void insertLast(String newItem) {
		if (size == s.length)
			resize(2*s.length);
		s[size++] = newItem;
	}
	public void insert(String newItem, int k) {
		if (size == s.length)
			resize(2*s.length);
		for (int i = size-1; i>=k; i--)
			s[i+1] = s[i];
		s[k] = newItem;
		size++;
	}
	private void resize(int newSize) {
		Object[] t = new Object[newSize];
		for (int i=0; i<size; i++)
			t[i] = s[i];
		s = (String[]) t;
	}
	public String delete(int k) {
		if (isEmpty()) throw new NoSuchElementException();
		String item = s[k];
		for (int i = k; i<size; i++)
			s[i] = s[i+1];
		size--;
		if (size > 0 && size == s.length/4)
			resize(s.length/2);
		return item;
	}
	private boolean isEmpty() {
		return false;
	}

	public void print() {
		for(int i=0; i < s.length; i++) {
		System.out.print(s[i] + " ");
		}
		System.out.println();
	}
}



