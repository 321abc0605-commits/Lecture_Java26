package Chapter06;

public class Telephone extends Phone {
	private String when;
	
	public Telephone() {}
	
	
	public Telephone(String owner) {
		super(owner);
	}
	
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}



	public void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 전화 줄래.");
	}
}
