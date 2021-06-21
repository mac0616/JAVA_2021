package mySwingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventTest extends JFrame implements ActionListener {
	JButton btn1, btn2;
	JLabel lb;
	
	public EventTest() {
		setTitle("�������� ������ �׽�Ʈ");
		Container s = getContentPane();
		s.setLayout(new FlowLayout());
		
		btn1 = new JButton("cat");
		btn2 = new JButton("dog");
		lb = new JLabel("��ư�� ��������");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		s.add(btn1); s.add(btn2); s.add(lb);
		setSize(500, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		lb.setText(str + "��ư");
	}

	public static void main(String[] args) {
		new EventTest();

	}
}
