package myAWTTest;

public class Circle implements Shape2 {
	private int radius;
	private double area;
	
	Circle (int radius) {
		this.radius=radius;
		area=this.radius*this.radius*PI;
	}
	
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}

	public double getArea() {
		return area;
	}
}



