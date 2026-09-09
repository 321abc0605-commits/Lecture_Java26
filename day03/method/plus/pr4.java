package plus;
import java.util.Scanner;

public class pr4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s;
		
		while(true) {
			System.out.print("URL을 입력하시오 : ");
			s = in.next();
			if(s.equals("bye")) {
				break;
			}
			check(s);
		}
	}
	public static void check(String s) {
		String c = "com";
		String j = "java";
		
		if ((s.contains(c))&&(s.contains(j))) {
			System.out.println(s + "은 'com'으로 끝납니다.");
			System.out.println(s + "은 'java'를 포함합니다.");
		}
		else if ((s.contains(c))) {
			System.out.println(s + "은 'com'으로 끝납니다.");
		}
		else if ((s.contains(j))) {
			System.out.println(s + "은 'java'를 포함합니다.");
		}
		
		else {
			System.out.println(s + "은 'com'과 'java'를 포함하지 않습니다");
		}
	}

}
