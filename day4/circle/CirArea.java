package circle;

import java.util.Scanner;

public class CirArea {
	
	static int num = 10;
	
	public static void main(String[] args) {
		
		// 원의 반지름을 입력 받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		double radius = sc.nextDouble();
		
		// Circle 객체 생성
		Circle c = new Circle(radius);
		
		// Circle 객체에게 면적을 계산 요청
		double area = c.getArea();
		
		// 면적 출력
		System.out.printf("[객체] 반지름이 %.2f인 원의 넓이는 %.2f 입니다\n", c.getRadius(), area);
		
		//Circle 객체 없이 원의 면적 구하기
		area = Circle.getArea(radius);
		System.out.printf("[static] 반지름이 %.2f인 원의 넓이는 %.2f 입니다\n", radius, area);
	}

}
