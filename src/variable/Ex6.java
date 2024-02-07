package variable;

public class Ex6 {
    public static void main(String[] args) {
        // 프로모션 문제
        int num1 = 10;
        long num2 = 20L;
        long result = num1 + num2;

        // 캐스팅 문제
        double num3 = 10.5;
        int result2 = (int) num3;

        // 프로모션과 캐스팅
        int num4 = 10;
        double num5 = 5.5;
        int result3 = (int) (num4 + num5);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
}
