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
		System.out.println("(" + getX() + ", " + getY() + ", " + z + ") 점입니다.");
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
	      p.moveUp( ); // z 좌표를 1 증가
	      p.printPoint( );  // x, y, z 좌표를 찍는 메소드입니다.
	      p.move(20, 30); // x를 20으로, y를 30으로 이동
	      p.printPoint( );  // x, y, z 좌표를 찍는 메소드입니다.
	      p.moveDown( ); // z 좌표를 1감소
	      p.printPoint( );  // x, y, z 좌표를 찍는 메소드입니다.
	}

}
