package hm;

class Car {
	private String color;
	
	private static int getNumOfCar = 0;
	private static int getNumOfRedCar = 0;
	
	public Car(String color) {
		this.color = color;
		
		getNumOfCar++;
		
		if (color.equals("red")) {
			getNumOfRedCar++;
		}
	}
	
	public static int getNumOfCar() {
	    return getNumOfCar;
	}

	public static int getNumOfRedCar() {
	    return getNumOfRedCar;
	}
}

public class pr3 {
	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}
}
