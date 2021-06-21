package WindowProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// ���� ���α׷�, JFrame �� ��ӹް� ��ü������ ActionListener �� �����ؼ� �̺�Ʈ ó��
public class MenuEx extends JFrame implements ActionListener{
	// ȭ�� ������ ���� �г� ����
	JPanel p1 = new JPanel(); // Lable�� TextFiled �г�
	JPanel p3 = new JPanel(); // ��ư �г�

	JLabel ml = new JLabel(); //�޽��� ��� Label
	
	// �Է¾�Ŀ� ���� �ؽ�Ʈ �ʵ�
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JTextField t3 = new JTextField(10);
	JTextField t4 = new JTextField(10);
	
	// ���� �ڵ� ������ ���� �޺��ڽ�
	JComboBox cb;
	
	// ������ ����� ���� �ؽ�Ʈ����
	JTextArea ta;
	
	// �޴� ��ư
	JButton b1 = new JButton("ADD"); 
	JButton b2 = new JButton("SEARCH");
	JButton b3 = new JButton("DELETE");
 
	 // �����ͺ��̽� ���� Ŭ���� �ν��Ͻ� ����
	MenuDAO dao = new MenuDAO();

	// ��ǰ���� ����� ���� ��ǰ �ν��Ͻ� ����
	Menu menu;

	// ��ü ��ǰ��� ����� ���� ArrayList ����
	ArrayList<Menu> datas = new ArrayList<Menu>();
	boolean editmode;
	
	// ���� UI ���� �޼���
	public void startUI() {
	ml.setText("�޴���õ���α׷�");
	ml.setEnabled(false);
	
	// ��� ��ġ�� ���� �г� ���̾ƿ� ����
	p1.setLayout(new GridLayout(4,1));
	//p2.setLayout(new GridLayout(5,1,5,5));
	
	// ��Ŀ� ���� �� ����
	JLabel l1 = new JLabel("NO");
	JLabel l2 = new JLabel("CATEGORY");
	JLabel l3 = new JLabel("RESTAURANT");
	JLabel l4 = new JLabel("MENU");
	JLabel l5 = new JLabel("PRICE");
	
	// ��Ŀ� ���� �޺��ڽ��� �ؽ�Ʈ ���� �ʱ�ȭ
	cb = new JComboBox();
	ta = new JTextArea(15,50);
	JScrollPane scroll = new JScrollPane (ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
											  JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scroll);
	
	// ȭ�� ������ ����
	refreshData();
	
	// �̺�Ʈ ������ ���
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	// �гο� ������Ʈ �߰�
	//p1.add(l1); p1.add(l2); p1.add(l3); p1.add(l4); p1.add(l5);
	//p2.add(cb); p2.add(t1); p2.add(t2); p2.add(t3); p2.add(t4);
	//p3.add(b1); p3.add(b2); p3.add(b3);
	
	p1.add(l1); p1.add(cb); 
	p1.add(l2); p1.add(t1); 
	p1.add(l3); p1.add(t2); 
	p1.add(l4); p1.add(t3); 
	p1.add(l5); p1.add(t4); 
	p3.add(b1); p3.add(b2); p3.add(b3);
	// ���� �����ӿ� �г� �� ������Ʈ ��ġ
	add(ml,BorderLayout.WEST); //�޽��� ����
	add(p1,BorderLayout.WEST);
	add(scroll,BorderLayout.SOUTH);
	add(p3,BorderLayout.CENTER);
	setResizable(false);
	setVisible(true);
}
	
	// ��ü ������ ��� ��� �� ���� �޼���
	public void refreshData() {
	//ta.setText("");
	clearField();
	editmode=false;
	ta.append("  No\tCATEGORY\tRESTAURANT\t\tMENU\tPRICE\n");
	datas = dao.getAll();
	// �����ͺ���� �޺��ڽ� ������ ����
	cb.setModel(new DefaultComboBoxModel(dao.getItems()));
	if(datas != null) {
		// ArrayList �� ��ü �����͸� ���Ŀ� ���� ���
		for(Menu m : datas) {
			StringBuffer sb = new StringBuffer();
			sb.append("  " + m.getNo() + "\t");
			sb.append(m.getCategory() + "\t");
			sb.append(m.getRestaurant() + "\t\t");
			sb.append(m.getMenu() + "\t");
			sb.append(m.getPrice() + "\t");
			ta.append(sb.toString());
		}
	}
	else {
		ta.append("��ϵ� �޴��� �����ϴ�.");
	}
}
	
// ������, ������ �ʱ�ȭ
public MenuEx() {
	super("�޴� ���α׷�");
	setLayout(new BorderLayout(20,20));
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(800,500);
}

// ���, ����, ��ü ��� ��ȸ�� �ʵ� �ʱ�ȭ
public void clearField() {
	t1.setText("");
	t2.setText("");
	t3.setText("");
}

// �̺�Ʈ �߻� ó�� �޼���
 public void actionPerformed(ActionEvent e) {
	 Object obj = e.getSource();
	 // ��� ��ư�� ���, ��ϰ� ������ ���ؼ� ó����.
	 if(obj == b1) {
		 menu = new Menu();
		 menu.setCategory(t1.getText());
		 menu.setRestaurant(t2.getText());
		 menu.setMenu(t3.getText());
		 menu.setPrice(Integer.parseInt(t4.getText()));
 
		 if(editmode == true) {
			 menu.setNo(Integer.parseInt((String)cb.getSelectedItem()));
			 if(dao.newMenu(menu)) {
				 ml.setText("���ο� �޴��� ����߽��ϴ�.");
			 }
			 else
				 ml.setText("�޴� ��Ͽ� �����߽��ϴ�.");
		 }
		 // ȭ�� ������ ����
		 refreshData();
	 }
	 // ��ȸ ��ư�� ���
	 else if(obj == b2) {
		 String s = (String)cb.getSelectedItem();
		 if(!s.equals("All")) {
			 menu = dao.getMenu(Integer.parseInt(s));
			 if(menu != null) {
				 ml.setText("�����Ͻ� �޴��� ��ȸ�մϴ�.");
				 t1.setText(menu.getCategory());
				 t3.setText(menu.getMenu());
				 t4.setText(String.valueOf(menu.getPrice())); 
				 editmode = true;
			 }
			 else {
				 ml.setText("�����Ͻ� �޴� ��ȸ�� �����Ͽ����ϴ�."); 
			 } 
		 }
		 else {
			 // ȭ�� ������ ����
			 refreshData();
		 }
	 }
	 // ���� ��ư�� ���
	 else if(obj == b3) {
		 String s = (String)cb.getSelectedItem();
		 if(s.equals("All")) {
			 ml.setText("��ü ������ �Ұ����մϴ�.");
		 } else {
			 if(dao.delMenu(Integer.parseInt(s))) {
				 ml.setText("�����Ͻ� �޴��� �����Ǿ����ϴ�.");
			 }
			 else {
				 ml.setText("�����Ͻ� �޴��� �������� �ʾҽ��ϴ�."); 
			 } 
		 }
		 refreshData();
	 }
 }
 
public static void main(String[] args) {
	MenuEx pm = new MenuEx();
	pm.startUI();
	}
}