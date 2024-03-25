package thread.ex;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(new Countdown());
        countdownThread.start();

        try {
            Thread.sleep(new Random().nextInt(10) * 1000 + 2);
            countdownThread.interrupt();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static class Countdown implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 10; i > 0; i--) {
                    System.out.println("카운트다운: " + i);
                    Thread.sleep(1000);
                }
                System.out.println("발사 성공!");
            } catch (InterruptedException e) {
                System.out.println("발사 중단: 기술적 문제 발생!");
                Thread.currentThread().interrupt();
            }
        }
    }
}
