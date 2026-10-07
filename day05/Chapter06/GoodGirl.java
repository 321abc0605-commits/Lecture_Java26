package Chapter06;

public class GoodGirl extends Girl {
	GoodGirl(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		System.out.println(name + "는 자바를 잘 안다");
	}
}
