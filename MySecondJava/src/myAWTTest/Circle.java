package myAWTTest;

public class Circle implements Shape2 {
	private int radius;
	private double area;
	
	Circle (int radius) {
		this.radius=radius;
		area=this.radius*this.radius*PI;
	}
	
	public void draw() {
		System.out.println("�������� "+radius+"�� ���Դϴ�.");
	}

	public double getArea() {
		return area;
	}
}



