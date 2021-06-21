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

//GUI 구성
 BMI_Calculator(){
  super("비만 지수 측정과 당신의 표준체중");
  setLayout(new GridLayout(2,1,5,5)); 
  //입력부분패널
  Panel p1=new Panel();
  p1.setLayout(new BorderLayout()); 
  p1.add(new Label("키(cm)와 몸무게(kg)  입력하시고 아래의 '체크'버튼을 누르세요."),"North");

  Panel p11=new Panel();
  p11.add(new Label("키(cm): "));
  in_height=new TextField(5);
  p11.add(in_height);
  Label l=new Label("몸무게(kg): ");
  p11.add(l);
  in_weight=new TextField(5);
  p11.add(in_weight);
  p1.add(p11,"Center");

  Panel p12=new Panel();  
  enter =new Button("체크");
  //reset =new Button("다시입력");
  enter.addActionListener(this);
  //reset.addActionListener(this);
  p12.add(enter);
  //p12.add(reset);
  p1.add(p12,"South");

  add(p1);
  //결과부분 패널
  Panel p2=new Panel();
  p2.setLayout(new BorderLayout());
  p2.add(new Label("----------- 결 과 보 기 ------------"),"North");
  Panel p21=new Panel();
  //p21.add(new Label("비만지수(BMI):"));
  //reBMI=new TextField(5);
  //p21.add(reBMI);
  //p21.add(new Label("표준체중(kg):"));
  //reWe=new TextField(5);
  //p21.add(reWe);
  p21.add(new Label("BMI로 본 당신의 상태는?"));
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

  if(s.equals("체크")){
   //문자형인 키값을 int형으로 바꾼다.
   height=Double.valueOf(in_height.getText()).doubleValue();
   //표준체중계산
   double N_weight = (height - 100)* 0.9;
   //키값을 cm인 키를 m로 바꾼다.
   height=height/100;
   System.out.println(height);
   weight=Double.valueOf(in_weight.getText()).doubleValue();
   
   //BMI지수 계산
   double BMI = Math.round(weight/(height * height));
  //결과를 추려낸다
   String re=BMI_Check(BMI);
   //결과 출력
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
   BMI_Result="저체중";
  else if(20<=BMI && BMI<25)
   BMI_Result="정상";
  else if(25<=BMI&& BMI<30)
   BMI_Result="과체중";
  else if(BMI<=30)
   BMI_Result="비만";
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
