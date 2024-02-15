package method;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 두 정수와 연산기호를 매개변수로 받아 연산 결과를 리턴하는 메서드를 작성하세요.
        // 메서드 이름 : calculate
        /* 호출 예시
        첫 번째 정수를 입력하세요: 10
        두 번째 정수를 입력하세요: 20
        연산 기호를 입력하세요: +
        연산 결과: 30
         */
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int first = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int second = scanner.nextInt();
        System.out.print("연산 기호를 입력하세요: ");
        String operation = scanner.next();
        double result;

        switch (operation) {
            case "+":
                result = first + second;
                System.out.println("연산 결과: " + (int) result);
                break;
            case "-":
                result = first - second;
                System.out.println("연산 결과: " + (int) result);
                break;
            case "*":
                result = first * second;
                System.out.println("연산 결과: " + (int) result);
                break;
            case "/":
                result = first / (double) second;
                System.out.printf("연산 결과: %.1f", result);
                break;
            default:
                System.out.println("올바른 연산 기호를 입력해주세요. (Ex: +, -, *, /)");
        }
    }
}