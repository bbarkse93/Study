package ex05.composit01;

public class BurgerSet_1 {
    private Burger_1 burger_1;
    private Coke_1 coke_1;
    private Potato_1 potato_1;

    public BurgerSet_1() {
        this(new Burger_1(), new Coke_1(), new Potato_1());

    }

    private BurgerSet_1(Burger_1 burger_1, Coke_1 coke_1, Potato_1 potato_1) {
        this.burger_1 = burger_1;
        this.coke_1 = coke_1;
        this.potato_1 = potato_1;
        System.out
                .println("버거세트는 " + burger_1.getDesc() + ", " + coke_1.getDesc() + ", " + potato_1.getDesc() + "입니다.");

    }

    public Burger_1 getBurger_1() {
        return burger_1;
    }

    public Coke_1 getCoke_1() {
        return coke_1;
    }

    public Potato_1 getPotato_1() {
        return potato_1;
    }

}
