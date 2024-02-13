package loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 은행 앱
        /*
        ---------------------------------
        1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        ---------------------------------
        선택>
        1. 번을 선택할 경우
        예금액> 10000      -> 잔고에 10000원이 입금
        2. 번을 선택할 경우
        출금액> 1000       -> 잔고에서 1000원이 출금
        3. 번
        잔고액> 9000       -> 잔고액 확인가능
        4. 번
        *프로그램이 종료됩니다"
         */


        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        int balance = 0;

        System.out.print("---------------------------------\n" +
                "1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료\n" +
                "---------------------------------\n");

        while (isRun) {
            int deposit =0, withdraw = 0;
            System.out.print("원하시는 서비스 번호를 입력해주세요: ");
            int selectedNUmber = scanner.nextInt();
            switch (selectedNUmber) {
                case 1:
                    System.out.print("예금액을 입력해주세요\n" + "예금액> ");
                    deposit = scanner.nextInt();
                    balance += deposit;
                    break;
                case 2:
                    System.out.print("출금 금액을 입력해주세요\n" + "출금액> ");
                    withdraw = scanner.nextInt();
                    balance -= withdraw;
                    break;
                case 3:
                    System.out.printf("잔고액> %d\n", balance);
                    break;
                default:
                    System.out.println("프로그램이 종료됩니다");
                    isRun = false;
            }
        }
    }
}
