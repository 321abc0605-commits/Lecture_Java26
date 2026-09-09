package plus;
import java.util.Scanner;

public class pr6 {

	public static void main(String[] args) {
		int [] org = {0,1,2,3,4,5,6,7,8,9};
		reverse(org);
		
		System.out.print("[");
		for(int i = 0; i < org.length; i++) {
			System.out.print(org[i]);
			if (i < org.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
	}
	
	
	public static int[] reverse(int[] org) {
		for (int i = 0; i < org.length/2; i++) {
			int temp = org[i];
			org[i] = org[org.length - 1 - i];
			org[org.length - 1 - i] = temp;
		}
		return org;
	}

}
