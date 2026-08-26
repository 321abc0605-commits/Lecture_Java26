package day02;

import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double w, h, area;
		System.out.print("직사각형의 가로 길이를 입력하시오 : ");
		w = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하시오 : ");
		h = in.nextDouble();
		area = w*h;
		System.out.print("직사각형의 넓이는 " + area + "입니다");

	}

}