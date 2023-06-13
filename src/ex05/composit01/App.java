package ex05.composit01;

public class App {
    public static void main(String[] args) {
        Burger_1 b1 = new Burger_1(2000, "불고기버거");
        Burger_1 b2 = new Burger_1();
        Burger_1 b3 = new Burger_1(1800);

        BigBurger_1 bb1 = new BigBurger_1(10000, "빅맥버거");
        BigBurger_1 bb2 = new BigBurger_1();
        BigBurger_1 bb3 = new BigBurger_1(5000);
    }
}
