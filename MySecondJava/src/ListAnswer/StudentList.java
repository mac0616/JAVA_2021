package ListAnswer;

import java.util.*;

public class StudentList {
	
	ArrayList<Student> sl;
	
	public StudentList() {
		sl = new ArrayList<Student>();
	}
	public void addNewStudent(Student s) {
		sl.add(s);
		System.out.println(s.toString() + "이 추가됩니다.");
	}
	
	public void removeStudent(String id) {
		for(Student a : sl) {
			if(a.id.equals(id)) {
				System.out.println(a.toString() + "이 삭제됩니다.");
				sl.remove(a);
				return;
			}
		}
		System.out.println(id + "학번을 가진 학생은 없습니다.");
	}
	
	public void showAllStudent() {
		for(Student a : sl){
			System.out.println(a.toString());
		}
	}
}
