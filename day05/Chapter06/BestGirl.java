package Chapter06;

public class BestGirl extends GoodGirl {
	BestGirl(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		System.out.println(name + "는 자바를 무지하게 잘 안다");
	}
}
