package myAWTTest;

public class Inch2Cm extends Converter {
	private double d;
	public Inch2Cm(double d) {
		this.d=d;
	}

	@Override
	public double convert(double data) {
		return data * 2.54;
	}

	@Override
	public String getSource() {
		return "inch";
	}

	@Override
	public String getDestination() {
		return "cm";
	}
	public static void main(String[] args) {
		 Inch2Cm mycm = new Inch2Cm(2.54);  // 1인치는 2.54cm가 기준입니다.
		  mycm.convert_start() ;
	}

}
