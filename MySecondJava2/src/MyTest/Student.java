package MyTest;

public class Student extends Animal{
	int grade;
	public void gotoSchool() {
		System.out.println("ÇÐ±³¿¡ °©´Ï´Ù.");
	}
	
	public static void main(String[] args) {
		Student lee = new Student();
		lee.grade = 7;
		lee.gotoSchool();
		lee.name = "È«±æµ¿";
		lee.grade = 12;
		lee.move();
	}

}
