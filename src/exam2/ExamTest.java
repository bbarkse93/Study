package exam2;

public class ExamTest {
    public static void main(String[] args) {
        int hp = 2300;
        int mp = 1000;

        if (hp >= 2000 && mp >= 2000) {
            System.out.println("아이템 장착 완료!");
        } else {
            System.out.println("아이템을 착용할 수 없습니다.");
        }
    }
}
