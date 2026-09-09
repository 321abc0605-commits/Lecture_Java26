package plus;
import java.util.Scanner;

public class pr5 {

	public static void main(String[] args) {
		star(); 
	}
	
	public static void star() {
		Scanner in = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0, d = 0, e = 0;
		int f = 0, g = 0, h = 0, j = 0, k = 0;
		
		System.out.println("숫자를 10개 입력하세요 : ");
		
		for(int i = 1; i <= 10; i++) {
			int input = in.nextInt();
			if (input > 0) {
				switch(input / 10) {
				case 0: 
					a++; 
					break;
				case 1: 
					b++; 
					break;
				case 2: 
					c++; 
					break;
				case 3: 
					d++; 
					break;
				case 4: 
					e++; 
					break;
				case 5: 
					f++; 
					break;
				case 6: 
					g++; 
					break;
				case 7: 
					h++; 
					break;
				case 8: 
					j++; 
					break;
				case 9: 
					k++; 
					break;
			}
			}
			
		}
		
		System.out.print("  0 ~ 9 :");
		for(int z = 0; z < a; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("10 ~ 19 :");
		for(int z = 0; z < b; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("20 ~ 29 :");
		for(int z = 0; z < c; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("30 ~ 39 :");
		for(int z = 0; z < d; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("40 ~ 49 :");
		for(int z = 0; z < e; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("50 ~ 59 :");
		for(int z = 0; z < f; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("60 ~ 69 :");
		for(int z = 0; z < g; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("70 ~ 79 :");
		for(int z = 0; z < h; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("80 ~ 89 :");
		for(int z = 0; z < j; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("90 ~ 99 :");
		for(int z = 0; z < k; z++) {
			System.out.print("*");
		}
		System.out.println("");
		
	}

}