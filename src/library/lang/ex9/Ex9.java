package library.lang.ex9;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();

        String str = "Java 프로그래밍, 문자열 처리 연습";
        System.out.println("문자열 길이: " + str.length());

        int blankCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (' ' == str.charAt(i)) {
                blankCount++;
            }
        }

        System.out.println("공백 수: " + blankCount);


        String[] split = str.split(",");
        int[] splitCount = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            splitCount[i] = split[i].length();
        }
        System.out.println("각 부분 문자열 길이: " + Arrays.toString(splitCount));

        boolean java = str.contains("Java");
        System.out.println("\"Java\" 포함 여부: " + java);
        int i = str.lastIndexOf("프로그래밍");
        System.out.println(i);

        int aCount = 0;
        for (int j = 0; j < str.length(); j++) {
            if ('a' == str.charAt(j)) {
                aCount++;
            }
        }

        System.out.println("\"a\"문자의 수: " + aCount);
    }
}
