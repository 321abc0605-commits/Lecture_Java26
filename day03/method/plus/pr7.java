package plus;

public class pr7 {

	public static void main(String[] args) {
		int [] a = {3,2,4,1,5};
		int [] b = {3,2,4,1};
		int [] c = {3,2,4,1,5};
		int [] d = {2,7,1,8,2};
		bool(a,b);	
		bool(a,c);	
		bool(a,d);	
		bool(b,c);
		bool(b,d);
		bool(c,d);	
	}
	
	
	
	public static void bool(int[] a, int[] b) {
		if(a.length != b.length) {
			System.out.println(false);
			return;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.out.println(false);
				return;
			}
				
		}
		System.out.println(true);		
	}
		
}



