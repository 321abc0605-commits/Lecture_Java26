package day02;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int num = sc.nextInt();
	        for (int line = 0; line < num; line++) {

	            for (int space = 0; space < num - line - 1; space++) {
	                System.out.print(" ");
	            }

	            for (int star = 0; star < line + 1; star++) {
	                System.out.print("*");
	            }

	            for (int star = 0; star < line; star++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

}
}
