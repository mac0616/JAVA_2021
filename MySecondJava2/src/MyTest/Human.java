package MyTest;

public class Human extends Animal{
	int grade;
	public void gotoShcool() {
		//�޼ҵ�
		System.out.println("�б��� ���ϴ�.");
	}

	public static void main(String[] args) {
		Human sunny = new Human();
		sunny.name="sunny";
		sunny.move();
		sunny.grade = 5;
		sunny.gotoShcool();
	}

}
