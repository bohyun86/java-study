package thread.ex;

public class Ex5 {
    public static void main(String[] args) {
        Thread player1 = new Thread(new Magician("WizardA", "불 마법", 1));
        Thread player2 = new Thread(new Magician("WizardB", "얼음 마법", 1.5));

        player1.start();
        player2.start();

        try {
            Thread.sleep(10000);
            player1.interrupt();
            player2.interrupt();
            player1.join();
            player2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("마법 듀얼이 종료되었습니다.");
    }

    static class Magician implements Runnable {
        String name;
        String magicType;
        double intervalBySecond;

        public Magician(String name, String magicType, double intervalBySecond) {
            this.name = name;
            this.magicType = magicType;
            this.intervalBySecond = intervalBySecond * 1000;
        }

        @Override
        public void run() {
            double startTime = System.currentTimeMillis();
            int count = 0;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    Thread.sleep((long) intervalBySecond);
                    double currentTime = System.currentTimeMillis();
                    double elapsedTime = (currentTime - startTime) / 1000;
                    count++;
                    System.out.printf("%d.%.1f초 %s가 %s을 사용했습니다.\n"
                            , count, elapsedTime, name, magicType);
                }
            } catch (InterruptedException e) {
                System.out.printf("%s의 마법 사용이 중단 되었습니다.\n", name);
            }
        }
    }
}
