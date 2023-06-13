package ex05.composit01;

public class Burger_1 {
    private int price;
    private String desc;

    public Burger_1() {
        this(1000, "버거");
    }

    public Burger_1(int price) {
        this(price, "버거");
    }

    public Burger_1(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println(desc + "는 " + price);
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
