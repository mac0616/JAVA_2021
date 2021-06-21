package mySwingTest;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	JButton btn;
	JTextField tf1, tf2;
	JLabel lb;
	
	public Calculator() {
		setSize(400, 200);
		setTitle("BMI ����");
		
		GridLayout gu = new GridLayout();
		setLayout(gu);
		JLabel l1 = new JLabel("BMI ����� �����մϴ�");
		add(l1);
		//l1.setBounds(50,10,500,30);
		
		GridLayout gu2 = new GridLayout(2,2);
		setLayout(gu2);
		JLabel l2 = new JLabel("������(kg)");
		 tf1 = new JTextField(20);
		add(l2);
		add(tf1);
		//l2.setBounds(10,50,70,30);
		//tf1.setBounds(100,50,100,30);
	
		JLabel l3 = new JLabel("Ű(m)");
		 tf2 = new JTextField(20);
		add(l3);
		add(tf2);
		//l3.setBounds(10,80,70,30);
		//tf2.setBounds(100,80,100,30);
		
		
		GridLayout gu3 = new GridLayout(2,2);
		setLayout(gu3);
		btn = new JButton("�˻�");
		lb = new JLabel("����� BMI ������ �˷��帳�ϴ�");
		btn.addActionListener(this);
		add(btn);
		add(lb);
		//btn.setBounds(30,120,70,30);
		//lb.setBounds(100,120,200,30);
		
		btn.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(e.getSource() == btn) {
			double m = Integer.parseInt(tf2.getText());
			double kg = Integer.parseInt(tf1.getText());
			double result = kg/(m*m);
			lb.setText(str);
			if(result <20) {
				lb.setText(str + "��ü��");
			} else if(result >= 20 && result < 25) {
				lb.setText(str + "����");
			} else if(result >= 25 && result < 30) {
				lb.setText(str + "��ü��");
			} else if(result >= 29 && result <40) {
				lb.setText(str + "��");
			}else if(result >= 40) { 
				lb.setText(str + "����");
			} 
		}	
	}

	public static void main(String[] args) {
		new Calculator();
	}
	}

