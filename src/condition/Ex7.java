package condition;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*
         삼항연산자를 사용해서 짝수와 홀수를 구별하는 프로그램을 작성해주세요.
         Hint : num % 2
         */
        System.out.println("짝수와 홀수를 구별해줍니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "짝수":"홀수";

        System.out.println("결과는 " + result);
    }
}