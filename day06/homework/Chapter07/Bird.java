package Chapter07;

public class Bird implements Countable{
	String name;
	int b;
	public Bird(String name, int b) {
		this.name = name;
		this.b = b;
	}
	public void fly() {
		System.out.println(b + "마리 " + name +"가 날아간다.");
	}
	public void count() {
		System.out.println(name +"가 " + b + "마리 있다.");
	}
}
