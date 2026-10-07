package animal;

public class Tiger extends Animal {

	@Override
	void eat() {
		System.out.println("고기를 먹는다");
		
	}

	@Override
	void move() {
		System.out.println("달린다");
		
	}

	@Override
	void sleep() {
		System.out.println("쿨쿨.. 잔다");
		
	}

	@Override
	public String toString() {
		return ">>> 호랑이";
	}
	
	

}
