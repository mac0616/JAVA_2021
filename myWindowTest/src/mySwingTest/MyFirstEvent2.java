package mySwingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFirstEvent2 extends JFrame implements ActionListener  {
	JButton btn;
	
	public MyFirstEvent2() {
		setTitle("ù��° �̺�Ʈ �ǽ�");
		Container c = getContentPane();
		FlowLayout a = new FlowLayout();
		c.setLayout(a);
		btn = new JButton("��������");
		btn.addActionListener(this);
		c.add(btn);
		setSize(300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "��ư�� ��������");
	}

	public static void main(String[] args) {
		new MyFirstEvent2();
	}
}

