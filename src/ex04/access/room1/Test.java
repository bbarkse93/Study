package ex04.access.room1;

class A {
    private int a; // 전용
    int b; // 디폴트
    public int c; // 공용
}

public class Test {
    public static void main(String[] args) {
        A obj = new A(); // 객체 생성

        // obj.a = 10; // 다른 클래스에서 접근 불가
        obj.b = 20; // 같은 패키지 접근 가능
        obj.c = 30; // 누구나 접근 가능

    }

}
