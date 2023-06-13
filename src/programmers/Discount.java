package programmers;

public class Discount {
    public static void main(String[] args) {
        int price = 300000;
        int answer = 0;
        if (price >= 100000 && price < 300000) {
            answer = (int) (price - (price * 0.05));
        } else if (price >= 300000 && price < 500000) {
            answer = (int) (price - (price * 0.1));
        } else if (price >= 500000) {
            answer = (int) (price - (price * 0.2));
        } else {
            answer = price;
        }
        System.out.println(answer);

    }
}
