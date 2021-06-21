package MyTest;

class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

public class ColorTV extends TV {
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printTV() {
		System.out.println(getSize() + "��ġ " + color + "Į�� �ڷ������Դϴ�.");
	}
	
	public static void main(String[] args) {
		 ColorTV tp = new ColorTV(48, 2048);
	      tp.printTV( );
	  }
	}
