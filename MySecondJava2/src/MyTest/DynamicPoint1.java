package MyTest;

public class DynamicPoint1 extends Point1{
	String color;
	
	public DynamicPoint1(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		int tempX = x-getX();
		int tempY = y-getY();
		System.out.println("�̵��� ��ġ�� x������ " + tempX + "�̵��� ��ġ�� y������"
				+ tempY + "��ŭ �̵��߽��ϴ�");
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String printInfo() {
		return "(" + getX() + "," + getY() + ") �� " + color + "�Դϴ�";
	}
	
	public static void main(String[] args) {
		DynamicPoint1 dp = new DynamicPoint1(10, 20, "����");
		dp.setXY(20, 50);
		System.out.println(dp.printInfo());
		
	}

}
