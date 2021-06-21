package ListAnswer;

public class Student {
	static String department = "정보보호과"; //과는 입력 안 받고 고정
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
