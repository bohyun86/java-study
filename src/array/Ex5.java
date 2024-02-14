package array;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 2차원 배열을 활용한 점수 계산 문제
        // 3명의 학생, 과목은 국어, 영어, 수학
        // 의 점수를 입력 받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
        Scanner scanner = new Scanner(System.in);
        int students = 3;
        String[] subjectName = {"국어","영어","수학"};

        int[][] scoresArray = new int[students][subjectName.length];

        for (int i = 0; i < scoresArray.length; i++) {
            int sum = 0;
            System.out.println(i + 1+ "번째 학생입니다. 국어, 영어, 수학 점수를 입력해주세요.");
            for (int j = 0; j < scoresArray[i].length; j++) {
                System.out.print(subjectName[j] + " 점수: ");
                scoresArray[i][j] = scanner.nextInt();
                sum += scoresArray[i][j];
            }
            System.out.println(i + 1 + "번째 학생 점수 합계 : " + sum);
            System.out.printf("%d번째 학생 점수 평균 : %.2f\n", i + 1, (double) sum / scoresArray[i].length);
        }
    }
}
