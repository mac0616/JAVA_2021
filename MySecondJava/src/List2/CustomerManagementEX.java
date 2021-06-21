package List2;
import java.util.Scanner;

public class CustomerManagementEX {
	static Scanner s = new Scanner(System.in);
	
	public static Customer inputCustomer(){
		String id, name;
		int point, money;

		id = s.next();
		name = s.next();
		money = s.nextInt();
		point = s.nextInt();
		return new Customer(id, name, money, point);
	}

	public static void main(String[] args) {
		CustomerList stl = new CustomerList();
		int i = 0;
		Customer member = null;
		String id;
		
		System.out.println("고객정보를 관리하고 있습니다.");
		System.out.println("고객정보 추가는 1번, 삭제는 2번, 조회는 3번, 종료는 4번을 입력하세요");
		System.out.println("------------------------------------------------------------");
		System.out.print("원하는 기능 번호를 입력하세요==>");
		i = s.nextInt();
		
		System.out.println("------------------------------------------------------------");
		
		while(i !=4) {
			switch(i) {
			case 1:
				System.out.println("고객정보를 아이디, 이름, 사용금액, 포인트 순으로 입력하세요");
				member = inputCustomer();
				stl.addNewCustomer(member);
				break;
				
			case 2:
				System.out.println("삭제할 고객 아이디를 입력하세요==>");
				id = s.next();
				stl.removeCustomer(id);
				break;
				
			case 3:
				System.out.println("전체 고객정보를 출력합니다");
				stl.showAllCustomer();
				break;
				
			default:
				break;
			}
			System.out.print("원하는 기능 번호를 입력하세요==>");
			i = s.nextInt();
		}
		
		System.out.println("프로그램 종료");
	}

}
