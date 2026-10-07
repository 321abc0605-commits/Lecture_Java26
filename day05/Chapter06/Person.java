package Chapter06;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + "]");
	}
}
