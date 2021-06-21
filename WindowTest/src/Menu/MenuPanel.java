package Menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

//메인프로그램
public class MenuPanel extends JPanel{
	
	JButton[] Mebtn = new JButton[20];  //배열선언
	String str = "C:\\Users\\cheay\\eclipse-workspace\\WindowTest\\src\\images"; //이미지 경로
	ImageIcon i1 = new ImageIcon(str + "\\김밥.jpg"); 
	ImageIcon i2 = new ImageIcon(str + "\\주먹밥.jpg");  
	ImageIcon i3 = new ImageIcon(str + "\\라면.jpg"); 
	ImageIcon i4 = new ImageIcon(str + "\\우동.jpg"); 
	ImageIcon i5 = new ImageIcon(str + "\\소바.jpg"); 
	ImageIcon i6 = new ImageIcon(str + "\\떡만두국.jpg");
	ImageIcon i7 = new ImageIcon(str + "\\김치찌개.jpg"); 
	ImageIcon i8 = new ImageIcon(str + "\\된장찌개.jpg"); 
	ImageIcon i9 = new ImageIcon(str + "\\바지락칼국수.jpg");
	ImageIcon i10 = new ImageIcon(str + "\\육개장.jpg");
	ImageIcon i11 = new ImageIcon(str + "\\왕만두.jpg"); 
	ImageIcon i12 = new ImageIcon(str + "\\고기만두.jpg");
	ImageIcon i13 = new ImageIcon(str + "\\떡볶이.jpg"); 
	ImageIcon i14 = new ImageIcon(str + "\\라볶이.jpg"); 
	ImageIcon i15 = new ImageIcon(str + "\\비빔밥.jpg");
	ImageIcon i16 = new ImageIcon(str + "\\잔치국수.jpg");
	ImageIcon i17 = new ImageIcon(str + "\\쫄면.jpg"); 
	ImageIcon i18 = new ImageIcon(str + "\\콩국수.jpg");
	ImageIcon i19 = new ImageIcon(str + "\\돈까스.jpg");
	ImageIcon i20 = new ImageIcon(str + "\\오므라이스.jpg");
	ImageIcon[] menuimg = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, 
						   i11, i12, i13, i14, i15, i16, i17, i18, i19, i20}; //이미지 넣기
	int[] price = {3000, 2000, 4000, 6000, 6000, 6000, 6000, 6000,6500, 6500, 
				   5000, 4500, 4000, 5000, 6000, 6000, 5500, 6000, 7000, 5500};

	JTextField tf = new JTextField(30);
	JButton[] Pbtn = new JButton[4];
	String[] Str = {"결제","취소","초기화"}; //결제쪽버튼이름
	String [] ColName = {"메뉴","수량","가격"}; //열이름
	String [][] Row ; //이차원 배열
	
	int count=1; //수량
	DefaultTableModel model = new DefaultTableModel(Row,ColName);  //table 사용 시 리모콘 같은 역할
	JTable table = new JTable(model);
	
	class Board extends JPanel{
		Board(){
			setBackground(Color.WHITE); //테이블 배경색
			DefaultTableModel m = (DefaultTableModel)table.getModel();
			table.setRowHeight(40);  //메뉴 주문판에 추가 시 테이블 열 높이
			add(new JScrollPane(table)); //테이블에 스크롤 추가
		}
	}
	
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(5,4,3,3)); //메뉴 버튼(이미지 들어간거) 배열(20개)
			setBackground(Color.white);//배경 색 흰색
			for(int i = 0;i < Mebtn.length; i++) {  //버튼 삽입
				Mebtn[i]= new JButton(menuimg[i]);
				add(Mebtn[i]);
			}
		}
	}
	
	class PayBtn extends JPanel{
		PayBtn(){ //결제버튼란(4개)
			setBackground(Color.WHITE);
			setLayout(new GridLayout(1,4,3,3)); //결제버튼 배열
			
			for(int i=0;i<Str.length;i++) {  //버튼 삽입
				Pbtn[i]= new JButton(Str[i]);
				Pbtn[i].setBackground(Color.PINK);  //버튼 색깔
				add(Pbtn[i]);
			}
		}
	}
	
	public MenuPanel() {
		setLayout(null); // 배치관리자를 지정하지 않는다는의미로 절대 위치로 컴포넌트 나타냄(위치 변경 안되게)
		setBackground(Color.WHITE); // 배경 색
		MenuBtn mbtn = new MenuBtn(); 
		PayBtn sbtn = new PayBtn();
		Board bd = new Board();
		String menu[]= {"김밥", "주먹밥","라면","우동","소바","떡만두국","김치찌개","된장찌개", "바지락칼국수","육개장",
						"왕만두","고기만두","떡볶이","라볶이","비빔밥", "잔치국수","쫄면","콩국수","돈까스","오므라이스"};
		tf.setSize(400, 50);  // 결제금액 textfield창 크기
		tf.setLocation(25, 480); //창 위치
		tf.setText("결제 금액: "); //기본값 지정
		add(tf);
		
		bd.setSize(450, 450); //테이블
		bd.setLocation(480, 23);
		add(bd);
		
		mbtn.setSize(400, 430); //메뉴버튼
		mbtn.setLocation(25, 20);
		add(mbtn);
		
		sbtn.setSize(320, 50);  //결제버튼
		sbtn.setLocation(480, 480);
		add(sbtn);
		
		for(int i = 0; i < Mebtn.length; i++) {
			int index =i;
			Mebtn[i].addActionListener(new ActionListener() { //익명 클래스 작성 / ActionListener 상속받고 바로 메소드 작성, 동시에 new로 인스턴스를 생성하는 경우
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton MBtn = (JButton)e.getSource();
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{menu[index],count,price[index]}); // 행 더해줌
				}
			});
		}
		
		Pbtn[0].addActionListener(new ActionListener() {  //결제버튼
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				int rowCont = table.getRowCount();
				int sum =0;
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 2); // 특정 컬럼 가져오기
				}
				tf.setText(String.valueOf("결제 금액: " + sum));
				//String.valueOf은 파라미터가 null이면 문자열 "null"을 만들어서 반환
			}
		});
		Pbtn[1].addActionListener(new ActionListener() {  //취소(선택하면 취소)
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				//table.getModel(): JTable이 갖고 있는 데이터를 담고 있는 객체인 tablemodel객체가 리턴
				for(int i = 0; i < 20; i++)
				m.removeRow(table.getSelectedRow());
			}
		});
		Pbtn[2].addActionListener(new ActionListener() { //초기화
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
				tf.setText("결제 금액: ");
			}
		});
	}
	
	public static void main(String[] args) {
		new MenuFrame();
	}
}