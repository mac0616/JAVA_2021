package myAWTTest;
import java.util.Scanner;

abstract class Converter{
      public abstract double convert(double data);
      public abstract String getSource( ); // ��ȯ �� ����(��: ��)�� ���ڿ��� ��ȯ
      public abstract String getDestination( ); // ��ȯ �� ����(��: �޷�)�� ���ڿ��� ��ȯ
      
      public void convert_start(){
          Scanner scanner = new Scanner(System.in);
          System.out.println(getSource( ) +"�� "+ getDestination( ) + "�� ��ȯ�մϴ�");
          System.out.println(getSource( ) +"�� �Է��ϼ��� --->>");
          double  myValue = scanner.nextDouble();
          double  convertValue = convert(myValue);
          System.out.println("��ȯ���� "+ convertValue + getDestination( ) + "�Դϴ�");
          scanner.close();
      }
}