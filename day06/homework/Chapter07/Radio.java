package Chapter07;

public class Radio extends Controller{
	Radio(boolean power){
		this.power= power;
	}
	
	@Override
	void show() {
		if(power) {
			System.out.println("라디오가 켜졌습니다");
		}else {
			System.out.println("라디오가 꺼졌습니다");
		}
	}

	@Override
	String getName() {
		return "Radio";
	}

}
