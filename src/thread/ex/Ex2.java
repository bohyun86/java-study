package thread.ex;

public class Ex2 {
    public static void main(String[] args) {
        Thread friendA = new Thread(new FriendA(), "A");
        Thread friendB = new Thread(new FriendB(), "B");
        Thread friendC = new Thread(new FriendC(), "C");

        friendA.start();
        friendB.start();
        friendC.start();

        try {
            friendA.join();
            friendB.join();
            friendC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("모두 준비 완료, 여행을 출발합니다!");
    }

    static class FriendA implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000); // 2초 대기
                System.out.println("A의 짐 준비 완료!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class FriendB implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(3000); // 3초 대기
                System.out.println("B의 짐 준비 완료!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class FriendC implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000); // 5초 대기
                System.out.println("C의 짐 준비 완료!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
