package ex02;

class world {
    char ch = '가';

}

public class Mem02 {
    static int x = 10;
    int y = 15;

    public static void main(String[] args) {
        System.out.println(x);
        Mem02 z = new Mem02();
        world k = new world();
        System.out.println(Mem02.x);
        System.out.println(k.ch);
        System.out.println(Mem02.x);
        System.out.println(z.y);

        System.out.print((3 == 4) + " ");
        System.out.print((3 != 4) + " ");
        System.out.print((3 > 4) + " ");
        System.out.print((4 > 3) + " ");


        double area1 = 2 * 3.141592 * 20 * 20;
        double area2 = 3.141592 * 30 * 30;
        System.out.println("20cm 피자 면적=" + area1);
        System.out.println("30cm 피자 면적=" + area2);
        System.out.println((area1 > area2)? "20cm 두 개": "30cm 한 개");
        
    }
}
