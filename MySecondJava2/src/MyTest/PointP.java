package MyTest;
class Point3{
    private int x, y;
    public Point3(int x, int y){
        this.x =x;  
        this.y=y;
    }
    
    public int getX( ){ 
    	return x;  
    }
    public void setX(int x ){
    	this.x=x;  
    }

    public int getY( ){
    	return y;  
    }  
    public void setY(int y ){
    	this.y=y;  
    }

    public void move(int newX, int newY){
        this.x = newX; 
        this.y=newY;
    }
 }

public class PointP extends Point2 {

	public PointP(int x, int y) {
		super(x, y);
	}
	public void move() {
	int temp = getX();
	setX(getY());
	setY(temp);
	return;
	}
	
	public void printPoint() {
		if (getX()<0)  {
			setX(getX()*-1);
		}
		if (getY()<0)  {
			setY(getY()*-1);
		}
		System.out.println("(" + getX() + ", " + getY() + ") 점입니다.");
	}
	
	public static void main(String[] args) {
		 PointP p = new PointP(10, 20);   //x는 10, y는 20로 초기화합니다.
	      p.move(20, 30); // x를 20으로, y를 30으로 이동
	      p.printPoint( );  // x, y 좌표를 찍는 메소드입니다.
	      p.move(-20, -30); 
	      p.printPoint( );  // x, y 좌표를 찍는 메소드입니다.
	  }
}
