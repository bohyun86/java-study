package condition;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        /* 계절 판별하기
        사용자로부터 월을 나타내는 숫자(1~12)를 입력받아,
        해당 월이 어느 계절에 속하는지를 출력하는 프로그램을 작성하세요.
        예를 들어, 3월부터 5월까지는 "봄", 6월부터 8월까지는 "여름",
        9월부터 11월까지는 "가을", 12월, 1월, 2월은 "겨울"입니다.
         */

        System.out.println("월에 해당하는 계절을 출력합니다.");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("월을 입력해주세요 : ");
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            default:
                System.out.println("가을");
                break;
        }
    }
}
