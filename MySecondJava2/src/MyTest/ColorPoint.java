package MyTest;

public class ColorPoint extends Point1{
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String printInfo() {
		return "(" + getX() + "," + getY() + ") ´Â " + color + "ÀÔ´Ï´Ù";
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(10, 20, "»¡°­");
		cp.setXY(20, 50);
		cp.setColor("³ë¶û");
		System.out.println(cp.printInfo());
		
	}

}
