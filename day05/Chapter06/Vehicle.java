package Chapter06;

public class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	public void show() {
		System.out.println(color + "색 차의 속도는 " + speed + "입니다. " );
	}
}
