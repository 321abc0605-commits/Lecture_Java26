package method;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 4, 8};
		
		System.out.println("getSum의 결과값 = " + getSum(numArr));
        System.out.println("getMax의 결과값 = " + getMax(numArr));
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("getCount의 결과값 = " + getCount(numArr, a));

        swapArray(numArr);
        
        System.out.print("swapArray의 결과값 = ");
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
	}

	public static int getSum(int[] numArr) {
		
		int sum = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		return sum;
	}
	
	public static int getMax(int[] numArr) {
		
		int max = numArr[0];
		
		 for (int i = 1; i < numArr.length; i++) {
	            if (max < numArr[i]) {
	                max = numArr[i];
	            }
	}
	return max;
	}
	
	public static int getCount(int[] numArr, int target) {
		int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > target) {
                count = count + 1;
            }
        }
		return count;
	}

	public static void swapArray(int[] numArr) {

        for (int i = 0; i < numArr.length / 2; i++) {

            int temp = numArr[i];
            numArr[i] = numArr[numArr.length - 1 - i];
            numArr[numArr.length - 1 - i] = temp;
        }
    }
}
