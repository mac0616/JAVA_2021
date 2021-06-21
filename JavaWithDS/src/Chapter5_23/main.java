package Chapter5_23;

public class main {public static void main(String[] args) {
	BST t = new BST(70, "Apple");
	
	t.put(60, "60");
	t.put(30, "30");
	t.put(10, "10");
	t.put(50, "50");
	t.put(80, "80");
	t.put(90, "90");
	t.put(40, "40");
	
	t.print(t.root);
	System.out.println();
}
}

