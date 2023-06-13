package ex06;

/**
 * 1. 추상클래스는 new할 수 없다.
 * 2. 추상클래스는 일반메서드와 추상메서드르 가질 수 있다.
 * 3. 추상클래스는 상태변수를 가질 수 있다.
 */
abstract class 동물 {

    String name;

    public void run() {
        System.out.println("달린다.");
    }

    public abstract void speak();
}

class 사자 extends 동물 {

    @Override
    public void speak() {
        System.out.println("어흥");
    }
}

public class Abstract01 {

    public static void main(String[] args) {
        // new 동물();

    }
}
