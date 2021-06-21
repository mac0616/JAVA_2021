package myAWTTest;

interface Daepo {
	void shoot();
}
interface Car{
	void move();
}
public class Tank implements Daepo, Car{

	@Override
	public void shoot() {
		System.out.println("탱크가 포를 쏜다");
	}
	
	@Override
	public void move() {		//아무 것도 선언되지 않음=dummy method
		System.out.println("탱크가 달립니다.");
	}
	
	public static void main(String[] args) {
		Tank myTank = new Tank();
		myTank.shoot();
		myTank.move();
	}	
}
