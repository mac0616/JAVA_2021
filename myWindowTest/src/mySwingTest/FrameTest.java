package mySwingTest;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FrameTest extends JFrame {
	JButton btn;
	public FrameTest() {
		setTitle("Action �̺�Ʈ ������ ����");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
	new FrameTest();
	}
	
class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		
		if(b.getLabel().equals("Action"))
			b.setLabel("�׼�");
		else
			b.setLabel("Action");
		
	}
	
}
}
	

