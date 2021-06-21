package Menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

//�������α׷�
public class MenuPanel extends JPanel{
	
	JButton[] Mebtn = new JButton[20];  //�迭����
	String str = "C:\\Users\\cheay\\eclipse-workspace\\WindowTest\\src\\images"; //�̹��� ���
	ImageIcon i1 = new ImageIcon(str + "\\���.jpg"); 
	ImageIcon i2 = new ImageIcon(str + "\\�ָԹ�.jpg");  
	ImageIcon i3 = new ImageIcon(str + "\\���.jpg"); 
	ImageIcon i4 = new ImageIcon(str + "\\�쵿.jpg"); 
	ImageIcon i5 = new ImageIcon(str + "\\�ҹ�.jpg"); 
	ImageIcon i6 = new ImageIcon(str + "\\�����α�.jpg");
	ImageIcon i7 = new ImageIcon(str + "\\��ġ�.jpg"); 
	ImageIcon i8 = new ImageIcon(str + "\\�����.jpg"); 
	ImageIcon i9 = new ImageIcon(str + "\\������Į����.jpg");
	ImageIcon i10 = new ImageIcon(str + "\\������.jpg");
	ImageIcon i11 = new ImageIcon(str + "\\�ո���.jpg"); 
	ImageIcon i12 = new ImageIcon(str + "\\��⸸��.jpg");
	ImageIcon i13 = new ImageIcon(str + "\\������.jpg"); 
	ImageIcon i14 = new ImageIcon(str + "\\����.jpg"); 
	ImageIcon i15 = new ImageIcon(str + "\\�����.jpg");
	ImageIcon i16 = new ImageIcon(str + "\\��ġ����.jpg");
	ImageIcon i17 = new ImageIcon(str + "\\�̸�.jpg"); 
	ImageIcon i18 = new ImageIcon(str + "\\�ᱹ��.jpg");
	ImageIcon i19 = new ImageIcon(str + "\\���.jpg");
	ImageIcon i20 = new ImageIcon(str + "\\���Ƕ��̽�.jpg");
	ImageIcon[] menuimg = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, 
						   i11, i12, i13, i14, i15, i16, i17, i18, i19, i20}; //�̹��� �ֱ�
	int[] price = {3000, 2000, 4000, 6000, 6000, 6000, 6000, 6000,6500, 6500, 
				   5000, 4500, 4000, 5000, 6000, 6000, 5500, 6000, 7000, 5500};

	JTextField tf = new JTextField(30);
	JButton[] Pbtn = new JButton[4];
	String[] Str = {"����","���","�ʱ�ȭ"}; //�����ʹ�ư�̸�
	String [] ColName = {"�޴�","����","����"}; //���̸�
	String [][] Row ; //������ �迭
	
	int count=1; //����
	DefaultTableModel model = new DefaultTableModel(Row,ColName);  //table ��� �� ������ ���� ����
	JTable table = new JTable(model);
	
	class Board extends JPanel{
		Board(){
			setBackground(Color.WHITE); //���̺� ����
			DefaultTableModel m = (DefaultTableModel)table.getModel();
			table.setRowHeight(40);  //�޴� �ֹ��ǿ� �߰� �� ���̺� �� ����
			add(new JScrollPane(table)); //���̺� ��ũ�� �߰�
		}
	}
	
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(5,4,3,3)); //�޴� ��ư(�̹��� ����) �迭(20��)
			setBackground(Color.white);//��� �� ���
			for(int i = 0;i < Mebtn.length; i++) {  //��ư ����
				Mebtn[i]= new JButton(menuimg[i]);
				add(Mebtn[i]);
			}
		}
	}
	
	class PayBtn extends JPanel{
		PayBtn(){ //������ư��(4��)
			setBackground(Color.WHITE);
			setLayout(new GridLayout(1,4,3,3)); //������ư �迭
			
			for(int i=0;i<Str.length;i++) {  //��ư ����
				Pbtn[i]= new JButton(Str[i]);
				Pbtn[i].setBackground(Color.PINK);  //��ư ����
				add(Pbtn[i]);
			}
		}
	}
	
	public MenuPanel() {
		setLayout(null); // ��ġ�����ڸ� �������� �ʴ´ٴ��ǹ̷� ���� ��ġ�� ������Ʈ ��Ÿ��(��ġ ���� �ȵǰ�)
		setBackground(Color.WHITE); // ��� ��
		MenuBtn mbtn = new MenuBtn(); 
		PayBtn sbtn = new PayBtn();
		Board bd = new Board();
		String menu[]= {"���", "�ָԹ�","���","�쵿","�ҹ�","�����α�","��ġ�","�����", "������Į����","������",
						"�ո���","��⸸��","������","����","�����", "��ġ����","�̸�","�ᱹ��","���","���Ƕ��̽�"};
		tf.setSize(400, 50);  // �����ݾ� textfieldâ ũ��
		tf.setLocation(25, 480); //â ��ġ
		tf.setText("���� �ݾ�: "); //�⺻�� ����
		add(tf);
		
		bd.setSize(450, 450); //���̺�
		bd.setLocation(480, 23);
		add(bd);
		
		mbtn.setSize(400, 430); //�޴���ư
		mbtn.setLocation(25, 20);
		add(mbtn);
		
		sbtn.setSize(320, 50);  //������ư
		sbtn.setLocation(480, 480);
		add(sbtn);
		
		for(int i = 0; i < Mebtn.length; i++) {
			int index =i;
			Mebtn[i].addActionListener(new ActionListener() { //�͸� Ŭ���� �ۼ� / ActionListener ��ӹް� �ٷ� �޼ҵ� �ۼ�, ���ÿ� new�� �ν��Ͻ��� �����ϴ� ���
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton MBtn = (JButton)e.getSource();
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{menu[index],count,price[index]}); // �� ������
				}
			});
		}
		
		Pbtn[0].addActionListener(new ActionListener() {  //������ư
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				int rowCont = table.getRowCount();
				int sum =0;
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 2); // Ư�� �÷� ��������
				}
				tf.setText(String.valueOf("���� �ݾ�: " + sum));
				//String.valueOf�� �Ķ���Ͱ� null�̸� ���ڿ� "null"�� ���� ��ȯ
			}
		});
		Pbtn[1].addActionListener(new ActionListener() {  //���(�����ϸ� ���)
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				//table.getModel(): JTable�� ���� �ִ� �����͸� ��� �ִ� ��ü�� tablemodel��ü�� ����
				for(int i = 0; i < 20; i++)
				m.removeRow(table.getSelectedRow());
			}
		});
		Pbtn[2].addActionListener(new ActionListener() { //�ʱ�ȭ
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
				tf.setText("���� �ݾ�: ");
			}
		});
	}
	
	public static void main(String[] args) {
		new MenuFrame();
	}
}