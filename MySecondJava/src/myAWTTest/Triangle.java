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
			System.out.println("�غ� " + width+", ����"+height+"ũ���� �簢�� �Դϴ�.");
		}
		
		public double getArea() {return area;}
	}
