package animal;

public class Tiger extends Animal{
	String leg;
	
	public void run() {
		System.out.println("달다");
	}
	
	@Override
	public void eat() {
		System.out.println("고기를 먹는다");
	}
}