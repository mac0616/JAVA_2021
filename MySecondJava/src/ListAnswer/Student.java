package ListAnswer;

public class Student {
	static String department = "������ȣ��"; //���� �Է� �� �ް� ����
	String id;
	String name;
	double score;
	
	public Student(String id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return department + "," + id + "," + name + "," + score;
	}
	


}
