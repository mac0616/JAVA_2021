package List;
import java.util.*;
public class StudentInfo {
	public static void main(String[] args){
	String department;
	String num;
	String name;
	double grade;
	int i=0;
	ArrayList<Student> st = new ArrayList<Student>();
	System.out.println("�л������� �����ϰ� �ֽ��ϴ�.");
	System.out.println("�л����� �߰��� 1��, ������ 2��, ��ȸ�� 3��, ����� 4���� �Է��ϼ���.");
	System.out.println("---------------------------------------------------------------------------");
	
	while(i != 4) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ��ɹ�ȣ�� �Է��ϼ���--->");
		i = sc.nextInt();
		switch(i) {
		case 1: 
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("�л������� �а� �й� �̸� ���� ������ �Է��ϼ���");
			Scanner n = new Scanner(System.in);
			department = n.next();
			num = n.next();
			name = n.next();
			grade = n.nextDouble();
			st.add(new Student(department, num, name, grade));
			
			System.out.println("=======================================================================");
			break;
			
		case 2:
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("������ �л� �й��� �Է��ϼ���--->");
			num = sc.next();
			boolean delresult = false;
			for (int w = 0; w < st.size(); w++) {
				Student s = st.get(w);
				if (s.getNum().equals(num)) {
					delresult=true;
				st.remove(w);
				System.out.println("�����Ǿ����ϴ�.");
				}
			}
				if(!delresult) {
				System.out.println(num +"�й��� ���� �л��� �����ϴ�.");
				}
			System.out.println("=======================================================================");
			break;
		
		case 3:
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("��ü �л������� ����մϴ�.");
			Scanner pn = new Scanner(System.in);
			for(Student p:st) {
				System.out.println(p.department + "  " + p.num + "  " + p.name + "  " + p.grade);
			}
			System.out.println("=======================================================================");
			break;
			
		case 4:
			break;
		}
	}
	}
}
