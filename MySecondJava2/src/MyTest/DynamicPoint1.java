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
		System.out.println("이동한 위치는 x축으로 " + tempX + "이동한 위치는 y축으로"
				+ tempY + "만큼 이동했습니다");
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String printInfo() {
		return "(" + getX() + "," + getY() + ") 는 " + color + "입니다";
	}
	
	public static void main(String[] args) {
		DynamicPoint1 dp = new DynamicPoint1(10, 20, "빨강");
		dp.setXY(20, 50);
		System.out.println(dp.printInfo());
		
	}

}
