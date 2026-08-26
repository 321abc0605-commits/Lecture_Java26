package day02;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전공 이수 학점 :");
		int jun = sc.nextInt();
		System.out.println("교양 이수 학점 :");
		int gyo = sc.nextInt();
		System.out.println("일반 이수 학점 :");
		int il= sc.nextInt();
		
		if (jun + gyo + il >= 140
				&& jun >= 70
				&& ((gyo >= 30 && il >= 30)
						|| gyo + il >= 80)) {
			
			System.out.println("졸업 가능");
		} else {
			System.out.println("졸업 불가능");
		}
	}

}
