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
		product[0] = new Product(34, "�ٳ���", "300��", "(��)�ʸ���");
		product[1] = new Product(35, "����", "2500��","(��)���ֳ���");
		product[2] = new Product(36, "��붱", "765��", "(��)�°�");
		product[3] = new Product(37, "���", "1200��","(��)���ֻ��");
		product[4] = new Product(38, "��ī��", "3000��", "(��)�ʿ�����");
		
		for(Product pr : product) {
			System.out.println("��ǰ��ȣ:" + pr.prcode +" ��ǰ��:" +  pr.prname + 
					" ����:" + pr.getPrice() + " ������:" + pr.manifacture);
		}
}
}
