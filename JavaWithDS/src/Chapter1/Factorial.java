package Chapter1;

public class Factorial {
	public static int factorial(int n) {
		if(n <= 1)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int result;
		result = factorial(4);
		System.out.println(result);
	}
}
