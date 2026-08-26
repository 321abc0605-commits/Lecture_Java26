package day02;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~999 사이의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		int H = num / 100;
		int T = (num % 100) / 10;
		int N = ((num % 100) % 10);
		System.out.println("각 자릿수의 합 : " + (H + T + N));

	}

}
