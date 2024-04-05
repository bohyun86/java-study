package quiz.quiz7;

public class CoffeeOrder implements Runnable {
    String name;
    int readyTime;

    public CoffeeOrder(String name, int readyTime) {
        this.name = name;
        this.readyTime = readyTime;
    }

    @Override
    public void run() {

        try {
            System.out.printf("%s 준비 시작.\n", this.name);
            Thread.sleep(readyTime * 1000L);
            System.out.printf("%s 준비 완료!\n", this.name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
