package ex14;

public class Thread01 {

    // CPU가 하나의 스레드를 생성하여 실행된다.
    // 실 == main 메서드
    // 실의 길이는 메인 바디의 크기에 따라 달라진다.
    public static void main(String[] args) {

        new Thread(() -> {
            // target (스레드의 길이)
            for (int i = 0; i < 5; i++) {
                System.out.println("서브쓰레드: " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인쓰레드: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
