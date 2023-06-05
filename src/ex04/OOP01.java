package ex04;

class player {
    String name; // 변수를 선언했는데 값이 없는 것을 Null이라고 함
    int trirty; // 0~100(클수록 목말라짐) //범주(도메인이 정해짐)

    // 생성자
    public player(String name, int trirty) {
        this.name = name;
        this.trirty = trirty;
    }

    public void drink() {
        trirty = trirty - 30;

    }

}

public class OOP01 {
    public static void main(String[] args) {
        player p1 = new player("홍길동", 100);
        player p2 = new player("임꺽정", 100);

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.drink();
        System.out.println(p1.trirty);
        System.out.println(p2.trirty);
    }
}
