package ex05.composit01;

public class BigBurger_1 extends Burger_1 {

    public BigBurger_1(int price, String desc) {
        super(price, desc);
    }

    public BigBurger_1() {
        super(10000, "빅버거");
    }

    public BigBurger_1(int price) {
        super(price, "빅버거");
    }

}
