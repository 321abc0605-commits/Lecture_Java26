package hm;

class Dice {

    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}

public class pr7 {
    public static void main(String[] args) {

        Dice d = new Dice();

        System.out.println("주사위의 숫자 : " + d.roll());
    }
}