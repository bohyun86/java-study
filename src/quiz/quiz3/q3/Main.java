package quiz.quiz3.q3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("숫자 1을 입력하세요: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("숫자 2을 입력하세요: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            int result = num1 / num2;

            System.out.println("결과: " + result);
        } catch (InputMismatchException e) {
            System.out.println("유효한 숫자를 입력해주세요");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        scanner.close();
    }
}
