package exception.ex.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("숫자 1을 입력하세요: ");
            int n = scanner.nextInt();
            System.out.printf("숫자 2을 입력하세요: ");
            int m = scanner.nextInt();
            scanner.nextLine();
            double result = n / m;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("유효한 숫자를 입력해주세요.");
        }
    }
}
