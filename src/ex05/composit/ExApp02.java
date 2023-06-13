package ex05.composit;

public class ExApp02 {
    public static void main(String[] args) {

        // Coke c2 = new Coke(400, "콜라");

        // 버거세트 주세요!!
        Burger b1 = new Burger(100);
        Coke c1 = new Coke(500);
        Potato p1 = new Potato(300);
        BurgerSet bs1 = new BurgerSet(b1, c1, p1);

        // BurgerSet bs2 = new BurgerSet();

        Burger b2 = new Burger(100);
        Coke c2 = new Coke(200);
        Potato p2 = new Potato(300);
        BurgerSet bs2 = new BurgerSet(b2, c2, p2);

        Burger b3 = new Burger(600);
        Coke c3 = new Coke(800);
        Potato p3 = new Potato(1000);
        BurgerSet bs3 = new BurgerSet(b3, c3, p3);
    }
}
