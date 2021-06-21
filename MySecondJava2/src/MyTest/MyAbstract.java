package MyTest;

abstract class Computer{
	public void turnOn() {
		System.out.println("������ ���ּ���");
	}
	public void turnOff() {
		System.out.println("������ ���ּ���");
	}
	public abstract void display();
	public abstract void typing();
}

class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("����ũž�� ���÷���");
		
	}

	@Override
	public void typing() {
		System.out.println("����ũž�� Ÿ����");
	}
	
}

class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("��Ʈ���� ���÷���");
	}

	@Override
	public void typing() {
		System.out.println("��Ʈ���� Ÿ����");
	}
}

class MyNoteBook extends NoteBook{
	@Override
	public void turnOn() {
		System.out.println("���� ������ ���ּ���");
	}
	@Override
	public void turnOff() {
		System.out.println("���� ������ ���ּ���");
	}
	
	@Override
	public void display() {
		System.out.println("���� ��Ʈ���� ���÷���");
	}

	@Override
	public void typing() {
		System.out.println("���� ��Ʈ���� Ÿd��");
	}
	
}
public class MyAbstract {

	public static void main(String[] args) {
		DeskTop desktop = new DeskTop();
		desktop.display();
		desktop.typing();
		
		NoteBook notebook = new NoteBook();
		notebook.display();
		notebook.typing();
		
		NoteBook mynotebook = new MyNoteBook();
		mynotebook.display();
		mynotebook.typing();
	}
}
