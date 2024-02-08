package condition;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");
        int score = scanner.nextInt();

        // 점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C
        // 70점 미만이면 D

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
