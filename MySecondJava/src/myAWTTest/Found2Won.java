package myAWTTest;

public class Found2Won extends Converter {
	private double d;
	public Found2Won(double d) {
		this.d=d;
	}

	@Override
	public double convert(double data) {
		return data * 1571;
	}

	@Override
	public String getSource() {
		return "파운드";
	}

	@Override
	public String getDestination() {
		return "원화";
	}
	public static void main(String[] args) {
		Found2Won mywon = new Found2Won(1571.0);
		mywon.convert_start() ;
	}

}

