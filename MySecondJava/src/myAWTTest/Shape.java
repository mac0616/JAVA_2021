package myAWTTest;

interface Shape2{
	 final double PI=3.14;
	  void draw();
	  double getArea();
	  default public void redraw(){
	    System.out.print("---�ٽ� �׸��ϴ�.");
	    draw();
	  }
}