package mySwingTest;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	JButton b1, b2, b3;
	
	public MyFrame() {
		setTitle("������ ó�� ����");
		Container a = getContentPane();
		//a.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 30));  //����
		//a.setLayout(new BorderLayout()); //���ݾ���
		//a.setLayout(new BorderLayout(30,20));  //��������
		a.setLayout(new GridLayout(3, 1, 10, 10));
		a.setBackground(Color.CYAN);
		b1 = new JButton("����");
		b1.setBackground(Color.gray);
		b2 = new JButton("����");
		b2.setBackground(Color.orange);
		b3 = new JButton("����");
		b3.setBackground(Color.red);
		
		a.add(b1); //, BorderLayout.NORTH);
		a.add(b2); //, BorderLayout.SOUTH);
		a.add(b3); //, BorderLayout.WEST);
		
		setSize(200,200);
		setVisible(true);  //������ ȭ�鿡 ���̱�
	}
	
	
	public static void main(String[] args) {
		MyFrame myframe = new MyFrame();

	}

}
