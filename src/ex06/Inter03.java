package ex06; //노출

//구현체 : Car
interface CarAble {
    void 전진();

    void 후진();

    void 정지();

}

class Car implements CarAble {
    private void a1() {
    }

    private void a2() {
    }

    private void a3() {
    }

    private void a4() {
    }

    private void a5() {
    }

    private void a6() {
    }

    private void a7() {
    }

    private void a8() {
    }

    // 앞으로 가게 하려면 a1 a3 a5 a6을 순서대로 호출
    // 뒤로 가게 하려면 a8 a7 a6 a5를 순서대로 호출
    // 멈추려면 a3 a7을 순서대로 호출
    @Override
    public void 전진() {
        a1();
        a3();
        a5();
        a8();
        a2();
        a4();
        System.out.println("전진함");
    }

    @Override
    public void 후진() {
        a8();
        a7();
        a6();
        a5();
        System.out.println("후진함");
    }

    @Override
    public void 정지() {
        a3();
        a7();
        System.out.println("멈춤");
    }

}

// 앞으로 가게 하려면 a1 a3 a5 a6을 순서대로 호출
// 뒤로 가게 하려면 a8 a7 a6 a5를 순서대로 호출
// 멈추려면 a3 a7을 순서대로 호출
public class Inter03 {

    public static void start(CarAble c) {
        c.전진();
        c.후진();
        c.정지();
    }

    public static void main(String[] args) {
        start(new Car());

    }
}
