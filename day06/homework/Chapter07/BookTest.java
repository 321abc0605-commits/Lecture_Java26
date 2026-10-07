package Chapter07;

import java.util.Arrays;

public class BookTest {
	public static void main(String[] args) {
		Book books[] = {new Book(15000), new Book(50000), new Book(20000)};
		System.out.println("정렬 전");
		for(Book bb : books) {
			System.out.println(bb);
		}
		Arrays.sort(books);
		System.out.printf("\n정렬 후\n");
		for(Book bb : books) {
			System.out.println(bb);
		}
	}	
}
