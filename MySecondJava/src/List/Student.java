package List;
import java.util.*;
class Student {
	String department;
	String num;
	String name;
	double grade;
	
	public Student(String department, String num, String name, double grade) {
		super();
		this.department = department;
		this.num = num;
		this.name = name;
		this.grade = grade;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
