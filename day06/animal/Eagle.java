package animal;

public class Eagle extends Animal {

	@Override
	void eat() {
		System.out.println("고기를 먹는다");
		
	}

	@Override
	void move() {
		System.out.println("날아다닌다");
		
	}

	@Override
	public String toString() {
		return ">>> 독수리";
	}

}
