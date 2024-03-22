package thread;

public class Thread12 {
    // 종료 플래그: 메인 스레드에서는 변경, 새 스레드에서는 참조
    // volatile 키워드: 모든 스레드가 해당 변수의 최신 업데이트된 값을 볼 수 있도록 해줌(변경된 값이 가시적 visibility)
    static volatile boolean stop = false;
    public static void main(String[] args) {
        new Thread(() -> {
            int count = 0;
            while (!stop) {
                count++;
                System.out.println(count);
            }
            System.out.println("스레드가 종료되었습니다.");
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        stop = true;
    }
}
