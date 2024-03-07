package library.util.ex;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder secretCode = new StringBuilder();
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int i1 = random.nextInt(charSet.length() + 1);
            char secretChar = charSet.charAt(i1);
            secretCode.append(String.valueOf(secretChar));
        }

        System.out.println(secretCode);

    }
}
