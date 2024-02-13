package loop;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        // 별의 패턴을 반대로 출력하기
        // ****
        // ***
        // **
        // *
        Scanner scanner = new Scanner(System.in);
        System.out.print("나타낼 별의 개수를 입력하세요: ");
        int starNumbers = scanner.nextInt();

        for (int i = 1; i <= starNumbers; i++) {
            for (int j = i; j <= starNumbers; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}