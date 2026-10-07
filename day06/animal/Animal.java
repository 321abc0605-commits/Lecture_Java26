package animal;

public abstract class Animal {
	abstract void eat();
	abstract void move();
	void sleep() {
		System.out.println("쿨쿨.. 잔다");
	}
}
