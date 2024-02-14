package array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 점수를 입력받을 학생수를 입력받고
        // 입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요
        /*
        예시
        학생수는 몇명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수는 몇명인가요? ");
        int studentNumber = scanner.nextInt();
        int[] scores = new int[studentNumber];

        int sum = 0;
        double avg = 0;

        for (int i = 0; i < studentNumber; i++) {
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        avg = sum / scores.length;

        System.out.println(">> 합계: " + sum + ", " + "평균: " + avg);

    }
}