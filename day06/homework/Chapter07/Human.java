package Chapter07;

public interface Human {
	void eat();
	static void echo() {
		System.out.println("야호!!!");
	}
	 default void print() {
		System.out.println("인간입니다.");
	}
}
