package plus;
import java.util.Scanner;

public class ch {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하시오 : ");
		numOfStudents = in.nextInt();
		scores = new int [numOfStudents];
		
		System.out.println("학생(" + numOfStudents + "명)들의 성적을 입력하시오.");
		for (int i = 0; i < numOfStudents; i++ ) {
			int input = in.nextInt();
			scores[i] = input;
		}
		System.out.println("3명의 학생 성적은 다음과 같습니다.");
		for (int i = 0; i < numOfStudents; i++ ) {
			System.out.print(scores[i] + " ");
        }
	}

}
