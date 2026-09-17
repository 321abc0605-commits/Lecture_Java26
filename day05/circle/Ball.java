package circle;

public class Ball extends Circle {

	public Ball(double radius) {
		super(radius);
	}
	
	public double getArea() {
		return 4 * PI * radius * radius;
	}
	
}
