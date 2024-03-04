package exception.ex.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        try {
            if (ageCheck(age)) {
                throw new InvalidAgeException();
            } else {
                System.out.println("접근이 허용되었습니다.");
            }
        } catch (InvalidAgeException e) {
        }
        scanner.close();
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return false;
        } else {
            return true;
        }
    }
}
