package MyTest;

public class SSComputer1 extends ReComputer{

	static String company = "삼성";
	int year;
	
	public SSComputer1(double screenSize, int year) {
		super(screenSize);
		this.year = year;
	}

	public void printInformation() {
		System.out.println(company + "컴퓨터는 스크린사이즈가 " + screenSize
				+ "이고 제조년도는 " + year + "년 입니다");
	}

	public static void main(String[] args) {
		SSComputer1 ssc = new SSComputer1(51.5, 2020);
		ssc.printInformation();
	}

}
