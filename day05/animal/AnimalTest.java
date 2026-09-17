package animal;

public class AnimalTest{
	public static void main(String[] args) {
		System.out.println(">>>> 독수리");
		Eagle e = new Eagle();
		e.eat();
		e.fly();
		e.sleep();
		
		System.out.println(">>>> 호랑이");
		Tiger t = new Tiger();
		t.eat();
		t.run();
		t.sleep();
		
		System.out.println(">>>> 금붕어");
		Goldfish g = new Goldfish();
		g.eat();
		g.swim();
		t.sleep();
		
	}
	
	
}