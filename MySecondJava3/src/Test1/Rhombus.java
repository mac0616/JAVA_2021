package Test1;

public class Rhombus implements shape {
	public int a, b;
	public Rhombus (int a, int b) {
	this.a=a;
	this.b = b;
	}
	@Override
	public void draw() {
	System.out.println("밑변이 " + a + ", 높이가 " + b +"인 마름모입니다.");
	}
	@Override
	public double getArea() {
	return (int)a*b;
	}
	
	public static void main(String[] args) {
		Rhombus rhombus = new Rhombus(5, 6); //반지름이 25인 원 객체
		rhombus.draw();
		System.out.println("면적은 " + rhombus.getArea()+"cm입니다");
		}
}
