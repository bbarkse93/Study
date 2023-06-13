package ex06; //강제성

interface Remocon {
    void on();

    void off();

}

class 삼성 implements Remocon {

    @Override
    public void on() {
        System.out.println("티비를 켜다");
    }

    @Override
    public void off() {
        System.out.println("티비를 끄다");
    }

}

class 엘지 implements Remocon {

    @Override
    public void on() {
        System.out.println("티비를 켜다");
    }

    @Override
    public void off() {
        System.out.println("티비를 끄다");
    }
}

public class Inter02 {

    public static void main(String[] args) {
        Remocon s1 = new 삼성();
        s1.on();
        s1.off();

        Remocon l1 = new 엘지();
        l1.on();
        l1.off();

    }
}
