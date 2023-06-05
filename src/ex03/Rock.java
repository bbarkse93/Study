package ex03;

import java.util.Scanner;

// import를 안해도 되는 라이브러리 = 내장 라이브러리

public class Rock {

    final int scissor = 0;
    final int rock = 1;
    final int paper = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0) 바위(1) 보(2): ");
        int user = sc.nextInt();

        int n1 = (int) (Math.random() * 3);
        // System.out.println(n1);
        // System.out.println((n1 + 1) % 3);
        if (user == n1) {
            System.out.println("인간과 컴퓨터가 비겼음");
        } else if (user == (n1 + 1) % 3) {
            System.out.println("인간: " + user + " 컴퓨터: " + n1 + " 인간 승리");
        } else {
            System.out.println("인간: " + user + " 컴퓨터: " + n1 + " 컴퓨터 승리");
        }
        sc.close();
    }
}
