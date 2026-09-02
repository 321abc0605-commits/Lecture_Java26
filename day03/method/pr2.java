package method;

import java.util.Scanner;

public class pr2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int grade = sc.nextInt();
	
	if (grade == 1) {
		System.out.println("아주 잘했습니다.");
	}
	else if (grade == 2 || grade == 3) {
		System.out.println("잘했습니다.");
	}
	else if (grade == 4 || grade == 5 || grade == 6) {
		System.out.println("보통입니다.");
	}
	else {
		System.out.println("노력해야겠습니다.");
	}
  }
}
