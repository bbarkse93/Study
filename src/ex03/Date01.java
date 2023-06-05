package ex03;

public class Date01 {
    public static void main(String[] args) {

        int[] nums = new int[10];
        int[] scores = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");

        for (int j = 0; j < scores.length; j++) {
            System.out.print(scores[j] + " ");

        }
        System.out.println(" ");

        int[] list = { 10, 20, 30 };
        for (int vlaue : list)
            System.out.print(vlaue + " ");
    }

}
