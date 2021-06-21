package ListAnswer;

import java.util.*;

public class StudentList {
	
	ArrayList<Student> sl;
	
	public StudentList() {
		sl = new ArrayList<Student>();
	}
	public void addNewStudent(Student s) {
		sl.add(s);
		System.out.println(s.toString() + "�� �߰��˴ϴ�.");
	}
	
	public void removeStudent(String id) {
		for(Student a : sl) {
			if(a.id.equals(id)) {
				System.out.println(a.toString() + "�� �����˴ϴ�.");
				sl.remove(a);
				return;
			}
		}
		System.out.println(id + "�й��� ���� �л��� �����ϴ�.");
	}
	
	public void showAllStudent() {
		for(Student a : sl){
			System.out.println(a.toString());
		}
	}
}
