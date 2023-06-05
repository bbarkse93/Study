package ex02;

import java.util.Scanner;

public class Mem03 {
    public static void main(String[] args) {
        double f, c_temp, c, f_temp;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("번호를 선택하시오: ");
        num = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);

        if (num == 1) {
            System.out.print("화씨온도를 입력하시오: ");
            f = sc1.nextDouble();
            c_temp = 5.0 / 9.0 * (f - 32);
            System.out.println("섭씨온도는 " + c_temp);
        }

        else if (num == 2) {
            System.out.print("섭씨온도를 입력하시오: ");
            c = sc1.nextDouble();
            f_temp = 9.0 / 5.0 * c + 32;
            System.out.println("화씨온도는 " + f_temp);
        }
        sc.close();
        sc1.close();
    }
}