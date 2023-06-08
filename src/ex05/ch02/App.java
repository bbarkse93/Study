package ex05.ch02;

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.setHp(u2.getHp() - u1.getAttack());
        System.out.println(u2.getName() + "이 공격당했습니다.");
        System.out.println(u2.getName() + "의 남은 hp: " + u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit z2 = new Zealot("질럿2", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군1", 150, 20);
        ProtossUnit t1 = new DarkTempler("다크템플러1", 50, 50);

        attack(z1, z2);
        attack(z1, d1);
        attack(t1, z1);
        attack(z2, t1);
    }
}
