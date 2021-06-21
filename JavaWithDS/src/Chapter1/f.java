package Chapter1;
public class f{
public static int test(String s, int last) {
	if (last<0) {
		return 0;
	}
	if (s.charAt(last) == '0') {
		return 2 * test(s, last-1);
	}
	return 1+2 * test(s, last-1);
}
	public static void main(String[] args) {
		int result;
		result = test("110100111", 4);
		System.out.println(result);
	}
}

