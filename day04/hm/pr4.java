package hm;

class Line {
    private double length;

    // 생성자
    public Line(double length) {
        this.length = length;
    }

    // 접근자
    public double length() {
        return length;
    }

    // 길이가 같은지 비교
    public boolean isSameLine(Line line) {
        return length == line.length;
    }
}

public class pr4 {
    public static void main(String[] args) {

        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}