package method;

public class Ex2 {
    public static void main(String[] args) {
        // 세 수를 입력받아 합계와 평균을 구하는 메소드를 만들어주세요.
        int sum;
        double avg;
        sum = sum(3,4,5);
        System.out.println("sum = " + sum);
        avg = avg(3,4,5);
        System.out.println("avg = " + avg);
    }

    public static int sum(int x, int y, int z) {
        // 합계 구하기
        return x + y + z;
    }

    public static double avg(int x, int y, int z) {
        // 평균 구하기
        return (x + y + z) / 3.0;
    }
}
