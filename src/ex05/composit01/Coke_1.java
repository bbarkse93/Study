package ex05.composit01;

public class Coke_1 {
    private int price;
    private String desc;

    public Coke_1() {
        this(500, "콜라");
    }

    public Coke_1(int price) {
        this(price, "콜라");
    }

    public Coke_1(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
