package iostream.ex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("src/iostream/ex/output.txt", true)) {

            System.out.println("텍스트를 입력하세요 ('종료' 입력 시 프로그램 종료):");

            while (true) {
                String input = scanner.nextLine();

                if (input.equals("종료")) {
                    break;
                }
                    writer.write(input + "\n");
            }
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류 발생" + e.getMessage());
        }

    }
}
