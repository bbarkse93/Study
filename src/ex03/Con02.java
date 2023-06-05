package ex03;

import java.util.Scanner;

public class Con02 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력된 정수는 짝수입니다.");
        } else {
            System.out.println("입력된 정수는 홀수입니다.");
        }
        sc.close();
    }
}
