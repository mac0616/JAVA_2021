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
		System.out.println("��ũ�� ���� ���");
	}
	
	@Override
	public void move() {		//�ƹ� �͵� ������� ����=dummy method
		System.out.println("��ũ�� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Tank myTank = new Tank();
		myTank.shoot();
		myTank.move();
	}	
}
