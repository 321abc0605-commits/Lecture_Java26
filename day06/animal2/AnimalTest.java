package animal2;

public class AnimalTest {
	public static void main(String[] args) {
		PrintDayLife(new Tiger());
	}
	
	public static void PrintDayLife(Animal a) {
		System.out.println(a); // 오버라이딩된 toString() 메서드가 호출됨
		a.eat();
		a.move();
		a.sleep();
		System.out.println();
	}
}
