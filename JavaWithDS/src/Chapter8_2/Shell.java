package Chapter8_2;

import java.lang.Comparable;

public class Shell {
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 4;
		while (h >= 1) {
			for(int i = h; i < N; i++) {
				for(int j = i; j >= h && isless(a[j], a[j-h]); j -= h) {
					swap(a, j, j-h);
				}
			}
			h /=3;
		}
	}
	private static boolean isless(Comparable i, Comparable j) {
		return (i.compareTo(j) < 0);
	}
	
	private static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void sort(int[] a) {
		// TODO Auto-generated method stub
		
	}
}