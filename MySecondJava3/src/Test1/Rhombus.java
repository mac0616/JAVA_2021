package Test1;

public class Rhombus implements shape {
	public int a, b;
	public Rhombus (int a, int b) {
	this.a=a;
	this.b = b;
	}
	@Override
	public void draw() {
	System.out.println("�غ��� " + a + ", ���̰� " + b +"�� �������Դϴ�.");
	}
	@Override
	public double getArea() {
	return (int)a*b;
	}
	
	public static void main(String[] args) {
		Rhombus rhombus = new Rhombus(5, 6); //�������� 25�� �� ��ü
		rhombus.draw();
		System.out.println("������ " + rhombus.getArea()+"cm�Դϴ�");
		}
}
