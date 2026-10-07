package Chapter06;

public class PersonStudentForeignStudentTest {
	public static void main(String[] args) {
		Person[] People = {new Person("길동이",22), new Student("황진이",23,100), new ForeignStudent("Amy",30,200,"U.S.A")};
		
		for(Person p : People)
			p.show();
	}
}