package library.lang;

public class SystemTime {
    public static void main(String[] args) throws InterruptedException {
        // 현재 시간을 milli초(1/1000) 단위로 반환
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        long time2 = System.currentTimeMillis();
        System.out.println(currentTime);

        // 현재 시간을 더 높은 정밀도 nano초(1/1,000,000,000)로 반환
        long nanoTime1 = System.nanoTime();
        System.out.println("nanoTime1 = " + nanoTime1);
        long nanoTime2 = System.nanoTime();
        System.out.println("nanoTime2 = " + nanoTime2);

        // 시간 측정
        long startTime = System.currentTimeMillis();

        // 시간 측정 하고 싶은 작업
        Thread.sleep(3000); // 3초 스레드를 잠재움

        // 작업 이후의 시간 측정
        long endTime = System.currentTimeMillis();

        System.out.println("작업 경과시간 : " + (endTime - startTime));

    }
}
