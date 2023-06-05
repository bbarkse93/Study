package programmers;

public class Elevator {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 10;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

    public static String guide(int floor) {
        if (floor >= 1 && floor <= 10) {
            return "고층";
        } else {
            return "저층";
        }
    }
}
