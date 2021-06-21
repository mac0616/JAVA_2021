package MyTest;

class TV2{
	private int size;
	public TV2(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

public class SmartTV extends TV2 {
	int color;
	int channel;
	boolean internet = true;

	public SmartTV(int size, int color, int channel, boolean internet) {
		super(size);
		this.color = color;
		this.channel = channel;
		this.internet = internet;
	}
	

	public void printTV() {
		System.out.print(getSize() + "��ġ " + color + "Į�� " + channel + "�� ä���� ������ ");
		if(internet == true) {
			System.out.print("���ͳ��� ������ �ڷ������Դϴ�.");
		} else {
			System.out.print("���ͳ��� �Ұ����� �ڷ������Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		SmartTV sp = new SmartTV(48, 2048, 32, true);
		sp.printTV( );
	}

}
