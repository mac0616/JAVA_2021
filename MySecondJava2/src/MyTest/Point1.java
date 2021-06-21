package MyTest;

public class Point1 {
	private int x, y;
	
	public Point1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void move(int newx, int newy) {
		this.x = newx;
		this.y = newy;
	}
}
