package method;

import java.util.Scanner;

public class pr6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("철수 : ");
        String c = sc.next();

        System.out.print("영희 : ");
        String y = sc.next();

        if (c.equals(y)) {
            System.out.println("무승부");
        }

        else if ((c.equals("s") && y.equals("p")) || (c.equals("r") && y.equals("s")) || (c.equals("p") && y.equals("r"))) {
        	System.out.println("철수, 승!");
        	}

        else {System.out.println("영희, 승!");}

	}

}
