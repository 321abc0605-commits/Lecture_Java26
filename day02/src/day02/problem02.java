package day02;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int num;
			System.out.print("정수를 입력하시오 : ");
			num = in.nextInt();
			if (num%2 == 0) {
				System.out.print("짝수");
			}
			else {
				System.out.print("홀수");
			}

	}

}
