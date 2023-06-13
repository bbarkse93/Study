package booktest;

public class Exam {
    public static void main(String[] args) {
        int sum = 0;
        int num = 20;

        for (int n = 2; n <= num; n += 2) {
            sum += n;
        }
        System.out.println(sum);

    }
}
