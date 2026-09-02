package method;

import java.util.Scanner;

public class pr1 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int age = sc.nextInt();

	    if (age >= 19) {
	        System.out.println("성인");
	    }
	    else {
	    	System.out.println("미성년");
	    }
	}
}
