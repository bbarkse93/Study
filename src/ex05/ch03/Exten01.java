package ex05.ch03;

class 지구인 {

}

class 아시아인 extends 지구인 {
    // 오버라이드(무효화) 됨 [동적바인딩]
    void speak() {
        System.out.println("아시아어");
    }
}

class 한국인 extends 아시아인 {
    // 재정의
    void speak() {
        System.out.println("한국어");
    }
}

class 홍길동 extends 한국인 {
}
// 부모가 가지고 있는 메서드를 같은 이름으로 자식이 만드는 것을 재정의라고 한다.
// 오버라이드는 부모와 자식이 같은 메서드를 가지고 있을 경우 부모의 메서드가 무효화되는 것을 말한다.
//

// 다형성이 성립하면 같은 타입으로 묶어준다.

public class Exten01 {
    public static void main(String[] args) {
        아시아인 p1 = new 한국인();
        p1.speak();
    }
}
