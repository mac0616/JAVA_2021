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
		
		System.out.println("�������� �����ϰ� �ֽ��ϴ�.");
		System.out.println("������ �߰��� 1��, ������ 2��, ��ȸ�� 3��, ����� 4���� �Է��ϼ���");
		System.out.println("------------------------------------------------------------");
		System.out.print("���ϴ� ��� ��ȣ�� �Է��ϼ���==>");
		i = s.nextInt();
		
		System.out.println("------------------------------------------------------------");
		
		while(i !=4) {
			switch(i) {
			case 1:
				System.out.println("�������� ���̵�, �̸�, ���ݾ�, ����Ʈ ������ �Է��ϼ���");
				member = inputCustomer();
				stl.addNewCustomer(member);
				break;
				
			case 2:
				System.out.println("������ �� ���̵� �Է��ϼ���==>");
				id = s.next();
				stl.removeCustomer(id);
				break;
				
			case 3:
				System.out.println("��ü �������� ����մϴ�");
				stl.showAllCustomer();
				break;
				
			default:
				break;
			}
			System.out.print("���ϴ� ��� ��ȣ�� �Է��ϼ���==>");
			i = s.nextInt();
		}
		
		System.out.println("���α׷� ����");
	}

}
