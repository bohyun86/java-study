package library.lang.ex5;

public class Ex5 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            count++;
        }
        System.out.println(count);

        long end = System.currentTimeMillis();

        System.out.println("반복문 실행 시간: " + (end - start) + " milliseconds");
    }
}
