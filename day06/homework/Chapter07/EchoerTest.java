package Chapter07;

import java.util.Scanner;

public class EchoerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Echoer e = new Echoer() {void echo(){
			String munja;
			do {
				munja = in.nextLine();
				System.out.println(munja);
			}while(!munja.equals("끝"));
		}};
		e.start();
		e.echo();
		e.stop();
	}
}
