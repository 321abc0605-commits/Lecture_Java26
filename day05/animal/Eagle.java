package animal;

public class Eagle extends Animal{
	String wing;
	
	public void fly() {
		System.out.println("날다");
	}
	
	@Override
	public void eat() {
		System.out.println("고기를 먹는다");
	}
}
