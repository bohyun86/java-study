package exception.ex.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"문제 1: 3 + 5 = ?", "문제 1: 2 + 7 = ?", "문제 1: 4 + 6 = ?"};
        int[] answers = {8, 9, 10};
        int count = 0;


        for (int i = 0; i < answers.length; i++) {
            System.out.println(questions[i]);
            System.out.print("답변: ");
            int answer = 0;
            try {
                answer = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자로만 답해주세요");
                scanner.nextLine();
            }

            if (answers[i] == answer) {
                count += 1;
            }
        }

        System.out.println("총 3문제 중 " + count + "문제를 맞혔습니다!");

        scanner.close();
    }
}
