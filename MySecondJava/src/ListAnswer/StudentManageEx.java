package ListAnswer;
import java.util.*;
public class StudentManageEx {
	static Scanner s = new Scanner(System.in);
	
	public static Student inputStudent(){
		String id, name;
		double score;
		
		System.out.println("학번, 이름, 학점을 입력하세요==>");
		id = s.next();
		name = s.next();
		score = s.nextDouble();
		return new Student(id, name, score);
	}

	public static void main(String[] args) {
		StudentList stl = new StudentList(); //StudentList를 실행하기 위해 만들어야 함
		int i = 0;
		Student member = null;
		String id;
		
		System.out.println("학생정보를 관리하고 있습니다. 학생정보 추가는 1, 삭제는 2, 조회는 3번, 종료는 4번을 입력하세요");
		System.out.print("원하는 기능 번호를 입력하세요==>");
		i = s.nextInt();
		
		while(i !=4) {
			switch(i) {
			case 1:
				System.out.println("학생정보를 학과 학번 이름 학점 순으로 입ㄹ력하세요");
				member = inputStudent();
				stl.addNewStudent(member);
				break;
				
			case 2:
				System.out.println("삭제할 학생번호 입력==>");
				id = s.next();
				stl.removeStudent(id);
				break;
				
			case 3:
				stl.showAllStudent();
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
