package operator;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 논리 연산자
        // 사용자로부터 두 개의 불리언 값을 입력받습니다.
        // 이 두 값에 대해 AND, OR, NOT 연산을 수행하고
        // 각 결과를 출력하는 프로그램을 작성하세요.

        // 활용해보세요.
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        boolean and_op = a && b;
        boolean or_op = a || b;
        boolean not_op_a = !a;
        boolean not_op_b = !b;

        System.out.println(and_op);
        System.out.println(or_op);
        System.out.println(not_op_a);
        System.out.println(not_op_b);
    }
}
