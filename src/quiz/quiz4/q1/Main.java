package quiz.quiz4.q1;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int count = 0;
        for (int i = 0; i < 1_000_001; i++) {
                count++;
        }

        long endTime = System.nanoTime();

        System.out.println("반복문 실행 시간: " + (endTime - startTime));
    }
}
