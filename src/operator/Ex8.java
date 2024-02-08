package operator;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 사용자로부터 두 정수를 입력받아, 두 정수 중 큰 값을 출력하는 프로그램을 작성하세요.
        // 이때, 조건 연산자(삼항 연산자)를 사용하여 구현하세요.

        // Hint
        Scanner scanner = new Scanner(System.in);
        System.out.println("first와 second값을 입력받은 후 큰 값을 출력합니다.");
        System.out.print("first값을 입력하세요 : ");
        int first = scanner.nextInt();
        System.out.print("second값을 입력하세요 : ");
        int second = scanner.nextInt();
        int result = (first > second) ? first : second;
        System.out.println("큰값은 : " + result);
    }
}