package Menu;

import java.sql.*;	
import java.util.*;

public class MenuDAO {  //DAO�� �����ͺ��̽� ���� �۾��� �����ϴ� Ŭ����, DB�� �����Ͽ� �Է�, ����, ����, ��ȸ ���� �۾��� �ϴ� Ŭ����
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/stockdb";
	Connection conn;
	PreparedStatement statement;
	ResultSet set;
	Vector<String> items = null;
	String sql;
	
	public Vector<String> getItems() {
		return items;
	}
	// ��ü ��ǰ ���
public ArrayList<Menu> getAll() {
	connectDB();
	sql = "select * from stockMgm";
	// ��ü �˻� ������ ���� ArrayList
	ArrayList<Menu> datas = new ArrayList<Menu>();
	// ���� �ڵ� �޺��ڽ� �����͸� ���� ���� �ʱ�ȭ
	items = new Vector<String>();
	items.add("��ü");
	try {
		statement = conn.prepareStatement(sql);
		set = statement.executeQuery();
	// �˻��� ������ ����ŭ ������ ���� Product ��ü�� ����� �̸� �ٽ� ArrayList�� �߰�
	while (set.next()) {
		Menu m = new Menu();
		m.setNo(set.getInt("no"));
		m.setMenu(set.getString("menu"));
		m.setPrice(set.getInt("price"));
		datas.add(m);
		items.add(String.valueOf(set.getInt("no")));
	}
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	} finally {
		closeDB();
	}
		return datas;
}
	// ������ ��ǰ �ڵ忡 �ش��ϴ� ��ǰ ������ �������� �޼���
public Menu getMenu(int no) {
	connectDB();
	sql = "select * from stockMgm where no=?";
	Menu m = null;
	try {
		statement = conn.prepareStatement(sql);
		statement.setInt(1, no);
		set = statement.executeQuery();
		set.next();
		m = new Menu();
		m.setNo(set.getInt("no"));
		m.setMenu(set.getString("menu"));
		m.setPrice(set.getInt("price"));
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	} finally {
		closeDB();
	}
	return m;
}
	// ��ǰ ��� �޼���
public boolean newMenu(Menu menu) {
	connectDB();
	// prcode�� �ڵ����� �÷��̹Ƿ� ���� �Է� X
	sql = "insert into stockMgm(menu, price) values(?,?)";
	try {
		statement = conn.prepareStatement(sql);
		statement.setString(1, menu.getMenu());
		statement.setInt(2, menu.getPrice());
		statement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	} finally {
		closeDB();
	}
	return true;
}
// ��ǰ ���� �޼���
public boolean updateMenu(Menu menu) {
	connectDB();
	sql = "update stockMgm set menu=?, price=? where no=?";
	try {
		statement = conn.prepareStatement(sql);
		statement.setString(1, menu.getMenu());
		statement.setInt(2, menu.getPrice());
		statement.setInt(3, menu.getNo());
		statement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	} finally {
		closeDB();
	}
	return true;
}
	// ��ǰ ���� �޼���
public boolean delMenu(int no) {
	connectDB();
	sql = "delete from stockMgm where no=?";
	try {
		statement = conn.prepareStatement(sql);
		statement.setInt(1, no);
		statement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	} finally {
		closeDB();
	}
	return true;
}
public void connectDB() {
	try {
		Class.forName(jdbcDriver);conn = DriverManager.getConnection(jdbcUrl, "javabook", "1234");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	public void closeDB() {
		try {
			statement.close();
			set.close();
			conn.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
}