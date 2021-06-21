package MyTest;

abstract class Computer{
	public void turnOn() {
		System.out.println("전원을 켜주세요");
	}
	public void turnOff() {
		System.out.println("전원을 꺼주세요");
	}
	public abstract void display();
	public abstract void typing();
}

class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("데스크탑의 디스플레이");
		
	}

	@Override
	public void typing() {
		System.out.println("데스크탑의 타이핑");
	}
	
}

class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("노트북의 디스플레이");
	}

	@Override
	public void typing() {
		System.out.println("노트북의 타이핑");
	}
}

class MyNoteBook extends NoteBook{
	@Override
	public void turnOn() {
		System.out.println("나의 전원을 켜주세요");
	}
	@Override
	public void turnOff() {
		System.out.println("나의 전원을 꺼주세요");
	}
	
	@Override
	public void display() {
		System.out.println("나의 노트북의 디스플레이");
	}

	@Override
	public void typing() {
		System.out.println("나의 노트북의 타d핑");
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
