package Chapter07;

public class Tree implements Countable{
	String name;
	int t;
	public Tree(String name, int t) {
		this.name = name;
		this.t = t;
	}
	public void ripen() {
		System.out.println(t + "그루 " + name +"에 열매가 잘 익었다.");
	}
	public void count() {
		System.out.println(name +"가 " + t + "그루 있다.");
	}
}
