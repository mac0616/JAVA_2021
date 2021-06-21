package mySwingTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BMI_Calculator extends Frame implements ActionListener
{
 double height,weight;
 TextField in_height,in_weight,reBMI,reWe;
 TextArea ta;
 Button enter;
 String BMI_Result;

//GUI ����
 BMI_Calculator(){
  super("�� ���� ������ ����� ǥ��ü��");
  setLayout(new GridLayout(2,1,5,5)); 
  //�Էºκ��г�
  Panel p1=new Panel();
  p1.setLayout(new BorderLayout()); 
  p1.add(new Label("Ű(cm)�� ������(kg)  �Է��Ͻð� �Ʒ��� 'üũ'��ư�� ��������."),"North");

  Panel p11=new Panel();
  p11.add(new Label("Ű(cm): "));
  in_height=new TextField(5);
  p11.add(in_height);
  Label l=new Label("������(kg): ");
  p11.add(l);
  in_weight=new TextField(5);
  p11.add(in_weight);
  p1.add(p11,"Center");

  Panel p12=new Panel();  
  enter =new Button("üũ");
  //reset =new Button("�ٽ��Է�");
  enter.addActionListener(this);
  //reset.addActionListener(this);
  p12.add(enter);
  //p12.add(reset);
  p1.add(p12,"South");

  add(p1);
  //����κ� �г�
  Panel p2=new Panel();
  p2.setLayout(new BorderLayout());
  p2.add(new Label("----------- �� �� �� �� ------------"),"North");
  Panel p21=new Panel();
  //p21.add(new Label("������(BMI):"));
  //reBMI=new TextField(5);
  //p21.add(reBMI);
  //p21.add(new Label("ǥ��ü��(kg):"));
  //reWe=new TextField(5);
  //p21.add(reWe);
  p21.add(new Label("BMI�� �� ����� ���´�?"));
  ta=new TextArea(1,20);
  p21.add(ta);

  p2.add(p21,"Center");
  
  add(p2);
  in_height.requestFocus();

  addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
 }

 public void actionPerformed(ActionEvent ae) {
  String s=ae.getActionCommand();

  if(s.equals("üũ")){
   //�������� Ű���� int������ �ٲ۴�.
   height=Double.valueOf(in_height.getText()).doubleValue();
   //ǥ��ü�߰��
   double N_weight = (height - 100)* 0.9;
   //Ű���� cm�� Ű�� m�� �ٲ۴�.
   height=height/100;
   System.out.println(height);
   weight=Double.valueOf(in_weight.getText()).doubleValue();
   
   //BMI���� ���
   double BMI = Math.round(weight/(height * height));
  //����� �߷�����
   String re=BMI_Check(BMI);
   //��� ���
   //reBMI.setText(""+BMI);
   //reWe.setText(""+N_weight);
   ta.setText(re);
  }else{
   in_height.setText("");
   in_weight.setText("");
  }
 }

 public String BMI_Check(double BMI){

  if(BMI<20)
   BMI_Result="��ü��";
  else if(20<=BMI && BMI<25)
   BMI_Result="����";
  else if(25<=BMI&& BMI<30)
   BMI_Result="��ü��";
  else if(BMI<=30)
   BMI_Result="��";
  return BMI_Result;
 }

 public static void main(String[] args)
 {
  //BMI_Calculator bmi=
		  new BMI_Calculator();
  //bmi.show();
  //bmi.setSize(400,300);
 }
}
