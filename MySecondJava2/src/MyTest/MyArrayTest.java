package MyTest;

public class MyArrayTest {
	public static void main(String[] args) {
		//정수배열에 5개의 값이 있을 때 평균을 내시오
		int myInt[] = new int[5];
		myInt[0]=50;
		myInt[1]=65;
		myInt[2]=87;
		myInt[3]=95;
		myInt[4]=90;
		
		int i=0, sum=0;
		for(i=0; i<myInt.length; i++) {
			sum=sum+myInt[i];
		}
		float average = (float)sum/myInt.length;
		System.out.println("평균값은: " + average);
	}
}
