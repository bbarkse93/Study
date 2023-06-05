package programmers;

public class Walking {

    public static void main(String[] args) {

        double result = CalculateCalory(5000);
        System.out.println(result);

    }

    private static double CalculateCalory(int walk) {
        return 0.02 * walk;
    }
}