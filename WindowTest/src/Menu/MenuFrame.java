package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MenuFrame extends JFrame implements ActionListener{
	MenuDAO dao = new MenuDAO();
	JButton btn3 = new JButton("������");  //����Ʈ��(GUI������Ʈ���� �����Ǵ� ����)�� ������Ʈ �ޱ�
	
	
	public void actionPerformed(ActionEvent e) {  //Ŭ����
		Object obj = e.getSource();
		if(obj == btn3) {  //������ ��ư Ŭ�� ��
			new MenuScreen();  //menuscreenȭ�� ��������
		}
	}
	
	public MenuFrame() {
		setTitle("�޴� ����");  //����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������ â ���� �� ���μ����� ����
		setContentPane(new MenuPanel());   //����Ʈ�� ����
		setSize(970,600);  //������ ũ��
		setVisible(true);  //�������� ȭ�鿡 ��Ÿ�� ���ΰ�
		btn3.addActionListener(this);
		btn3.setSize(100, 50); //��ư ũ��
		btn3.setLocation(802, 480);  //��ư ��ġ
		btn3.setBackground(Color.yellow);  //��ư ��
		add(btn3);  //����Ʈ�ҿ� ������Ʈ �ޱ�
	}
}
