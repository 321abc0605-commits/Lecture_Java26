package method;

import java.util.Scanner;

public class pr10 {

	public static void main(String[] args) {
		System.out.println("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num) == 0) {
			System.out.println(num + "는 소수입니다.");
		}
		else { 
			System.out.println(num + "는 소수가 아닙니다.");
		}
}
	static int isPrime(int n){
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

}
