package mySwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bmicc extends JFrame { 
	  JLabel kg, m, result; 
	  JTextField tf1, tf2; 
	  JButton btn; 
	  
	  public Bmicc() { 
	    setTitle("BMI 계산기"); 
	    setSize(300, 200); 
	    setDefaultCloseOperation(EXIT_ON_CLOSE); 
	    
	    JLabel l1 = new JLabel("BMI 계산을 시작합니다");
	    JLabel l2 = new JLabel("");
	    
	    kg = new JLabel("몸무게(kg)"); 
	    tf1 = new JTextField(); 
	    m = new JLabel("키(m)"); 
	    tf2 = new JTextField(); 
	    btn = new JButton("검사"); 
	    btn.addActionListener(new MyActionListener()); 
	    result = new JLabel("당신의 BMI 지수를 알려드립니다"); 
	    
	  l1.setBounds(50,10,500,30);
	  kg.setBounds(10,50,70,30);
	  tf1.setBounds(100,50,100,30);
	  m.setBounds(10,80,70,30);
	  tf2.setBounds(100,80,100,30);
	  btn.setBounds(20,120,70,30);
	  result.setBounds(100,120,500,30);
	  l2.setBounds(80, 150, 70 ,30);
	  		
	    add(l1);
	    add(kg); 
	    add(tf1); 
	    add(m); 
	    add(tf2); 
	    add(btn); 
	    add(result); 
	    add(l2);
	    setVisible(true); 
	 } 
	  
	 class MyActionListener implements ActionListener { 
	   @Override 
	   public void actionPerformed(ActionEvent e) { 
	     if(e.getSource() == btn) { 
	       double height = Double.parseDouble(tf1.getText()); 
	       double weight = Double.parseDouble(tf2.getText()); 
	       double bmi = height / (weight * weight / 10000); 
	       
	       String rslt = ""; 
	       if(bmi > 30.0)
	    	   rslt = "고도비만"; 
	       else if(bmi > 25.0) 
	    	   rslt = "비만"; 
	       else if(bmi > 23.0) 
	    	   rslt = "과체중"; 
	       else if(bmi >18.5) 
	    	   rslt = "정상"; 
	       else 
	    	   rslt = "저체중"; 
	       result.setText(rslt); 
	    } 
	 } 
	} 
	 
	public static void main(String[] args) { 
	  new Bmicc(); 
	} 
	} 