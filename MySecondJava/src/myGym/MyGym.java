package myGym;

import java.util.*;

public class MyGym {
	ArrayList<Member> m;
	
	public MyGym() {
		m = new ArrayList<Member>();
	}
	
	public void addMember(Member mem) {
		m.add(mem);
		System.out.println(mem.toString());
	}
	
	public void removeMember(int i) {
		Member a = m.remove(i);
		System.out.println(a.toString());
	}
	
	public void showList() {
		for(Member s : m) {
			System.out.println(s.toString());
		}
	}
	
	public static void main(String[] args) {
		MyGym myGym = new MyGym();
		Member m1 = new Member("홍길동", "010-1234-5678");
		Member m2 = new Member("이길동", "010-5678-9123");
		Member m3 = new Member("고길동", "010-4567-8912");
		myGym.addMember(m1);
		myGym.addMember(m2);
		myGym.addMember(m3);
		myGym.removeMember(1);
		myGym.showList();
		
	}
}
