package loop;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 구구단 출력하기
        // 사용자로부터 정수 n을 입력받아,
        // n단의 구구단을 출력하는 프로그램을 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        System.out.print("확인할 구구단 단수를 입력하세요(2단부터 입력된 수까지 표시됩니다): ");
        int value = scanner.nextInt();

        for (int i = 2; i <= value; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
               int result = i * j;
                System.out.printf("%d x %d = %d\n", i, j, result);
            }
        }


    }
}