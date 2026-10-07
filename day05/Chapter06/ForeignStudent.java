package Chapter06;

public class ForeignStudent extends Student {
	String national;
	
	public ForeignStudent(String name, int age, int StudentNumber, String national) {
		super(name, age, StudentNumber);
		this.national = national;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + StudentNumber + ", 국적 : " + national + "]");
	}
}
