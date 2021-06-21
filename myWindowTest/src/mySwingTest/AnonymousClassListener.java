package mySwingTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends Frame {
	public AnonymousClassListener() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getLabel().equals("Action"))
				b.setLabel ("�׼�");
				else
				b.setLabel ("Action");
				setTitle(b.getLabel());
				}
			});
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new AnonymousClassListener();
	}
}
