package Chapter06;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
		
		for(Phone p : phones)
			
			if (p instanceof Smartphone) {
				Smartphone sp = (Smartphone) p;
				sp.playGmae();
			}
			else if (p instanceof Telephone) {
				Telephone tp = (Telephone) p;
				tp.autoAnswering();
			}
			else {
				Phone p1 = (Phone) p;
				p1.talk();
			}
	}

}
