package mySwingTest;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	JButton b1, b2, b3;
	
	public MyFrame() {
		setTitle("윈도우 처음 시작");
		Container a = getContentPane();
		//a.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 30));  //정렬
		//a.setLayout(new BorderLayout()); //간격없음
		//a.setLayout(new BorderLayout(30,20));  //간격있음
		a.setLayout(new GridLayout(3, 1, 10, 10));
		a.setBackground(Color.CYAN);
		b1 = new JButton("시작");
		b1.setBackground(Color.gray);
		b2 = new JButton("중지");
		b2.setBackground(Color.orange);
		b3 = new JButton("종료");
		b3.setBackground(Color.red);
		
		a.add(b1); //, BorderLayout.NORTH);
		a.add(b2); //, BorderLayout.SOUTH);
		a.add(b3); //, BorderLayout.WEST);
		
		setSize(200,200);
		setVisible(true);  //윈도우 화면에 보이기
	}
	
	
	public static void main(String[] args) {
		MyFrame myframe = new MyFrame();

	}

}
