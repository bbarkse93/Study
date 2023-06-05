package ex03;

public class Coin02 { // 자바는 클래스 밖에 아무것도 둘 수 없다. 클래스 밖에 다른 클래스는 가능

    final int money = 1254815;
    int restMoney = money; // 남은 금액 변수 만들기
    int count; // 동전 개수를 담을 변수

    void printRestMoney(int m) {
        count = restMoney / m;
        System.out.println(m + "원: " + count);
        restMoney = restMoney % m;
    }

    public static void main(String[] args) {
        Coin02 c2 = new Coin02();
        c2.printRestMoney(500);
        c2.printRestMoney(100);
        c2.printRestMoney(50);
        c2.printRestMoney(10);

    }
}