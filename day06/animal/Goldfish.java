package animal;

public class Goldfish extends Animal {

	@Override
	void eat() {
		System.out.println("플랑크톤을 먹는다");
		
	}

	@Override
	void move() {
		System.out.println("헤엄친다");
		
	}

	@Override
	void sleep() {
		System.out.println("눈을 뜨고 잔다");
		
	}

	@Override
	public String toString() {
		return ">>> 금붕어";
	}

}
