package mySwingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFirstEvent extends JFrame {
	
	JButton btn;
	
	public MyFirstEvent() {
		setTitle("ù��° �̺�Ʈ �ǽ�");
		Container c = getContentPane();
		FlowLayout a = new FlowLayout();
		c.setLayout(a);
		btn = new JButton("��������");
		MyActionListener myAction = new MyActionListener();
		btn.addActionListener(myAction);
		c.add(btn);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		//MyFirstEvent myFirst = new MyFirstEvent();  �Ʒ��� ����
		new MyFirstEvent();
	}
}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "��ư�� ��������");
	}
	
}
