package hm;

class Printer {

    private int num0fPapers;
    private boolean duplex;

    public Printer(int num0fPapers, boolean duplex) {
        this.num0fPapers = num0fPapers;
        this.duplex = duplex;
    }

    // 종이 추가
    public void addpaper(int amount) {
        num0fPapers += amount;
    }

    // 출력
    public void print(int amount) {

        int needPapers;

        // 양면 출력이면 필요한 용지 수 계산
        if (duplex == true) {
            needPapers = (amount + 1) / 2;
        }
        else {
            needPapers = amount;
        }

        // 용지가 아예 없는 경우
        if (num0fPapers == 0) {
            System.out.println("용지가 없습니다.");
        }

        // 필요한 용지보다 부족한 경우
        else if (num0fPapers < needPapers) {

            System.out.println(
                "모두 출력하려면 용지가 "
                + (needPapers - num0fPapers)
                + "매 부족합니다."
            );

            if (duplex == true) {
                System.out.println(
                    num0fPapers * 2
                    + "페이지만 양면 출력합니다."
                );
            }
            else {
                System.out.println(
                    num0fPapers
                    + "페이지만 단면 출력합니다."
                );
            }

            num0fPapers = 0;
        }

        // 용지가 충분한 경우
        else {

            num0fPapers -= needPapers;

            if (duplex == true) {
                System.out.println(amount + "페이지를 양면 출력했습니다.");
            }
            else {
                System.out.println(amount + "페이지를 단면 출력했습니다.");
            }

            System.out.println(
                "현재 " + num0fPapers + "장 남아 있습니다."
            );
        }
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    // 남은 용지 확인
    public int getNum0fPapers() {
        return num0fPapers;
    }
}

public class PrinterTest {

    public static void main(String[] args) {

        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);

    }
}