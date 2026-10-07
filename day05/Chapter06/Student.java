package Chapter06;

public class Student extends Person {
	int StudentNumber;
	
	public Student(String name, int age, int StudentNumber) {
		super(name, age);
		this.StudentNumber = StudentNumber;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + StudentNumber + "]");
	}
}
