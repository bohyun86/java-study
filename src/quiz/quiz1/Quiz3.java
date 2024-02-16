package quiz.quiz1;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        int studentNum, sum = 0;
        double avg;

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수는 몇명인가요? : ");
        studentNum = scanner.nextInt();
        int[] scores = new int[studentNum];

        System.out.println("점수를 입력하세요");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        avg = sum / scores.length;
        System.out.printf("합계: %d, 평균: %.1f", sum, avg);
    }
}
