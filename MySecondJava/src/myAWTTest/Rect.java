package myAWTTest;
public class Rect implements Shape2 {
	private int radius1;
	private int height2;
	private double area;
	
	Rect (int radius1, int height2) {
		this.radius1=radius1;
		this.height2=height2;
		area=radius1*height2;
	}
	public void draw() {
		System.out.println("가로 "+radius1+", 세로"+height2+"크기의 사각형입니다.");
	}
	public double getArea() {
		return area;
	}
	public static void main(String[] args) {
		Shape2 [] list= new Shape2[3];
		list[0]= new Circle(25);
		list[1]= new Rect(5, 12);
		list[2]= new Triangle(10, 5);
		
		for (int i=0; i<list.length; i++)
			list[i].redraw();
		for (int i=0; i<list.length;i++)
			System.out.println("면적은 "+list[i].getArea()+"cm입니다.");
	}

}