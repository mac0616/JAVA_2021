package myAWTTest;

public class Triangle implements Shape2 {
		private int width;
		private int height;
		private double area;
		
		Triangle (int width, int height) {
			this.width=width;
			this.height=height;
			area=this.width*this.height;
		}
		
		public void draw() {
			System.out.println("밑변 " + width+", 높이"+height+"크기의 사각형 입니다.");
		}
		
		public double getArea() {return area;}
	}
