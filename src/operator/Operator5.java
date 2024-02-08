package operator;

public class Operator5 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = ++x;       // 전위(Prefix) 증가 연산자
                        // x의 값을 먼저 증가 시키고, 그 결과를 y에 대입
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        // 후위(Postfix) 증가 연산자 사용

        x = 1;
        y = 0;
        y = x++;
        System.out.println("y = " + y);
        System.out.println("x = " + x);


    }
}
