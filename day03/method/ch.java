package method;

import java.util.Scanner;

public class ch {
	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		result = factorial(n);
/*		
		result = 1;
		
		
		while (n > 0) {
			result *= n;
			n--;
		}
		
 		while(true) {
 		result *= n;
 		n--;
 		
 		if(n == 0) {
 		break;
 		}
  
	}
*/		
		System.out.println(result);
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
	
	static int factorial(int x) {
		int r = 1;
		while (true) {
			r *= x;
			x--;
			
			if(x == 0) {
				break;
			}
		}
		return r;
	}
	
	static int factorial(int x, int y) {
		int r = 1;
		while (true) {
			
			if (x > y) {
				break;
			}
			r *= x;
			x++;
		}
		return r;
	}
	

}


