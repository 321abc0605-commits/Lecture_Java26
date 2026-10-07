package Chapter07;

public class TalkableTest {
	static void speak(Talkable t) {
		t.insa();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
}
