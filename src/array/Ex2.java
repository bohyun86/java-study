package array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 5개의 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요.
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        int[] score = new int[count];

        for (int i = 0; i < count; i++) {
            score[i] = scanner.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }

    }
}
