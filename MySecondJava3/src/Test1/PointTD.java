package Test1;

class Point{
	 private int x;
	private int y;
	 public Point(int x, int y){
	 this.x =x; this.y=y;
	 }
	 public int getX( ){ return x; } public void setX(int x ){this.x=x; }
	 public int getY( ){ return y; } public void setY(int y ){this.y=y; }
	 public void move(int newX, int newY){
	 this.x = newX; this.y=newY;
	 }
	}

	public class PointTD extends Point{
	int z;
	public PointTD(int x, int y, int z) {
	super(x, y);
	this.z = z;
	}
	public void moveUp( ) {
	setX(getX() + 1);
	setY(getY() + 1);
	z++;
	}
	public void moveDown( ) {
	setX(getX() -1);
	setY(getY() - 1);
	z--;
	}
	public void printPoint() {
	 System.out.println("("+getX()+","+getY()+","+z+")"+" ���Դϴ�.");
	}
	public static void main(String[] args) {
	PointTD p = new PointTD(1, 2, 3); 
	 p.printPoint( ); // x, y, z ��ǥ�� ��� �޼ҵ��Դϴ�.
	 p.moveUp( ); // z ��ǥ�� 1 ����
	 p.printPoint( ); // x, y, z ��ǥ�� ��� �޼ҵ��Դϴ�.
	 p.moveDown(); // x�� 20����, y�� 30���� �̵�
	 p.printPoint( ); // x, y, z ��ǥ�� ��� �޼ҵ��Դϴ�.
	}
	}