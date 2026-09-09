package hm;

class Triangle {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double findArea() {
		return base * height / 2;
	}
	
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }


public boolean isSameArea(Triangle t) {
    return findArea() == t.findArea();
	}
}


public class pr1 {
    public static void main(String[] args) {

        Triangle t = new Triangle(10.0, 5.0);

        System.out.println(t.findArea());
        
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));

    }
}
