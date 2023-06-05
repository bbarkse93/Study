package ex03;

import java.util.Scanner;

public class Coin01 {
    public static void main(String[] args) {
        // 500, 100, 50, 10(개수를 최소로 해서 주세요.)
        Scanner sc = new Scanner(System.in);
        System.out.print("받은 금액: ");
        final int money = sc.nextInt();

        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담을 변수

        int[] coins = { 500, 100, 50, 10 };
        for (int tempMoney : coins) {

            count = restMoney / tempMoney;
            System.out.println(tempMoney + "원: " + count);
            restMoney = restMoney % tempMoney;
        }
        sc.close();
    }
}