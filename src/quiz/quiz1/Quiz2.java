package quiz.quiz1;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end, sumOdd = 0;

        System.out.println("입력해주신 두 숫자 사이의 짝수의 합을 구합니다.");
        System.out.print("시작 정수: ");
        start = scanner.nextInt();
        System.out.print("끝 정수: ");
        end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumOdd += i;
                if (i < end - 1) {
                    System.out.print(i + " + ");
                } else {
                    System.out.print(i);
                }
            }
        }

        System.out.println(" = " +sumOdd);


    }
}
