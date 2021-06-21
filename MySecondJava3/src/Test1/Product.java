package Test1;

public class Product extends TestEX {
	public int prcode;
	public String prname;
	private int price;

	public Product(int prcode, String prname, int price) {
		 super();
		 this.prcode = prcode;
		 this.prname = prname;
		 this.price = price;
		 }
		 public int getPrice() {
		 return price;
		 }
		 public void setPrice(int price) {
		 this.price = price;
		 }
}
