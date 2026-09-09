package cat;

public class TestCat {
	public static void main(String[] arges) {
		
		Cat myCat = new Cat("코숏", "노랑");
		System.out.println("나의 고양이는 " + myCat.color + " " + myCat.breed + "입니다.");
		myCat.eat("아침");
		myCat.meow();
		System.out.println();
		myCat.eat("점심");
		myCat.scratch();
		myCat.meow();
		
	}
}
