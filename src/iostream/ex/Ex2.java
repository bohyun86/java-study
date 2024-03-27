package iostream.ex;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/iostream/ex/server.log"));
        FileWriter writer = new FileWriter("src/iostream/ex/errorLogs.txt")) {


            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    writer.write(line + "\n");
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("분석 완료. 총 %d개의 에러 로그를 찾았습니다.\n", count);
    }
}
