package hm;

class Complex {
	private double real;
	private double imaginary;
	
    // 값 하나를 받는 생성자
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0.0;
    }

    // 값 두 개를 받는 생성자
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // 출력
    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class pr5 {
	public static void main(String[] args) {
		
		Complex c1 = new Complex(2.0);
		c1.print();
		
		Complex c2 = new Complex(1.5, 2.5);
		c2.print();
	}
	
}
