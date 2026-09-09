package plus;
import java.util.Scanner;

public class pr1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s;
		char c;
		
		System.out.print("문자열을 입력하시오 : ");
		s = in.next();
		System.out.print("찾을 문자를 입력하시오 : ");
		c = in.next().charAt(0);
		System.out.print("찾을 문자의 갯수 : " + countChar(s,c));
	}
	public static int countChar(String s, char c) {
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				a+=1;
			}
		}
		
		return a;
	}

}
