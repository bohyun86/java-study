package iostream.file.ex;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("병합할 파일의 개수를 입력하세요: ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("파일경로를 입력하세요:");
            String path1 = scanner.nextLine();
            File file1 = new File(path1);
            try (BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/iostream/file/ex/merged.txt"));
                 BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line + "\n");
                }
                bufferedWriter.write("-----\n");
            } catch (IOException e) {
                System.out.println("입/출력 오류" + e.getMessage());
            }
        }

        System.out.println("파일 병합 완료.");
    }
}
