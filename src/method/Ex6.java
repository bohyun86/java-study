package method;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int[] scores = new int[0];  // 비어있는 배열로 시작

        // 성적을 관리하는 프로그램
        // 1. 새로운 성적을 배열에 추가
        // 2. 성적의 평균을 계산
        // 3. 최고 성적을 조회
        // 4. 성적 분포를 출력(A, B, C, D, F) (90, 80, 70, 60, 60이하)
        /*
        츨력예시
        성적을 입력하세요 (종료하려면 -1 입력): 85
        성적을 입력하세요 (종료하려면 -1 입력): 92
        성적을 입력하세요 (종료하려면 -1 입력): 74
        성적을 입력하세요 (종료하려면 -1 입력): -1

        입력된 성적:
        85 92 74

        성적의 평균: 83.66666666666667
        최고 성적: 92
        성적 분포:
        A (90 이상): 1
        B (80 이상): 1
        C (70 이상): 1
        D (60 이상): 0
        F (60 미만): 0
         */

        // 1. 새로운 성적을 배열에 추가
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("성적을 입력하세요 (종료하려면 -1 입력) : ");
            int score = scanner.nextInt();
            if (score == -1) {
                break;
            } else {
                scores = addScore(scores,score);
            }
        }

        System.out.println("입력된 성적:");
        for (int i = 0; i < scores.length; i++) {
            if (i == scores.length - 1) {
                System.out.print(scores[i] + "\n\n");
            } else {
                System.out.print(scores[i] + " ");
            }
        }

        // 2. 성적의 평균을 계산
        double avg = calculateAverage(scores);
        System.out.printf("성적의 평균 : %.1f\n", avg);

        // 3. 최고 성적을 조회
        int highScore = findMaxGrade(scores);
        System.out.println("최고 성적 : " + highScore);

        // 4. 성적 분포를 출력
        printScoreDistribution(scores);
    }

    public static int[] addScore(int[] scores, int score) {
        // 성적을 추가하는 메서드
        int[] newScores = new int[scores.length + 1];   // 이전 배열보다 길이가 1만큼 긴 배열
        for (int i = 0; i < scores.length; i++) {
            newScores[i] = scores[i];
        }   // 기존의 배열을 순회하며 새로운 배열에 내용을 복사 한다.
        newScores[newScores.length - 1] = score;
        return newScores;
    }

    public static double calculateAverage(int[] scores) {
        // 평균을 계산하는 매서드
        int sum = 0;
        for (int score:scores) {
            sum += score;
        }
        return sum / (double) scores.length;
    }

    public static int findMaxGrade(int[] scores) {
        int highestScore = scores.length != 0 ? scores[0] : 0 ;
        for (int score:scores) {
            if (highestScore < score) {
                highestScore = score;
            }
        }
        return highestScore;
    }

    public static void printScoreDistribution(int[] scores) {
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        for (int score:scores) {
            if (score > 90) {
                a += 1;
            } else if (score > 80) {
                b += 1;
            } else if (score > 70) {
                c += 1;
            } else if (score > 60) {
                d += 1;
            } else {
                f += 1;
            }
        }

        System.out.printf("성적 분포:\nA (90 이상): %d명\nB (80 이상): %d명\nC (70 이상): %d명\nD (60 이상): %d명\nF (60 미만): %d명", a, b, c, d, f);
    }
}
