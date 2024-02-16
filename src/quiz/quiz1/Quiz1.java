package quiz.quiz1;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exchangeRate = 1350;
        int exchangeToWon = 0;

        while (true) {
            System.out.print("환전할 달러를 입력해주세요 : ");
            int dollar = scanner.nextInt();
            if (dollar == 0) {
                System.out.println("환전할 금액이 없습니다.");
                break;
            } else if (dollar < 0) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            } else {
                exchangeToWon = dollar * exchangeRate;
                System.out.println("환전금액은 " + exchangeToWon + "원 입니다.");
                break;
            }
        }
    }
}
