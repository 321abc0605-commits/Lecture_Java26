package circle;

public class OverridingTest {
public static void main(String[] args) {
	System.out.println(">>>> 원");
	Circle c = new Circle(5.0);
	printCircleInfo(c);
	
	System.out.println(">>>> 구(Ball)");
	Circle b = new Ball(5.0);
	printCircleInfo(b);
	
	System.out.println(">>>> 원기둥");
	Circle cy = new Cylinder(5.0, 7.0);
	printCircleInfo(cy);
	Cylinder cy2 = (Cylinder)cy;
	System.out.println("높이 : " + cy2.getHeight());
	
	
	
	}

	public static void printCircleInfo(Circle c) {
		System.out.println("반지름 : " + c.getRadius());
		System.out.println("면적 : " + c.getArea());
	}
}
