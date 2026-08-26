package day02;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초 단위 정수를 입력하세요 : ");
        int T = sc.nextInt();
        
        int H = T / 3600;
        int M = (T % 3600) / 60;
        int S = T % 60;
        
        System.out.println(H + "시간" + M + "분" + S + "초");
	}

}
