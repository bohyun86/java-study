package library.lang;

public class MathClass {
    public static void main(String[] args) {
        // Math 클래스: 수학 계산
        // 모든 메서드가 static 메서드
        double num1 = -10.5;
        double num2 = 4.5;

        System.out.println("절대값: " + Math.abs(num1));
        System.out.println("올림: " + Math.ceil(num1));
        System.out.println("내림: " + Math.floor(num1));
        System.out.println("최소값: " + Math.min(num1, num2));
        System.out.println("최대값: " + Math.max(num1, num2));
        System.out.println("제곱: " + Math.pow(4, 3));
        System.out.println("제곱근: " + Math.sqrt(16));
        // 0 ~ 1 까지 랜덤 수 반환
        System.out.println("랜덤값: " + Math.random());
        System.out.println("반올림: " + Math.round(num2));
        System.out.println("사인: " + Math.sin(num2));
        System.out.println("코사인: " + Math.cos(num2));
        System.out.println("탄젠트: " + Math.tan(num2));
        System.out.println("자연로그: " + Math.log(Math.E));

        // 임의의 주사위 눈 얻기 (1~6)
        // 0.0 <= Math.random() < 1.0 + 6
        // 0.0 <= Math.random() < 1.0 + 6
        // (int) (0.0 * 6) <- int (Math.random() * 6) < int (1.0 * 6)
    }
}
