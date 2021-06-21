package List2;

public class Customer {
	String id;
	String name;
	int money;
	int point;
	
	public Customer(String id, String name, int money, int point) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.point = point;
	}

	@Override
	public String toString() {
		return id + "  " + name + "  " + money + "  " + point;
	}
	


}
