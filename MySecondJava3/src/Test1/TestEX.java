package Test1;

import java.util.ArrayList;


public class TestEX {
	public static void main(String[] args) {
		 ArrayList<Product> pl = new ArrayList<Product>();
		pl.add(new Product(34, "¹Ù³ª³ª", 300));
		pl.add(new Product(35, "°ù°¨", 2500));
		pl.add(new Product(36, "ºó´ë¶±", 765));
		
		for(int i = 0; i<pl.size(); ++i)
			System.out.println(pl.get(i).prcode + "," + pl.get(i).prname +","
					+pl.get(i).getPrice()+"¿ø");
		}
}
