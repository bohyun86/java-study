package variable;

import java.io.IOException;
import java.util.Scanner;

public class Read2 {

    public static void main(String[] args) throws IOException {

        // 키보드에 입력된 내용을 문자열로 얻기
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.printf(line);
    }
}