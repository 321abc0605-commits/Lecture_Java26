package day02;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑면 반지름은? : ");
        int M = sc.nextInt();
		System.out.println("원기둥의 높이는? : ");
        int N = sc.nextInt();
        System.out.println("원기둥의 부피는 : " + M * M * 3.14 * N);
	}

}
