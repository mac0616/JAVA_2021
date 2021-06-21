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
	System.out.println("학생정보를 관리하고 있습니다.");
	System.out.println("학생정보 추가는 1번, 삭제는 2번, 조회는 3번, 종료는 4번을 입력하세요.");
	System.out.println("---------------------------------------------------------------------------");
	
	while(i != 4) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 기능번호를 입력하세요--->");
		i = sc.nextInt();
		switch(i) {
		case 1: 
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("학생정보를 학과 학번 이름 학점 순으로 입력하세요");
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
			System.out.print("삭제할 학생 학번을 입력하세요--->");
			num = sc.next();
			boolean delresult = false;
			for (int w = 0; w < st.size(); w++) {
				Student s = st.get(w);
				if (s.getNum().equals(num)) {
					delresult=true;
				st.remove(w);
				System.out.println("삭제되었습니다.");
				}
			}
				if(!delresult) {
				System.out.println(num +"학번을 가진 학생은 없습니다.");
				}
			System.out.println("=======================================================================");
			break;
		
		case 3:
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("전체 학생정보를 출력합니다.");
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
