package plus;
import java.util.Scanner;

public class pr9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		double p = sc.nextDouble();
		
		char[][] arr = new char[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(Math.random()<p) {
					arr[i][j] = '*';
				}else {
					arr[i][j] = '-';
				}
			}
		}
		
		String[][] darr = new String[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == '*') {
					darr[i][j] = "*";
					continue;
				}
				int count = 0;
				
				if(i!=0) {
					if(arr[i-1][j] == '*') count ++; // 상
				}
				if(i!=m-1) {
					if(arr[i+1][j] == '*') count ++; // 하
				}
				if(j!=0) {
					if(arr[i][j-1] == '*') count ++; // 좌
				}
				if(j!=n-1) {
					if(arr[i][j+1] == '*') count ++; // 우
				}
				if(i!=0 && j!=0) {
					if(arr[i-1][j-1] == '*') count ++; // 상좌
				}
				if(i!=m-1 && j!=n-1) {
					if(arr[i+1][j+1] == '*') count ++; // 하우
				}
				if(i!=m-1 && j!=0) {
					if(arr[i+1][j-1] == '*') count ++; // 하좌
				}
				if(i!=0 && j!=n-1) {
					if(arr[i-1][j+1] == '*') count ++; // 상우
				}
				
				darr[i][j] = count+"";
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(darr[i][j]+" ");
				}
			System.out.println();
		}
	}
}