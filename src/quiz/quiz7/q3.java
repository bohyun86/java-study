package quiz.quiz7;

public class q3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Car(i + 1)).start();
        }
    }
}
