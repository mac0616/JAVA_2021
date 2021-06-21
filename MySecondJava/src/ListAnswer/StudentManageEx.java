package ListAnswer;
import java.util.*;
public class StudentManageEx {
	static Scanner s = new Scanner(System.in);
	
	public static Student inputStudent(){
		String id, name;
		double score;
		
		System.out.println("�й�, �̸�, ������ �Է��ϼ���==>");
		id = s.next();
		name = s.next();
		score = s.nextDouble();
		return new Student(id, name, score);
	}

	public static void main(String[] args) {
		StudentList stl = new StudentList(); //StudentList�� �����ϱ� ���� ������ ��
		int i = 0;
		Student member = null;
		String id;
		
		System.out.println("�л������� �����ϰ� �ֽ��ϴ�. �л����� �߰��� 1, ������ 2, ��ȸ�� 3��, ����� 4���� �Է��ϼ���");
		System.out.print("���ϴ� ��� ��ȣ�� �Է��ϼ���==>");
		i = s.nextInt();
		
		while(i !=4) {
			switch(i) {
			case 1:
				System.out.println("�л������� �а� �й� �̸� ���� ������ �Ԥ����ϼ���");
				member = inputStudent();
				stl.addNewStudent(member);
				break;
				
			case 2:
				System.out.println("������ �л���ȣ �Է�==>");
				id = s.next();
				stl.removeStudent(id);
				break;
				
			case 3:
				stl.showAllStudent();
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
