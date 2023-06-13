package ex05.composit01;

public class Potato_1 {
    private int price;
    private String desc;

    public Potato_1() {
        this(600, "감자");
    }

    public Potato_1(int price) {
        this(price, "감자");
    }

    public Potato_1(int price, String desc) {
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
