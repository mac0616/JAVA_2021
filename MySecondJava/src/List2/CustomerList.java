package List2;

import java.util.ArrayList;

public class CustomerList {
	
	ArrayList<Customer> sl;
	
	public CustomerList() {
		sl = new ArrayList<Customer>();
	}
	public void addNewCustomer(Customer s) {
		sl.add(s);
		System.out.println("================================================");
	}
	
	public void removeCustomer(String id) {
		for(Customer a : sl) {
			if(a.id.equals(id)) {
				System.out.println("================================================");
				sl.remove(a);
				return;
			}
		}
		System.out.println(id + "학번을 가진 고은 없습니다.");
	}
	
	public void showAllCustomer() {
		for(Customer a : sl){
			System.out.println(a.toString());
		}
	}
}
