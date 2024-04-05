package quiz.quiz7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("텍스트를 입력하세요 ('종료'입력시 프로그램 종료): ");
        try (BufferedWriter out = new BufferedWriter(new FileWriter("src/quiz/quiz7/output.txt", true))) {
            boolean isEnd = false;
            while (true) {

                String msg = scanner.nextLine();
                if (msg.equals("종료")) {
                    break;
                }

                out.write(msg);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
