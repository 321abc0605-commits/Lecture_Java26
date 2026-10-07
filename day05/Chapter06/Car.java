package Chapter06;

public class Car extends Vehicle {
	int displacement;
	int gears;
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	public void show() {
		System.out.println(color + "색 차의 속도는 " + speed + "입니다. " + "자동차의 배기량은 " + displacement + "이고 기어 단수는 " + gears + "입니다.");
	}
}
