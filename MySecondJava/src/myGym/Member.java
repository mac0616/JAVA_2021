package myGym;

public class Member {
	static int serialId = 1;
	int id;
	String name;
	String cellPhone;
	
	public Member(String name, String cellPhone) {
		super();
		this.id = serialId++;
		this.name = name;
		this.cellPhone = cellPhone;
	}

	@Override
	public String toString() {
		return "��ȣ�� " + id + "�̸��� " + name + "��ȭ��ȣ" + cellPhone + "�Դϴ�";
	}	
}
