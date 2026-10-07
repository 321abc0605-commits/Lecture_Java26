package Chapter07;

public class TV extends Controller {
	TV(boolean power){
		this.power= power;
	}

	@Override
	void show() {
		if(power) {
			System.out.println("TV가 켜졌습니다");
		}else {
			System.out.println("TV가 꺼졌습니다");
		}
	}

	@Override
	String getName() {
		return "TV";
	}
}
