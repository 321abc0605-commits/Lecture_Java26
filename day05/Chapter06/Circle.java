package Chapter06;

public class Circle extends CircleColoredCircleTest {
	final static double PI = 3.14;
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	public void show() {
		System.out.println("반지름이 " + radius +"인 원이다");
	}
	
	
}
