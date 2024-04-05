package quiz.quiz7;

public class Car implements Runnable {

    int CarName;
    private final int DISTANCE = 1000;
    private final int STEP = 100;

    public Car(int carName) {
        CarName = carName;
    }

    @Override
    public void run() {
        int currentDistance = 0;
        System.out.printf("차량 %d이 출발했습니다.\n", this.CarName);
        while (currentDistance < DISTANCE) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
                currentDistance += STEP;
                System.out.printf("차량 %d이 %dm를 달렸습니다!.\n", this.CarName, currentDistance);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("차량 %d이 결승선을 통과했습니다!\n", this.CarName);
    }
}
