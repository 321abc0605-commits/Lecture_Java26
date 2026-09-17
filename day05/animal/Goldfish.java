package animal;

public class Goldfish extends Animal{
	String fin;
	
	public void swim() {
		System.out.println("헤엄친다");
	}
	
	@Override
	public void eat() {
		System.out.println("플랑크톤을 먹는다");
	}
}