package ex05.ch04;

public class App {
    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군1", 100, 5);
        ProtossUnit z2 = new Zealot("질럿2", 100, 10);
        ProtossUnit r1 = new River("리버1", 100, 80);

        attack(z1, d1);
        attack(d1, z2);
        attack(r1, z2);
        attack(z1, r1);

    }
}