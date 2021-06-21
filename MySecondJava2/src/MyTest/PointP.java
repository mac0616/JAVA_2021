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
		System.out.println("(" + getX() + ", " + getY() + ") ���Դϴ�.");
	}
	
	public static void main(String[] args) {
		 PointP p = new PointP(10, 20);   //x�� 10, y�� 20�� �ʱ�ȭ�մϴ�.
	      p.move(20, 30); // x�� 20����, y�� 30���� �̵�
	      p.printPoint( );  // x, y ��ǥ�� ��� �޼ҵ��Դϴ�.
	      p.move(-20, -30); 
	      p.printPoint( );  // x, y ��ǥ�� ��� �޼ҵ��Դϴ�.
	  }
}
