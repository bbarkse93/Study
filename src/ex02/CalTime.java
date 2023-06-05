package ex02;

import java.util.Scanner;

public class CalTime {
    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.print("초를 입력하시오: ");
        n1 = sc.nextInt();

        
        int min = n1 / 60;
        int sec = n1 % 60;
        System.out.println(n1 + "초는 " + min + "분 " + sec + "초 입니다.");

        sc.close();

    }

}
