package operator;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 두 개의 정수 a와 b를 사용자로부터 입력받습니다.
        // 이 두 수에 대해 더하기, 빼기, 곱하기, 나누기, 나머지 연산을 수행하고
        // 결과를 출력하는 프로그램을 작성하세요.

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 a를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("정수 b를 입력하세요 : ");
        int b = scanner.nextInt();

        System.out.println("더하기 : " + (a + b));
        System.out.println("빼기 : " + (a - b));
        System.out.println("나누기 : " + (a / b));
        System.out.println("곱하기 : " + (a * b));
    }
}
