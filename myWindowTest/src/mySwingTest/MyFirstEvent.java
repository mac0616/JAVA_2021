package mySwingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFirstEvent extends JFrame {
	
	JButton btn;
	
	public MyFirstEvent() {
		setTitle("첫번째 이벤트 실습");
		Container c = getContentPane();
		FlowLayout a = new FlowLayout();
		c.setLayout(a);
		btn = new JButton("누르세요");
		MyActionListener myAction = new MyActionListener();
		btn.addActionListener(myAction);
		c.add(btn);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		//MyFirstEvent myFirst = new MyFirstEvent();  아래와 동일
		new MyFirstEvent();
	}
}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "버튼을 눌렀군요");
	}
	
}
