package library.lang.ex.ex11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        String str = "데이터 분석과 프로그래밍은 매우 재미있어요";

        String[] strArray = str.split(" ");

        int maxLength = 0;
        String result = "";
        for (String string:strArray) {
            if (string.length() > maxLength) {
                maxLength = string.length();
                result = string;
            }
        }
        System.out.println(result);
    }
}
