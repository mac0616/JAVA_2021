package MyTest;

public class Product {
	int prcode = 0;
	String prname = null ;
	private String price = null;
	String manifacture = null;
	
	public Product(int prcode, String prname, String price, String manifacture) {
		super();
		this.prcode = prcode;
		this.prname = prname;
		this.price = price;
		this.manifacture = manifacture;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}



	public static void main(String[] args) {		
		Product[] product = new Product[5];
		product[0] = new Product(34, "바나나", "300원", "(주)필리핀");
		product[1] = new Product(35, "곶감", "2500원","(주)상주농협");
		product[2] = new Product(36, "빈대떡", "765원", "(주)태경");
		product[3] = new Product(37, "사과", "1200원","(주)충주사과");
		product[4] = new Product(38, "마카롱", "3000원", "(주)필운제과");
		
		for(Product pr : product) {
			System.out.println("상품번호:" + pr.prcode +" 상품명:" +  pr.prname + 
					" 가격:" + pr.getPrice() + " 제조사:" + pr.manifacture);
		}
}
}
