package Menu;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//JFrame�� ��ӹް� ��ü������ ActionListener �� �����ؼ� �̺�Ʈ ó��
public class MenuScreen extends JFrame implements ActionListener {
	JPanel p1 = new JPanel(); // TextLabel �г�
	JPanel p2 = new JPanel();
	
	JLabel ml = new JLabel(); // �޽��� ���
	
	JTextField t1 = new JTextField(15); // �Է� ���
	JTextField t2 = new JTextField(15);
	
	JComboBox cb; // ���� �ڵ� ����
	
	JTextArea ta; // ������ ���

	JButton b1 = new JButton("���/����"); //��ư
	JButton b2 = new JButton("��ȸ");
	JButton b3 = new JButton("����");
	JButton b4 = new JButton("�ݱ�");

	MenuDAO dao = new MenuDAO(); // �����ͺ��̽� ���� Ŭ���� �ν��Ͻ� ����
	
	Menu menu; // ��ǰ���� ����� ���� ��ǰ �ν��Ͻ� ����
	
	ArrayList<Menu> datas = new ArrayList<Menu>(); // ��ü ��ǰ ��� ����� ���� ArrayList
	
	boolean editmode; // ���� �Ǵ� ��� ���
	
	public void startUI() {
		ml.setText("������ ȭ��");
		ml.setEnabled(false);
	
		p1.setLayout(new GridLayout(5,2,2,2)); // ��� ��ġ�� ���� �г� ���̾ƿ� ����
	
		JLabel l1 = new JLabel("��ȣ"); // ��Ŀ� ���� �� ����
		JLabel l2 = new JLabel("�޴�");
		JLabel l3 = new JLabel("����");
	
		cb = new JComboBox();
		ta = new JTextArea(10, 15);
		JScrollPane scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
											 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		refreshData(); // ȭ�� ������ ����
		
		b1.addActionListener(this); // �̺�Ʈ ������ ���
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p1.add(l1); p1.add(cb); p1.add(l2); p1.add(t1); p1.add(l3); p1.add(t2);
		p2.add(b1); p2.add(b2); p2.add(b3); p2.add(b4);
		b4.setBackground(Color.red);
	
		add(ml, BorderLayout.WEST); // ���� �����ӿ� �г� �� ������Ʈ ��ġ
		add(p1, BorderLayout.EAST);
		add(scroll, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
	
		setResizable(false);
		setVisible(true);
	}
	
	//��ü ������ ��� ��� �� ���� ������
	public void refreshData() {
		ta.setText("");
		clearField();
		editmode = false;
		ta.append("   ��ȣ\t\t�޴�\t\t����\n");
		datas = dao.getAll();
		
		// ������ ���� �� �޺��ڽ� ������ ����
		cb.setModel(new DefaultComboBoxModel(dao.getItems()));
		if (datas != null) {
			// ArrayList�� ��ü �����͸� ���Ŀ� ���� ���
			for (Menu p : datas) {
				StringBuffer sb = new StringBuffer();
				sb.append("   "+ p.getNo() + "\t\t");
				sb.append(p.getMenu() + "\t\t");
				sb.append(p.getPrice() + "\n");
				ta.append(sb.toString());
			}
		} else {
			ta.append("���� �޴��Դϴ�. ���ο� �޴��� ������ּ���.");
		}
	}
	
	public void clearField() {
		t1.setText("");
		t2.setText("");
	}
	
	public MenuScreen() {
		super("������ �޴�����ȭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(20, 20));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 450);startUI();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// ��� ��ư�� ���, ��ϰ� ������ ���Ͽ� ó��
		if (obj == b1) {
			menu = new Menu();
			menu.setMenu(t1.getText());
			menu.setPrice(Integer.parseInt(t2.getText()));
			// ����
			if (editmode == true) {
				menu.setNo(Integer.parseInt((String) cb.getSelectedItem()));
				if (dao.updateMenu(menu)) {
					ml.setText("�޴� ������ �����߽��ϴ�.");
					clearField();
					editmode = false;
				} else
					ml.setText("�޴� ���� ������ �����߽��ϴ�.");
			}
			// ���
			else {
				if (dao.newMenu(menu)) {
					ml.setText("���ο� �޴��� ����߽��ϴ�.");
				} else
					ml.setText("�޴� ��Ͽ� �����߽��ϴ�.");
			}
			refreshData();
		}
		// ��ȸ ��ư
		else if (obj == b2) {
			String s = (String) cb.getSelectedItem();
			if (!s.equals("��ü")) {
				menu = dao.getMenu(Integer.parseInt(s));
				if (menu != null) {
					ml.setText("�޴� ������ ��ȸ�մϴ�.");
					t1.setText(menu.getMenu());
					t2.setText(String.valueOf(menu.getPrice()));
					editmode = true;
				} else {
					ml.setText("��ȸ�� �� ���� �޴��Դϴ�.");
				}
			} else
				refreshData();
		}
		// ���� ��ư
		else if (obj == b3) {
			String s = (String) cb.getSelectedItem();
			if (s.equals("��ü")) {
				ml.setText("��ü ������ �Ұ��մϴ�.");
			} else {
				if (dao.delMenu(Integer.parseInt(s))) {
					ml.setText("�޴��� �����Ǿ����ϴ�.");
				} else {
					ml.setText("�޴��� �������� �ʾҽ��ϴ�.");
				}
			}
		}
		// ������
		else if (obj == b4) {
			dispose();
		}
	}
	public static void main(String[] args) {
	}
}