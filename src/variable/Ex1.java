package variable;

public class Ex1 {
    public static void main(String[] args) {
        // 연습문제 1: 5와 3을 다른 숫자로 한번에 변경할 수 있게 변수로 선언해주세요.
        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);

        // 정답
        int a = 5, b = 3;
        int plus = a + b;
        int minus = a - b;
        int multiple = a * b;
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiple);

    }
}
