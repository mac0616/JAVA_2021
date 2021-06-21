package MyTest;

public class Human extends Animal{
	int grade;
	public void gotoShcool() {
		//메소드
		System.out.println("학교에 갑니다.");
	}

	public static void main(String[] args) {
		Human sunny = new Human();
		sunny.name="sunny";
		sunny.move();
		sunny.grade = 5;
		sunny.gotoShcool();
	}

}
