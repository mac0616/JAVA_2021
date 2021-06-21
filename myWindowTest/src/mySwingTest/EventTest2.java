package mySwingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventTest2 extends JFrame implements ActionListener, ItemListener {
	JButton btn;
	JCheckBox cb;
	JTextField tf;
	JLabel lb;
	
	public EventTest2() {
		setTitle("�������� ������ �׽�Ʈ");
		Container s = getContentPane(); 
		s.setLayout(new FlowLayout());
		
		btn = new JButton("cat");
		cb = new JCheckBox("check");
		tf = new JTextField(10);
		lb = new JLabel("�̺�Ʈ�� �����մϴ�.");
		
		btn.addActionListener(this);
		cb.addActionListener(this);
		tf.addActionListener(this);
		
		s.add(btn); s.add(cb); s.add(tf); s.add(lb);
		
		setSize(500, 300);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.SELECTED==1)
			lb.setText("üũ �Ǿ����");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o==btn)
			lb.setText("��ư�� ���Ⱦ��.");
		else if(o==tf)
			lb.setText("�ؽ�Ʈ�� �ԷµǾ����.");
	}

	public static void main(String[] args) {
		new EventTest2();
	}
}
