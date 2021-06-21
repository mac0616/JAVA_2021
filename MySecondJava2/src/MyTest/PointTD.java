package MyTest;

class Point2{
    private int x, y;
    public Point2(int x, int y){
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

public class PointTD extends Point2{
	int z;
	
	public PointTD(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void printPoint() {
		System.out.println("(" + getX() + ", " + getY() + ", " + z + ") ���Դϴ�.");
	}
	
	public int moveUp() {
		z=z+1;
		return z;
	}
	
	public int moveDown() {
		z=z-1;
		return z;
	}
	
	public static void main(String[] args) {
		PointTD p = new PointTD(10, 20, 30);
	      p.printPoint( );
	      p.moveUp( ); // z ��ǥ�� 1 ����
	      p.printPoint( );  // x, y, z ��ǥ�� ��� �޼ҵ��Դϴ�.
	      p.move(20, 30); // x�� 20����, y�� 30���� �̵�
	      p.printPoint( );  // x, y, z ��ǥ�� ��� �޼ҵ��Դϴ�.
	      p.moveDown( ); // z ��ǥ�� 1����
	      p.printPoint( );  // x, y, z ��ǥ�� ��� �޼ҵ��Դϴ�.
	}

}
