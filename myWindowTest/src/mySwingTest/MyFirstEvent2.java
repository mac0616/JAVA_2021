package mySwingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFirstEvent2 extends JFrame implements ActionListener  {
	JButton btn;
	
	public MyFirstEvent2() {
		setTitle("첫번째 이벤트 실습");
		Container c = getContentPane();
		FlowLayout a = new FlowLayout();
		c.setLayout(a);
		btn = new JButton("누르세요");
		btn.addActionListener(this);
		c.add(btn);
		setSize(300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "버튼을 눌렀군요");
	}

	public static void main(String[] args) {
		new MyFirstEvent2();
	}
}

