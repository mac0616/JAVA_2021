package MyTest;

public class SSComputer1 extends ReComputer{

	static String company = "�Ｚ";
	int year;
	
	public SSComputer1(double screenSize, int year) {
		super(screenSize);
		this.year = year;
	}

	public void printInformation() {
		System.out.println(company + "��ǻ�ʹ� ��ũ������� " + screenSize
				+ "�̰� �����⵵�� " + year + "�� �Դϴ�");
	}

	public static void main(String[] args) {
		SSComputer1 ssc = new SSComputer1(51.5, 2020);
		ssc.printInformation();
	}

}
