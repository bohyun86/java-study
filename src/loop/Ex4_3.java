package loop;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("홀수 정수 입력: ");
        int n = scanner.nextInt();

        // 상단 다이아몬드
        for (int i = 1; i <= n; i += 2) {
            // 공백 출력
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // * 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }

        // 하단 다이아몬드
        for (int i = n - 2; i > 0; i -= 2) { // `i -= 2`로 변경하여 i를 감소시킵니다.
            // 공백 출력
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // * 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }
    }
}
