package ex03;

public class Gugudan {
    public static void main(String[] args) {
        // 2 * 1 = 2, 엔터 2 * 2 = 4 ... 요구사항

        for (int n = 1; n <= 9; n = n + 1) {
            if (n == 3)
                continue;

            System.out.println(n + " * 1 = " + (n * 1));
            System.out.println(n + " * 2 = " + (n * 2));
            System.out.println(n + " * 3 = " + (n * 3));
            System.out.println(n + " * 4 = " + (n * 4));
            System.out.println(n + " * 5 = " + (n * 5));
            System.out.println(n + " * 6 = " + (n * 6));
            System.out.println(n + " * 7 = " + (n * 7));
            System.out.println(n + " * 8 = " + (n * 8));
            System.out.println(n + " * 9 = " + (n * 9));
            System.out.println();

        }
    }
}
