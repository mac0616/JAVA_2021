package Chapter5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST <Key extends Comparable<Key>, Value>{
	public Node root;
	public Node getRoot() { return root; }
	public BST(Key newId, Value newName) { //get, put, min, deleteMin, delete 메소드들 선언
		root = new Node(newId, newName);
	}
	public Value get(Key k) { return get(root, k); }
	public Value get(Node n, Key k) {
		if (n == null)
			return null;
		int t = n.getKey().compareTo(k);
		if (t > 0)
			return get(n.getLeft(), k);
		else if ( t < 0)
			return get(n.getRight(), k);
		else
			return (Value)n.getValue();
	}
	
	public void put(Key k, Value v) { root = put(root, k, v); }
	public Node put(Node n, Key k, Value v) {
		if (n == null)
			return new Node(k, v);
		int t = n.getKey().compareTo(k);
		if (t > 0)
			n.setLeft(put(n.getLeft(), k, v));
		else if (t < 0)
			n.setRight(put(n.getRight(), k, v));
		else
			n.setValue(v);
		return n;
	}
	
	public Key min() {
		if(root == null)
			return null;
		return (Key) min(root).getKey();}
	private Node min(Node n) {
		if (n.getLeft() == null)
			return n;
		return min(n.getLeft());
	}
	
	public void deleteMin() {
		if (root == null)
			System.out.println("empty 트리");
		root = deleteMin(root);}
	public Node deleteMin(Node n) {
		if (n.getLeft() == null)
			return n.getRight();
		n.setLeft(deleteMin(n.getLeft()));
		return n;
	}

	public void deleteMax() {
		if (root == null)
			System.out.println("empty 트리");
		root = deleteMax(root);}
	private Node deleteMax(Node n) {
		if (n.getRight() == null)
			return n.getLeft();
		n.setRight(deleteMax(n.getRight()));
		return n;
	}
	
	public int height() { return height(root)+1; }
		private int height(Node n) {
			if (n == null)
				return -1;
			return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
	}
		
	public void preorder(Node n) {
		if (n != null) {
			System.out.print(n.getKey()+" ");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}
	public void inorder(Node n) {
		if (n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey() + " ");
			inorder(n.getRight());
		}
	}
	public void postorder(Node n) {
		if (n != null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey() + " ");
		}
	}
		
	public void print(Node root) {
		System.out.printf("\ninorder:\n");
		inorder(root);
		System.out.printf("\npreorder:\n");
		preorder(root);
		System.out.printf("\npostorder:\n");
		postorder(root);
	}
		
}