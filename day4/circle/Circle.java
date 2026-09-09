package circle;

public class Circle {

	static final double PI = 3.141592;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (radius * radius * PI);
	}
	public double getRadius() {
		return radius;
	}
	
	static public double getArea(double radius) {
		return (radius * radius * PI);
	}

}