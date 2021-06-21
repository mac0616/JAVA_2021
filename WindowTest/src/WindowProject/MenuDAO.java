package WindowProject;

import java.sql.*;
import java.util.*;

public class MenuDAO {
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcURL = "jdbc:mysql://localhost/menudb";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	Vector<String> items = null;
	String sql;
	
	// �޺��ڽ��� ��ǰ���� ��ȣ ����� ���� ���� ����
	public Vector<String> getItems() {
	return items;
	}
	
	// ��ü ��ǰ ����� ������ ���� �޼���
	public ArrayList<Menu> getAll() {
	connectDB();
	sql = "select * from menus";
	
	//��ü �˻� �����͸� �����ϱ� ���� ArrayList
	ArrayList<Menu> datas = new ArrayList<Menu>();
	
	// �����ڵ� �޺��ڽ� �����͸� ���� ���� �ʱ�ȭ
	items = new Vector<String>();
	items.add("��ü");
	
	try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		// �˻��� �����ͼ� ��ŭ ������ ���� Product ��ü�� ����� �̸� �ٽ� ArrayList �� �߰���. 
		while(rs.next()) {
			Menu m = new Menu();
			m.setNo(rs.getInt("No"));
			m.setCategory(rs.getString("Category"));
			m.setRestaurant(rs.getString("Restaurant"));
			m.setMenu(rs.getString("Menu"));
			m.setPrice(rs.getInt("Price"));
			datas.add(m);
			items.add(String.valueOf(rs.getInt("no")));
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
		return null;
	}
	finally {
		closeDB();
	}
	return datas;
	}
	
// ������ ��ǰ �ڵ忡 �ش��ϴ� ��ǰ ������ ������ ���� �޼���
public Menu getMenu(int no) {
	connectDB();
	sql = "select * from menus where no=?";
	Menu p = null;
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, no);
		rs = pstmt.executeQuery();
		rs.next();
		p = new Menu();
		p.setNo(rs.getInt("No"));
		p.setCategory(rs.getString("Category"));
		p.setRestaurant(rs.getString("Restaurant"));
		p.setMenu(rs.getString("Menu"));
		p.setPrice(rs.getInt("Price"));
	}
	catch(SQLException e) {
		e.printStackTrace();
		return null;
	}
	finally {
		closeDB();
	}
	return p;
	}

// ���ο� ��ǰ�� ����ϴ� �޼���
public boolean newMenu(Menu menu) {
	connectDB();
	
	// prcode �� �ڵ����� �÷��̹Ƿ� ���� �Է����� �ʴ´�. 
	sql = "insert into menus(category,restaurant,menu,price) values(?,?,?,?)";
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, menu.getCategory());
		pstmt.setString(2, menu.getRestaurant());
		pstmt.setString(3, menu.getMenu());
		pstmt.setInt(4, menu.getPrice());
		
		pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	}
	finally {
		closeDB();
	}
	return true;
}

// ������ ��ǰ�� �����ϴ� �޼���
public boolean delMenu(int no) {
	connectDB();
	sql = "delete from menus where no=?";	
	try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, no);
		pstmt.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
		return false;
	}
	finally {
		closeDB();
	}
	return true;
}

// ������ ������ ��ǰ������ ������Ʈ �ϴ� �޼���
public boolean updateMenu(Menu menu) {
	connectDB();
	sql = "update menus set  restaurant=?, menu=?, price=? where no=?";
	try {
		pstmt.setString(1, menu.getCategory());
		pstmt.setString(2, menu.getRestaurant());
		pstmt.setString(3, menu.getMenu());
		pstmt.setInt(4, menu.getPrice());
		pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	}
	finally {
		closeDB();
	}
	return true;
	}

	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcURL, "javabook", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
 
 public void closeDB() {
	 try {
		 pstmt.close();
		 rs.close();
		 conn.close();
	 } catch(SQLException e) {
		 e.printStackTrace();
	 }
}
}