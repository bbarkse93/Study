package ex05.composit;

public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());
    }

    public BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
        System.out.println("버거 세트의 가격은 " + (burger.getPrice() + coke.getPrice() + potato.getPrice()) + "입니다.");
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

}
