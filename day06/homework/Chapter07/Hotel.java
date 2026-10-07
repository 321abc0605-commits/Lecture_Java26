package Chapter07;

public class Hotel{
	int bang; 
	String name;
	Room[] Rooms = new Room[10];
	public void add(int bang, String name){
		Rooms[bang-1] = new Room(name);
	}
	void show(){
		for(int i = 0; i < 10; i++) {
			if(Rooms[i] != null) {
				System.out.printf("%d번 방을 %s가 예약했습니다.\n", i+1, Rooms[i].getName());
			}
		}
	}
}
