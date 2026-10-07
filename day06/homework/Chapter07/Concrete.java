package Chapter07;

public class Concrete extends Abstract{
	int j;
	Concrete(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public void show() {
		System.out.printf("i = %d, j = %d",i,j);
	}
}
