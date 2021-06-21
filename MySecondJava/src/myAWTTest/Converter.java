package myAWTTest;
import java.util.Scanner;

abstract class Converter{
      public abstract double convert(double data);
      public abstract String getSource( ); // 변환 전 단위(예: 원)를 문자열로 반환
      public abstract String getDestination( ); // 변환 후 단위(예: 달러)를 문자열로 반환
      
      public void convert_start(){
          Scanner scanner = new Scanner(System.in);
          System.out.println(getSource( ) +"를 "+ getDestination( ) + "로 변환합니다");
          System.out.println(getSource( ) +"를 입력하세요 --->>");
          double  myValue = scanner.nextDouble();
          double  convertValue = convert(myValue);
          System.out.println("변환값은 "+ convertValue + getDestination( ) + "입니다");
          scanner.close();
      }
}