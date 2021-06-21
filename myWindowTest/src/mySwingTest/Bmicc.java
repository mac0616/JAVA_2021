package mySwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bmicc extends JFrame { 
	  JLabel kg, m, result; 
	  JTextField tf1, tf2; 
	  JButton btn; 
	  
	  public Bmicc() { 
	    setTitle("BMI ����"); 
	    setSize(300, 200); 
	    setDefaultCloseOperation(EXIT_ON_CLOSE); 
	    
	    JLabel l1 = new JLabel("BMI ����� �����մϴ�");
	    JLabel l2 = new JLabel("");
	    
	    kg = new JLabel("������(kg)"); 
	    tf1 = new JTextField(); 
	    m = new JLabel("Ű(m)"); 
	    tf2 = new JTextField(); 
	    btn = new JButton("�˻�"); 
	    btn.addActionListener(new MyActionListener()); 
	    result = new JLabel("����� BMI ������ �˷��帳�ϴ�"); 
	    
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
	    	   rslt = "����"; 
	       else if(bmi > 25.0) 
	    	   rslt = "��"; 
	       else if(bmi > 23.0) 
	    	   rslt = "��ü��"; 
	       else if(bmi >18.5) 
	    	   rslt = "����"; 
	       else 
	    	   rslt = "��ü��"; 
	       result.setText(rslt); 
	    } 
	 } 
	} 
	 
	public static void main(String[] args) { 
	  new Bmicc(); 
	} 
	} 